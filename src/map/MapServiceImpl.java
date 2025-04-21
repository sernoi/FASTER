package Map;

import Evacuation.*;
import Main.MainFrame;
import Util.Alter;
import Util.MapUtil.*;
import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.jxmapviewer.JXMapViewer;
import org.jxmapviewer.painter.CompoundPainter;
import org.jxmapviewer.painter.Painter;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.viewer.WaypointPainter;

public class MapServiceImpl implements MapService {

    MapPanel mpp;
    MainFrame mf;
    JXMapViewer mapViewer;
    MapDAO dao = new MapDAOImpl();
    EvacuationDAO edao = new EvacuationDAOImpl();
    Color disColor = new Color(255, 0, 0, 150);
    int index = 0;
    Painter<JXMapViewer> origOverLay;
    List<Painter<JXMapViewer>> painters;
    CompoundPainter<JXMapViewer> painter;

    ArrayList<Integer> availableSites = new ArrayList<Integer>();
    ArrayList<Integer> affectedBene = new ArrayList<Integer>();

    double sx = 0;
    double sy = 0;
    double lt = 0, lg = 0, rad = 0;

    //innermost -------------------------------------------- outermost
    int z1 = 32;
    int z2 = 16;
    int z3 = 8;
    int z4 = 4;
    int z5 = 2;
    int z6 = 1;
    int zoomMult = 1;
    int zoomValue = 7;

    //sets the delay and zoom of scan
    int delay = 10;
    int scanZoom = 1;

    public MapServiceImpl(MapPanel mpp, MainFrame mf) {
        this.mpp = mpp;
        this.mf = mf;
        //invokes the generateMap method from the MapGenerate Class
        mapViewer = MapGenerate.generateMap();
        mpp.mapJPanel.add(mapViewer);

        origOverLay = (Painter<JXMapViewer>) mapViewer.getOverlayPainter();
        painters = new ArrayList<Painter<JXMapViewer>>();

        // Create a compound painter that uses both the route-painter and the waypoint-painter
        painters.clear();
        painters.add(origOverLay);

        painter = new CompoundPainter<JXMapViewer>(painters);
        mapViewer.setOverlayPainter(painter);
        mapViewer.repaint();

        Object beneObj = putAllBeneInMap();
        Object evacObj = putAllEvacInMap();
        Object hazardObj = putAllHazardInMap();

        painters.add((WaypointPainter<MyWaypoint>) beneObj);
        painter = new CompoundPainter<JXMapViewer>(painters);
        mapViewer.setOverlayPainter(painter);
        mapViewer.repaint();

        painters.add((WaypointPainter<MyWaypoint>) evacObj);
        painter = new CompoundPainter<JXMapViewer>(painters);
        mapViewer.setOverlayPainter(painter);
        mapViewer.repaint();

        painters.add((WaypointPainter<MyWaypoint>) hazardObj);
        painter = new CompoundPainter<JXMapViewer>(painters);
        mapViewer.setOverlayPainter(painter);
        mapViewer.repaint();

        origOverLay = (Painter<JXMapViewer>) mapViewer.getOverlayPainter();

        CardLayout cl = (CardLayout) (mf.mainPanel.getLayout());
        mf.mainPanel.add(this.mpp, "MapPanel");
        cl.show(mf.mainPanel, "MapPanel");

    }

    @Override
    public WaypointPainter<MyWaypoint> putAllBeneInMap() {
        ArrayList<Integer> beneList = dao.getAllBene();
        ArrayList<String> geoList = dao.getAllBeneGeo();
        Set<MyWaypoint> waypoints = new HashSet<MyWaypoint>(Arrays.asList());

        for (int x = 0; x < beneList.size(); x++) {
            String latLong = geoList.get(x);
            double latDbl = Double.parseDouble(latLong.substring(0, latLong.indexOf(",")));
            double longDbl = Double.parseDouble(latLong.substring(latLong.indexOf(",") + 1));
            waypoints.add(new MyWaypoint("B" + beneList.get(x), Color.white,
                    new GeoPosition(latDbl, longDbl)));
        }
        // Create a waypoint painter that takes all the waypoints
        WaypointPainter<MyWaypoint> waypointPainter = new WaypointPainter<MyWaypoint>();
        waypointPainter.setWaypoints(waypoints);
        waypointPainter.setRenderer(new FancyWaypointRenderer());

        return waypointPainter;
    }

    @Override
    public WaypointPainter<MyWaypoint> putAllEvacInMap() {
        ArrayList<Integer> evacList = dao.getAllEvac();
        ArrayList<String> geoList = dao.getAllEvacGeo();
        Set<MyWaypoint> waypoints = new HashSet<MyWaypoint>(Arrays.asList());

        for (int x = 0; x < evacList.size(); x++) {
            String latLong = geoList.get(x);
            double latDbl = Double.parseDouble(latLong.substring(0, latLong.indexOf(",")));
            double longDbl = Double.parseDouble(latLong.substring(latLong.indexOf(",") + 1));
            waypoints.add(new MyWaypoint("E" + evacList.get(x), Color.GREEN,
                    new GeoPosition(latDbl, longDbl)));
        }
        // Create a waypoint painter that takes all the waypoints
        WaypointPainter<MyWaypoint> waypointPainter = new WaypointPainter<MyWaypoint>();
        waypointPainter.setWaypoints(waypoints);
        waypointPainter.setRenderer(new FancyWaypointRenderer1());
        return waypointPainter;
    }

