package Admin;

import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.WindowListener;
import javax.swing.event.PopupMenuListener;

public class AdminPanel extends javax.swing.JPanel {

    /**
     * Creates new form OwnerPanel
     */
    public AdminPanel() {

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addAdminDialog = new javax.swing.JDialog();
        addAdminPanel = new javax.swing.JPanel();
        departmentCB = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        unTF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        fNameTF = new javax.swing.JTextField();
        saveAdminBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        resetAdminBtn = new javax.swing.JButton();
        mNameTF = new javax.swing.JTextField();
        positionCB = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lNameTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        editAdminDialog = new javax.swing.JDialog();
        addAdminPanel1 = new javax.swing.JPanel();
        departmentCB1 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPasswordField3 = new javax.swing.JPasswordField();
        unTF1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPasswordField4 = new javax.swing.JPasswordField();
        fNameTF1 = new javax.swing.JTextField();
        updateAdminBtn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        resetAdminBtn1 = new javax.swing.JButton();
        mNameTF1 = new javax.swing.JTextField();
        positionCB1 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lNameTF1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        oldIdTF = new javax.swing.JLabel();
        popupmenu = new javax.swing.JPopupMenu();
        viewAdminMenuItem = new javax.swing.JMenuItem();
        editAdminMenuItem = new javax.swing.JMenuItem();
        addAdminMenuItem = new javax.swing.JMenuItem();
        deleteAdminMenuItem = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        searchTF = new javax.swing.JTextField();
        addAdminBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        adminTable = new javax.swing.JTable();
        editAdminBtn = new javax.swing.JButton();
        deleteAdminBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        addAdminDialog.setBackground(new java.awt.Color(51, 51, 51));
        addAdminDialog.setResizable(false);

        addAdminPanel.setBackground(new java.awt.Color(69, 73, 84));

        departmentCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MSWDO", "MDRRMO", "MAO", "MPDO", "VIEWER" }));
        departmentCB.setBorder(null);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Password");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Username:");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Confirm Password");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("First Name:");

        saveAdminBtn.setBackground(new java.awt.Color(51, 255, 255));
        saveAdminBtn.setText("Save");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Middle Name:");

        resetAdminBtn.setBackground(new java.awt.Color(51, 255, 255));
        resetAdminBtn.setText("Reset");

        positionCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Head", "Staff" }));
        positionCB.setBorder(null);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Last Name:");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Position:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Department");

        javax.swing.GroupLayout addAdminPanelLayout = new javax.swing.GroupLayout(addAdminPanel);
        addAdminPanel.setLayout(addAdminPanelLayout);
        addAdminPanelLayout.setHorizontalGroup(
            addAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addAdminPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(addAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(addAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(addAdminPanelLayout.createSequentialGroup()
                            .addGroup(addAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(addAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPasswordField2, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                                .addComponent(jPasswordField1)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addAdminPanelLayout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(saveAdminBtn)
                            .addGap(30, 30, 30)
                            .addComponent(resetAdminBtn)
                            .addGap(139, 139, 139)))
                    .addGroup(addAdminPanelLayout.createSequentialGroup()
                        .addGroup(addAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(departmentCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lNameTF)
                            .addComponent(mNameTF)
                            .addComponent(fNameTF)
                            .addComponent(unTF, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(positionCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        addAdminPanelLayout.setVerticalGroup(
            addAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addAdminPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(departmentCB, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(positionCB, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveAdminBtn)
                    .addComponent(resetAdminBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout addAdminDialogLayout = new javax.swing.GroupLayout(addAdminDialog.getContentPane());
        addAdminDialog.getContentPane().setLayout(addAdminDialogLayout);
        addAdminDialogLayout.setHorizontalGroup(
            addAdminDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        addAdminDialogLayout.setVerticalGroup(
            addAdminDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addAdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        addAdminDialog.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/title.png")));

        editAdminDialog.setBackground(new java.awt.Color(51, 51, 51));
        editAdminDialog.setResizable(false);

        addAdminPanel1.setBackground(new java.awt.Color(69, 73, 84));

        departmentCB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MSWDO", "MDRRMO", "MAO", "MPDO", "VIEWER" }));
        departmentCB1.setBorder(null);

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Password");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Username:");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Confirm Password");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("First Name:");

        updateAdminBtn.setBackground(new java.awt.Color(51, 255, 255));
        updateAdminBtn.setText("Update");

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Middle Name:");

        resetAdminBtn1.setBackground(new java.awt.Color(51, 255, 255));
        resetAdminBtn1.setText("Reset");

        positionCB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Head", "Staff" }));
        positionCB1.setBorder(null);

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Last Name:");

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Position:");

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Department");

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("ID:");

        oldIdTF.setForeground(new java.awt.Color(255, 255, 255));
        oldIdTF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        oldIdTF.setText("0");

        javax.swing.GroupLayout addAdminPanel1Layout = new javax.swing.GroupLayout(addAdminPanel1);
        addAdminPanel1.setLayout(addAdminPanel1Layout);
        addAdminPanel1Layout.setHorizontalGroup(
            addAdminPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addAdminPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(addAdminPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(addAdminPanel1Layout.createSequentialGroup()
                        .addGroup(addAdminPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addAdminPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPasswordField4)
                            .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(addAdminPanel1Layout.createSequentialGroup()
                        .addComponent(updateAdminBtn)
                        .addGap(30, 30, 30)
                        .addComponent(resetAdminBtn1)
                        .addGap(139, 139, 139))
                    .addGroup(addAdminPanel1Layout.createSequentialGroup()
                        .addGroup(addAdminPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addAdminPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(departmentCB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lNameTF1)
                            .addComponent(mNameTF1)
                            .addComponent(fNameTF1)
                            .addComponent(unTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(positionCB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(oldIdTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        addAdminPanel1Layout.setVerticalGroup(
            addAdminPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addAdminPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addAdminPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oldIdTF, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(addAdminPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addAdminPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fNameTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addAdminPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mNameTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addAdminPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNameTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addAdminPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(departmentCB1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addAdminPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(positionCB1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addAdminPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addAdminPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addAdminPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateAdminBtn)
                    .addComponent(resetAdminBtn1))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout editAdminDialogLayout = new javax.swing.GroupLayout(editAdminDialog.getContentPane());
        editAdminDialog.getContentPane().setLayout(editAdminDialogLayout);
        editAdminDialogLayout.setHorizontalGroup(
            editAdminDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addAdminPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        editAdminDialogLayout.setVerticalGroup(
            editAdminDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addAdminPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        viewAdminMenuItem.setText("View Admin");
        popupmenu.add(viewAdminMenuItem);

        editAdminMenuItem.setText("Edit Admin");
        popupmenu.add(editAdminMenuItem);

        addAdminMenuItem.setText("Add Admin");
        popupmenu.add(addAdminMenuItem);

        deleteAdminMenuItem.setText("Delete Admin");
        popupmenu.add(deleteAdminMenuItem);

        jPanel1.setBackground(new java.awt.Color(69, 73, 84));

        addAdminBtn.setBackground(new java.awt.Color(51, 255, 255));
        addAdminBtn.setText("Add Admin");

        adminTable.setAutoCreateRowSorter(true);
        adminTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        adminTable.setEnabled(false);
        adminTable.setGridColor(new java.awt.Color(0, 102, 102));
        jScrollPane1.setViewportView(adminTable);

        editAdminBtn.setBackground(new java.awt.Color(51, 255, 255));
        editAdminBtn.setText("Edit Admin");

        deleteAdminBtn.setBackground(new java.awt.Color(51, 255, 255));
        deleteAdminBtn.setText("Delete Admin");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Admin");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(addAdminBtn)
                        .addGap(18, 18, 18)
                        .addComponent(editAdminBtn)
                        .addGap(18, 18, 18)
                        .addComponent(deleteAdminBtn)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(deleteAdminBtn)
                        .addComponent(editAdminBtn)
                        .addComponent(addAdminBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public void allListener(ActionListener add,
            ActionListener save, ActionListener edit, ActionListener update,
            ActionListener delete, ActionListener reset, WindowListener show,
            PopupMenuListener pop, MouseListener tablePop,
            ActionListener menu1, ActionListener menu2, ActionListener menu3,
            ActionListener menu4) {
        addAdminBtn.addActionListener(add);
        saveAdminBtn.addActionListener(save);
        editAdminBtn.addActionListener(edit);
        updateAdminBtn.addActionListener(update);
        deleteAdminBtn.addActionListener(delete);
        resetAdminBtn.addActionListener(reset);
        resetAdminBtn1.addActionListener(reset);
        addAdminDialog.addWindowListener(show);
        editAdminDialog.addWindowListener(show);
        popupmenu.addPopupMenuListener(pop);
        adminTable.addMouseListener(tablePop);
        viewAdminMenuItem.addActionListener(menu1);
        editAdminMenuItem.addActionListener(menu2);
        addAdminMenuItem.addActionListener(menu3);
        deleteAdminMenuItem.addActionListener(menu4);
    }

//    public void actionListener(ActionListener a) {
//        addAdminBtn.addActionListener(a);
//        saveAdminBtn.addActionListener(a);
//        editAdminBtn.addActionListener(a);
//        updateAdminBtn.addActionListener(a);
//        deleteAdminBtn.addActionListener(a);
//        resetAdminBtn.addActionListener(a);
//        resetAdminBtn1.addActionListener(a);
//        viewAdminMenuItem.addActionListener(a);
//        editAdminMenuItem.addActionListener(a);
//        addAdminMenuItem.addActionListener(a);
//        deleteAdminMenuItem.addActionListener(a);
//    }
//
//    public void windowListener(WindowListener a) {
//        addAdminDialog.addWindowListener(a);
//        editAdminDialog.addWindowListener(a);
//    }
//
//    public void popupMenuListener(PopupMenuListener a, MouseListener b) {
//        popupmenu.addPopupMenuListener(a);
//        adminTable.addMouseListener(b);
//
//    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton addAdminBtn;
    public javax.swing.JDialog addAdminDialog;
    public javax.swing.JMenuItem addAdminMenuItem;
    private javax.swing.JPanel addAdminPanel;
    private javax.swing.JPanel addAdminPanel1;
    public javax.swing.JTable adminTable;
    public javax.swing.JButton deleteAdminBtn;
    public javax.swing.JMenuItem deleteAdminMenuItem;
    public javax.swing.JComboBox<String> departmentCB;
    public javax.swing.JComboBox<String> departmentCB1;
    public javax.swing.JButton editAdminBtn;
    public javax.swing.JDialog editAdminDialog;
    public javax.swing.JMenuItem editAdminMenuItem;
    public javax.swing.JTextField fNameTF;
    public javax.swing.JTextField fNameTF1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPasswordField jPasswordField1;
    public javax.swing.JPasswordField jPasswordField2;
    public javax.swing.JPasswordField jPasswordField3;
    public javax.swing.JPasswordField jPasswordField4;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField lNameTF;
    public javax.swing.JTextField lNameTF1;
    public javax.swing.JTextField mNameTF;
    public javax.swing.JTextField mNameTF1;
    public javax.swing.JLabel oldIdTF;
    public javax.swing.JPopupMenu popupmenu;
    public javax.swing.JComboBox<String> positionCB;
    public javax.swing.JComboBox<String> positionCB1;
    public javax.swing.JButton resetAdminBtn;
    public javax.swing.JButton resetAdminBtn1;
    public javax.swing.JButton saveAdminBtn;
    public javax.swing.JTextField searchTF;
    public javax.swing.JTextField unTF;
    public javax.swing.JTextField unTF1;
    public javax.swing.JButton updateAdminBtn;
    public javax.swing.JMenuItem viewAdminMenuItem;
    // End of variables declaration//GEN-END:variables

}
