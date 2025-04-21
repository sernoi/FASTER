package Crop;

import Crop.Harvest.*;
import Crop.Harvest.HarvestServiceImpl;
import Util.*;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import net.proteanit.sql.DbUtils;

public class CropServiceImpl implements CropService {

    CropPanel cp;
    CropDAO dao = new CropDAOImpl();
    HarvestDAO hdao = new HarvestDAOImpl();
    public CropServiceImpl(CropPanel cp) {
        this.cp = cp;
        displayAllCrops();
    }

    @Override
    public void addCrop() {
        cp.addDialog.setTitle("Add Crop");
        cp.addDialog.setModal(true);
        cp.addDialog.pack();
        cp.addDialog.setLocationRelativeTo(null);
        cp.addDialog.setVisible(true);
        clearFields();
    }

    @Override
    public void clearFields() {
        JTextField text = (JTextField) cp.beneCB.getEditor().getEditorComponent();
        text.setText("");
        cp.cropTF.setText("");
        cp.areaSpin.setValue(0);
        cp.varietyTF.setText("");
        cp.classificationTF.setText("");
        cp.remarksTA.setText("");

        JTextField text1 = (JTextField) cp.beneCB1.getEditor().getEditorComponent();
        text1.setText("");
        cp.cropTF1.setText("");
        cp.areaSpin1.setValue(0);
        cp.varietyTF1.setText("");
        cp.classificationTF1.setText("");
        cp.remarksTA1.setText("");

        cp.formTF.setText("");
        cp.qtySpin.setValue(0);
        cp.profitSpin.setValue(0);
        cp.dateDC.setDate(new Date());
        cp.remarksTA2.setText("");
    }

    @Override
    public void deleteCrop() {
        int dataRow = cp.table.getSelectedRow();
        if (dataRow >= 0) {
            String id = cp.table.getValueAt(dataRow, 0).toString();
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(cp, "Would You Like to "
                    + "delete crop: " + id + "?", "Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {
                dao.deleteCrop(id);
                displayAllCrops();
            }
        } else {
            JOptionPane.showMessageDialog(cp, "Please select a crop to delete.");
        }
    }

    @Override
    public void displayAllCrops() {
        ResultSet rs = dao.getAllCrop();
        cp.table.setModel(DbUtils.resultSetToTableModel(rs));
        new SearchModel(cp, cp.table, cp.searchTF, rs);
    }