    @Override
    public WaypointPainter<MyWaypoint> putAllHazardInMap() {
        ArrayList<Integer> hazardList = dao.getAllHazard();
        ArrayList<String> geoList = dao.getAllHazardGeo();
        Set<MyWaypoint> waypoints = new HashSet<MyWaypoint>(Arrays.asList());

        for (int x = 0; x < hazardList.size(); x++) {
            String latLong = geoList.get(x);
            double latDbl = Double.parseDouble(latLong.substring(0, latLong.indexOf(",")));
            double longDbl = Double.parseDouble(latLong.substring(latLong.indexOf(",") + 1));
            waypoints.add(new MyWaypoint("H" + hazardList.get(x), Color.YELLOW,
                    new GeoPosition(latDbl, longDbl)));
        }
        // Create a waypoint painter that takes all the waypoints
        WaypointPainter<MyWaypoint> waypointPainter = new WaypointPainter<MyWaypoint>();
        waypointPainter.setWaypoints(waypoints);
        waypointPainter.setRenderer(new FancyWaypointRenderer2());
        return waypointPainter;
    }

    @Override
    public void showDisaster(double lt, double lg, double rad) {
        int currentZoom = mapViewer.getZoom();
        switch (currentZoom) {
            case 1:
                zoomMult = z1;
                break;
            case 2:
                zoomMult = z2;
                break;
            case 3:
                zoomMult = z3;
                break;
            case 4:
                zoomMult = z4;
                break;
            case 5:
                zoomMult = z5;
                break;
            case 6:
                zoomMult = z6;
                break;
        }
        Point2D pt = mapViewer.convertGeoPositionToPoint(new GeoPosition(
                lt,
                lg));
        double val = rad;
        Painter<JXMapViewer> ovalOverlay = new Painter<JXMapViewer>() {
            public void paint(Graphics2D g, JXMapViewer map, int w, int h) {
                myShape(g,
                        pt.getX() - (MapDimension.ovalW * val) / 2 * zoomMult,
                        pt.getY() - (MapDimension.ovalH * val) / 2 * zoomMult,
                        (MapDimension.ovalW * val) * zoomMult,
                        (MapDimension.ovalH * val) * zoomMult);
                //g.drawString(str, h, h);
            }
        };
        painters.clear();
        painters.add(origOverLay);
        painters.add(ovalOverlay);
        CompoundPainter<JXMapViewer> painter = new CompoundPainter<JXMapViewer>(painters);
        mapViewer.setOverlayPainter(painter);
    }

    @Override
    public void myShape(Graphics2D g, double xCoord, double yCoord, double w, double h) {
        /* Enable anti-aliasing and pure stroke */
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);