    @Override
    public void editCrop() {
        int dataRow = cp.table.getSelectedRow();
        if (dataRow >= 0) {
            cp.idLbl.setText(cp.table.getValueAt(dataRow, 0).toString());
            cp.cropTF1.setText(cp.table.getValueAt(dataRow, 2).toString());
            cp.areaSpin1.setValue(Double.parseDouble(cp.table.getValueAt(dataRow, 3).toString()));
            cp.varietyTF1.setText(cp.table.getValueAt(dataRow, 4).toString());
            cp.classificationTF1.setText(cp.table.getValueAt(dataRow, 5).toString());

            try {
                Date date;
                date = new SimpleDateFormat("yyyy-MM-dd").parse(cp.table.getValueAt(dataRow, 6).toString());
                cp.expDC1.setDate(date); //dob
            } catch (ParseException ex) {
                Logger.getLogger(CropServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            }

            cp.remarksTA1.setText(cp.table.getValueAt(dataRow, 7).toString());
            cp.editDialog.setTitle("Edit Crop");
            cp.editDialog.setModal(true);
            cp.editDialog.pack();
            cp.editDialog.setLocationRelativeTo(cp);
            cp.editDialog.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(cp, "Please select crop to edit.");
        }
    }

    @Override
    public void harvestCrop() {
        int dataRow = cp.table.getSelectedRow();
        if (cp.table.getValueAt(dataRow, 8).toString().equals("Harvested")) {
            JOptionPane.showMessageDialog(null, "Crop already harvested!");
        } else {
            if (dataRow >= 0) {
                cp.idHLbl.setText(cp.table.getValueAt(dataRow, 0).toString());
                cp.harvestDialog.setTitle("Harveset Crop/Tree");
                cp.harvestDialog.setModal(true);
                cp.harvestDialog.pack();
                cp.harvestDialog.setLocationRelativeTo(null);
                cp.harvestDialog.setVisible(true);
                clearFields();
            } else {
                JOptionPane.showMessageDialog(cp, "Please select crop to harvest.");
            }
        }
    }

    @Override
    public void saveCrop() {
        JTextField text = (JTextField) cp.beneCB.getEditor().getEditorComponent();
        String str = text.getText();
        CropModel crop = new CropModel();
        crop.setBeneID(Integer.parseInt(str.substring(str.indexOf(":") + 1, str.indexOf(")"))));
        crop.setCrop(cp.cropTF.getText());
        crop.setArea(Alter.getDouble(cp.areaSpin));
        crop.setVariety(cp.varietyTF.getText());
        crop.setClassification(cp.classificationTF.getText());
        crop.setDate(((JTextField) cp.expDC.getDateEditor().getUiComponent()).getText());
        crop.setRemarks(cp.remarksTA.getText());
        dao.saveCrop(crop);
        cp.addDialog.dispose();
        displayAllCrops();
    }

    @Override
    public void saveHarvest() {
        HarvestModel hrvst = new HarvestModel();
        hrvst.setHarvestID(Integer.parseInt(cp.idHLbl.getText()));
        hrvst.setCrop(cp.formTF.getText());
        hrvst.setQty(Alter.getInt(cp.qtySpin));
        hrvst.setProfit(Alter.getDouble(cp.profitSpin));
        hrvst.setDate(Alter.gatDate(cp.dateDC));
        hrvst.setRemarks(cp.remarksTA2.getText());
        hdao.saveHarvest(hrvst);

        hdao.updateCropHarvested(Integer.parseInt(cp.idHLbl.getText()));
        JOptionPane.showMessageDialog(null, "Crop Harvested!");
        cp.harvestDialog.dispose();
        displayAllCrops();
    }

    @Override
    public void updateCrop() {
        JTextField text = (JTextField) cp.beneCB1.getEditor().getEditorComponent();
        String str = text.getText();
        CropModel crop = new CropModel();
        crop.setCropID(Integer.parseInt(cp.idLbl.getText()));
        crop.setBeneID(Integer.parseInt(str.substring(str.indexOf(":") + 1, str.indexOf(")"))));
        crop.setCrop(cp.cropTF.getText());
        crop.setArea(Alter.getDouble(cp.areaSpin));
        crop.setVariety(cp.varietyTF.getText());
        crop.setClassification(cp.classificationTF.getText());
        crop.setDate(((JTextField) cp.expDC.getDateEditor().getUiComponent()).getText());
        crop.setRemarks(cp.remarksTA.getText());
        dao.updateCrop(crop);
        cp.editDialog.dispose();
        displayAllCrops();
    }

    @Override
    public void viewCrop() {
        int dataRow = cp.table.getSelectedRow();
        if (dataRow >= 0) {
            JOptionPane.showMessageDialog(cp,
                    "ID: " + (cp.table.getValueAt(dataRow, 0).toString()) + "\n"
                    + "Beneficiary: " + (cp.table.getValueAt(dataRow, 1).toString()) + "\n"
                    + "Crop/Tree: " + (cp.table.getValueAt(dataRow, 2).toString()) + "\n"
                    + "Area: " + (cp.table.getValueAt(dataRow, 3).toString()) + "\n"
                    + "Variety: " + (cp.table.getValueAt(dataRow, 4).toString()) + "\n"
                    + "Classification: " + (cp.table.getValueAt(dataRow, 5).toString()) + "\n"
                    + "Exp Harvest Date: " + (cp.table.getValueAt(dataRow, 6).toString()) + "\n"
                    + "Remarks: " + (cp.table.getValueAt(dataRow, 7).toString()),
                    "Crop Info", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(cp, "Please select crop to edit.");
        }
    }

    @Override
    public void cropMouse(MouseEvent e) {
        int r = cp.table.rowAtPoint(e.getPoint());
        if (r >= 0 && r < cp.table.getRowCount()) {
            cp.table.setRowSelectionInterval(r, r);
        } else {
            cp.table.clearSelection();
        }

        int rowindex = cp.table.getSelectedRow();
        if (rowindex < 0) {
            return;
        }
        if (e.isPopupTrigger() && e.getComponent() instanceof JTable) {
            JPopupMenu popup = new JPopupMenu();
            popup.show(cp, e.getX(), e.getY());
            cp.table.setComponentPopupMenu(cp.popUpMenu);
        }
    }

    @Override
    public void cropPopup() {
        SwingUtilities.invokeLater(() -> {
            int rowAtPoint = cp.table.rowAtPoint(SwingUtilities.
                    convertPoint(cp.popUpMenu, new Point(0, 0), cp.table));
            if (rowAtPoint > -1) {
                cp.table.setRowSelectionInterval(rowAtPoint, rowAtPoint);
            }
        });
    }

}