        /* Construct a shape and draw it */
        Ellipse2D.Double shape = new Ellipse2D.Double(xCoord, yCoord, w, h);
        g.setPaint(disColor);
        g.fill(shape);
    }

    @Override
    public void scanOverLay() {
        scanZoom = Alter.getInt(mpp.zoomCBB);
        affectedBene.clear();
        availableSites.clear();
        mpp.remove(mpp.controlPanel);
        mpp.revalidate();
        mpp.repaint();
        //origOverLay = (Painter<JXMapViewer>) mapViewer.getOverlayPainter();
        ArrayList<Integer> beneList = dao.getAllBene();
        ArrayList<String> geoBeneList = dao.getAllBeneGeo();
        ArrayList<Integer> evacList = dao.getAllEvac();
        ArrayList<String> geoEvacList = dao.getAllEvacGeo();
        mapViewer.setZoom(scanZoom);

        for (int x = 0; x < beneList.size(); x++) {
            String latLong = geoBeneList.get(x);
            double latDbl = Double.parseDouble(latLong.substring(0, latLong.indexOf(",")));
            double longDbl = Double.parseDouble(latLong.substring(latLong.indexOf(",") + 1));
            mapViewer.setCenterPosition(new GeoPosition(latDbl, longDbl));
            showDisaster(Double.parseDouble(mpp.ltLbl.getText()),
                    Double.parseDouble(mpp.lgLbl.getText()),
                    Double.parseDouble(mpp.radLbl.getText()));
            if (isAffected()) {
                affectedBene.add(beneList.get(x));
            }
        }

        for (int x = 0; x < evacList.size(); x++) {
            String latLong = geoEvacList.get(x);
            double latDbl = Double.parseDouble(latLong.substring(0, latLong.indexOf(",")));
            double longDbl = Double.parseDouble(latLong.substring(latLong.indexOf(",") + 1));
            mapViewer.setCenterPosition(new GeoPosition(latDbl, longDbl));
            showDisaster(Double.parseDouble(mpp.ltLbl.getText()),
                    Double.parseDouble(mpp.lgLbl.getText()),
                    Double.parseDouble(mpp.radLbl.getText()));
            if (!isAffected()) {
                availableSites.add(evacList.get(x));
            }
        }
        disColor = new Color(0, 0, 0, 0);
        mpp.evacBtn.setEnabled(true);
        mpp.add(mpp.controlPanel, BorderLayout.EAST);
        mpp.revalidate();
        mpp.repaint();

        JOptionPane.showMessageDialog(null, "Scan Finished");
        disColor = new Color(255, 0, 0, 150);
        mapViewer.setCenterPosition(new GeoPosition(10.999783, 122.526848));
        showDisaster(Double.parseDouble(mpp.ltLbl.getText()),
                Double.parseDouble(mpp.lgLbl.getText()),
                Double.parseDouble(mpp.radLbl.getText()));

        EvacuationPanel evac = new EvacuationPanel();
        new EvacuationServiceImpl(affectedBene, availableSites, mpp);
        new EvacuationController(evac);
        displayEvacInfo();
    }

    @Override
    public boolean isAffected() {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException ex) {
            Logger.getLogger(MapServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {

            System.out.println("Could not create color picker robot");
        }
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenX = (int) screenSize.getWidth() / 2;
        int screenY = (int) screenSize.getHeight() / 2;
        //Color pixelColor1 = robot.getPixelColor(screenX - 1,screenY + 18);
        //Color pixelColor2 = robot.getPixelColor(screenX ,screenY + 18);
        Color pixelColor3 = robot.getPixelColor(screenX, screenY + 18);

        try {
            Thread.sleep(delay);
        } catch (InterruptedException ex) {
            Logger.getLogger(MapServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        //         ((pixelColor1.getRed() == 254 && pixelColor1.getBlue() == 253) ||
        //   (pixelColor2.getRed() == 254 && pixelColor2.getBlue() == 253)) && 
        if (pixelColor3.getRed() == 255 && pixelColor3.getBlue() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Integer> getAvailableSites() {
        return availableSites;
    }

    public ArrayList<Integer> getAffectedBene() {
        return affectedBene;
    }

    @Override
    public void displayEvacInfo() {
        int total = 0;
        this.mpp.infoTA.setText("");
        int dis_id = Alter.toInt(mpp.idLbl.getText());
        ArrayList<String> list = edao.getEvacuationInfo(dis_id);

        for (int x = 0; x < list.size(); x = x + 3) {
            total = total + 1;
            this.mpp.infoTA.append("Beneficiary, " + list.get(x) + ", ");
            this.mpp.infoTA.append("with " + list.get(x + 1) + " family members ");
            this.mpp.infoTA.append("evacuated to " + list.get(x + 2) + ".\n");
            total = total + Alter.toInt(list.get(x + 1));
        }
        this.mpp.infoTA.append("Total number of evacuees: " + total);
        //System.out.println(list);
        //TODO check if correct ang hatag ya nga list
        //mpp.viewDialog.setTitle("Evacuation Info");
        mpp.viewDialog.setModal(true);
        mpp.viewDialog.pack();
        mpp.viewDialog.setLocationRelativeTo(null);
        mpp.viewDialog.setVisible(true);
    }

    @Override
    public void viewMap() {
        JTextField text = (JTextField) mpp.disasterCBB.getEditor().getEditorComponent();
        String str = text.getText();
        ArrayList<String> list = (dao.getDisaster(Integer.parseInt(str.substring(str.indexOf(":") + 1, str.indexOf(")")))));
        mpp.idLbl.setText(list.get(0));
        mpp.typeLbl.setText(list.get(1));
        mpp.nameLbl.setText(list.get(2));
        mpp.dateLbl.setText(list.get(3));
        mpp.ltLbl.setText(list.get(4));
        mpp.lgLbl.setText(list.get(5));
        mpp.radLbl.setText(list.get(6));
        mpp.remarksTA.setText(list.get(7));
        showDisaster(Double.parseDouble(list.get(4)),
                Double.parseDouble(list.get(5)),
                Double.parseDouble(list.get(6)));
        mpp.evacBtn.setEnabled(true);
        mpp.viewEvacBtn.setEnabled(true);

        mapViewer.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                showDisaster(
                        Double.parseDouble(list.get(4)),
                        Double.parseDouble(list.get(5)),
                        Double.parseDouble(list.get(6)));
            }
        });

        mapViewer.addMouseWheelListener(new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                showDisaster(
                        Double.parseDouble(list.get(4)),
                        Double.parseDouble(list.get(5)),
                        Double.parseDouble(list.get(6)));
            }
        });
    }

    @Override
    public void evacBtn() {
        mf.setExtendedState(JFrame.MAXIMIZED_BOTH);
        disColor = new Color(255, 0, 0, 255);
        mpp.evacBtn.setEnabled(false);
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(() -> {
            scanOverLay();
        });
    }

    @Override
    public void viewEvac() {
        if (edao.isDisasterExist(Integer.parseInt(mpp.idLbl.getText()))) {
            displayEvacInfo();
        } else {
            JOptionPane.showMessageDialog(null, "No evacuation info yet!\nDo evacuation first");
        }
    }
}


