package vaccineregistrationsystem;

import com.github.lgooddatepicker.components.DatePickerSettings;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import static vaccineregistrationsystem.ManageVaccine.scanner;

public class ManageAppointment extends javax.swing.JFrame {

    public ManageAppointment() {
        initComponents();
        setLocationRelativeTo(null);
        ShowDose1();
        ShowDose2();
        Centre showDropDown = new Centre();
        showDropDown.ShowCentreDropDown(cmbCentre);
        tableDose1.setDefaultEditor(Object.class, null);
        tableDose2.setDefaultEditor(Object.class, null);
        cmbCentre.setSelectedIndex(-1);

//        Detect double click 
        tableDose1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                if (evt.getClickCount() == 2) {
                    Point pnt = evt.getPoint();
                    int row = tableDose1.rowAtPoint(pnt);
//                    deselect the row
                    tableDose1.getSelectionModel().clearSelection();
                }
            }
        });

        tableDose2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                if (evt.getClickCount() == 2) {
                    Point pnt = evt.getPoint();
                    int row = tableDose2.rowAtPoint(pnt);
                    tableDose2.getSelectionModel().clearSelection();
                }
            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDose1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableDose2 = new javax.swing.JTable();
        lblRegisterName3 = new javax.swing.JLabel();
        txtIC = new javax.swing.JTextField();
        lblRegisterName4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblRegisterName1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        DatePickerSettings dateSetIn = new DatePickerSettings();
        dpAppDate = new com.github.lgooddatepicker.components.DatePicker();
        lblRegisterName5 = new javax.swing.JLabel();
        lblRegisterName6 = new javax.swing.JLabel();
        cmbAppStatus = new javax.swing.JComboBox<>();
        btnUpdate = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblRegisterName7 = new javax.swing.JLabel();
        cmbCentre = new javax.swing.JComboBox<>();
        btnClear = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Covid-19 Vaccine Registration System |  Manage Vaccine Appointment");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(212, 227, 247));

        jPanel2.setBackground(new java.awt.Color(101, 108, 117));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Appointment for Dose 1");
        jLabel2.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));

        tableDose1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IC/Passport", "Name", "Centre", "Date", "Status"
            }
        ));
        tableDose1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableDose1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tableDose1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Manage Vaccine Appointment ");
        jLabel3.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));

        jPanel3.setBackground(new java.awt.Color(101, 108, 117));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Appointment for Dose 2");
        jLabel4.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));

        tableDose2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IC/Passport", "Name", "Centre", "Date", "Status"
            }
        ));
        tableDose2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableDose2MouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tableDose2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblRegisterName3.setText("IC/Passport:");
        lblRegisterName3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRegisterName3.setForeground(new java.awt.Color(0, 0, 0));

        txtIC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblRegisterName4.setText("Name:");
        lblRegisterName4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRegisterName4.setForeground(new java.awt.Color(0, 0, 0));

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblRegisterName1.setText("Search IC/Passport:");
        lblRegisterName1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRegisterName1.setForeground(new java.awt.Color(0, 0, 0));

        txtSearch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        dpAppDate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblRegisterName5.setText("Appointment Date:");
        lblRegisterName5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRegisterName5.setForeground(new java.awt.Color(0, 0, 0));

        lblRegisterName6.setText("Appointment Status:");
        lblRegisterName6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRegisterName6.setForeground(new java.awt.Color(0, 0, 0));

        cmbAppStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Appointment Status-", "Pending", "Active", "Done", "Cancel" }));
        cmbAppStatus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbAppStatus.setToolTipText("");

        btnUpdate.setText("Update");
        btnUpdate.setBackground(new java.awt.Color(0, 0, 0));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove");
        btnRemove.setBackground(new java.awt.Color(0, 0, 0));
        btnRemove.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRemove.setForeground(new java.awt.Color(255, 255, 255));
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblRegisterName7.setText("Centre:");
        lblRegisterName7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRegisterName7.setForeground(new java.awt.Color(0, 0, 0));

        cmbCentre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Centre-" }));
        cmbCentre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbCentre.setToolTipText("");
        cmbCentre.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                cmbCentrePopupMenuWillBecomeVisible(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.setBackground(new java.awt.Color(0, 0, 0));
        btnClear.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.setBackground(new java.awt.Color(0, 0, 0));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnClear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRemove)
                                .addGap(255, 255, 255)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblRegisterName5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(dpAppDate, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(lblRegisterName4)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(lblRegisterName3)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtIC, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(223, 223, 223)
                                                        .addComponent(lblRegisterName7)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(cmbCentre, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(126, 126, 126)
                                                        .addComponent(lblRegisterName6)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(cmbAppStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                                .addGap(0, 1, Short.MAX_VALUE)))
                        .addGap(3, 3, 3))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblRegisterName1)
                .addGap(18, 18, 18)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(219, 219, 219))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegisterName1)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbCentre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRegisterName7))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dpAppDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRegisterName5))
                        .addGap(19, 19, 19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRegisterName3)
                            .addComponent(txtIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRegisterName4)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegisterName6)
                    .addComponent(cmbAppStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnUpdate)
                    .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear)
                    .addComponent(btnAdd))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        DefaultTableModel modelDose1 = (DefaultTableModel) tableDose1.getModel();
        String searchDose1 = txtSearch.getText();
        TableRowSorter<DefaultTableModel> tr1 = new TableRowSorter<DefaultTableModel>(modelDose1);
        tableDose1.setRowSorter(tr1);
        tr1.setRowFilter(RowFilter.regexFilter(searchDose1));

        DefaultTableModel modelDose2 = (DefaultTableModel) tableDose2.getModel();
        String searchDose2 = txtSearch.getText();
        TableRowSorter<DefaultTableModel> tr2 = new TableRowSorter<DefaultTableModel>(modelDose2);
        tableDose2.setRowSorter(tr2);
        tr2.setRowFilter(RowFilter.regexFilter(searchDose2));
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        DefaultTableModel modelDose1 = (DefaultTableModel) tableDose1.getModel();
        DefaultTableModel modelDose2 = (DefaultTableModel) tableDose2.getModel();

        String pIC = txtIC.getText();
        String pName = txtName.getText();
        String appStatusE = String.valueOf(cmbAppStatus.getSelectedItem());
        String centreE = String.valueOf(cmbCentre.getSelectedItem());
        String strAppDateE = String.valueOf(dpAppDate.getDate());

        if (tableDose1.getSelectedRowCount() == 1) {

            if (cmbAppStatus.getSelectedItem().equals("Done")) {
                cmbAppStatus.setEnabled(false);
                cmbCentre.setEnabled(false);
                dpAppDate.setEnabled(false);
                txtIC.setEnabled(false);
                txtName.setEnabled(false);

                Citizen updateStatus = new Citizen();
                updateStatus.UpdatePeopleStatus("people.txt", txtIC.getText(), "Dose 1");

                Centre centre = new Centre();
                centre.UpdateCentreFileAfterDeduct(centreE);

            } else {
                cmbAppStatus.setEnabled(true);
                cmbCentre.setEnabled(true);
                dpAppDate.setEnabled(true);
                txtIC.setEnabled(false);
                txtName.setEnabled(false);
            }

            if (pIC.equals("") || pName.equals("") || appStatusE.equals("") || centreE.equals("") || strAppDateE.equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill up the all the details.", "Empty text field found !", JOptionPane.ERROR_MESSAGE);

            } else {
                //update table
                modelDose1.setValueAt(pIC, tableDose1.getSelectedRow(), 0);
                modelDose1.setValueAt(pName, tableDose1.getSelectedRow(), 1);
                modelDose1.setValueAt(centreE, tableDose1.getSelectedRow(), 2);
                modelDose1.setValueAt(strAppDateE, tableDose1.getSelectedRow(), 3);
                modelDose1.setValueAt(appStatusE, tableDose1.getSelectedRow(), 4);

                String fileDose1 = "dose1.txt";
                String tempDose1File = "TempDose1.txt";
                File oldDose1File = new File(fileDose1);
                File newDose1File = new File(tempDose1File);

                try (FileWriter fw = new FileWriter(newDose1File, true); BufferedWriter bw = new BufferedWriter(fw); Scanner ss = new Scanner(oldDose1File);) {

                    ss.useDelimiter("[,\n]");

                    while (ss.hasNext()) {
                        String IC = ss.next();
                        String Name = ss.next();
                        String centre = ss.next();
                        String strAppDate = ss.next();
                        String appStatus = ss.next();

                        if (pIC.trim().equals(IC.trim()) && pName.trim().equals(Name.trim())) {
                            //mody
                            Centre centreNameE = new Centre(centreE);

                            Appointment modyAppointment = new Appointment(pIC, pName, strAppDateE, centreNameE);
                            modyAppointment.AssignAppStatus(appStatusE);

                            bw.write(modyAppointment.WriteDoseFile());

                            if (appStatusE.equals("Done")) {

                                AddDose2Appointment(pIC, pName, centreE, strAppDateE, "Active");
                            } else {
                                JOptionPane.showMessageDialog(this, "Record Updated Successfully");
                            }

                        } else {
                            //ori                      
                            Centre centreName = new Centre(centre);

                            Appointment oriAppointment = new Appointment(IC, Name, strAppDate, centreName);
                            oriAppointment.AssignAppStatus(appStatus);

                            bw.write(oriAppointment.WriteDoseFile());
                        }
                    }

                    ss.close();
                    bw.close();
                    fw.close();

                    oldDose1File.delete();

                    File dump = new File(fileDose1);
                    newDose1File.renameTo(dump);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Edit Appointment record fail due to " + e);
                    System.out.println(e);
                }

            }
        } else if (tableDose2.getSelectedRowCount() == 1) {

            if (cmbAppStatus.getSelectedItem().equals("Done")) {
                cmbAppStatus.setEnabled(false);
                cmbCentre.setEnabled(false);
                dpAppDate.setEnabled(false);
                txtIC.setEnabled(false);
                txtName.setEnabled(false);

                Citizen updateStatus = new Citizen();
                updateStatus.UpdatePeopleStatus("people.txt", txtIC.getText(), "Dose 2");
                Centre centre = new Centre();
                centre.UpdateCentreFileAfterDeduct(centreE);

            } else {
                cmbAppStatus.setEnabled(true);
                cmbCentre.setEnabled(true);
                dpAppDate.setEnabled(true);
                txtIC.setEnabled(false);
                txtName.setEnabled(false);
            }

            if (pIC.equals("") || pName.equals("") || appStatusE.equals("") || centreE.equals("") || strAppDateE.equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill up the all the details.", "Empty text field found !", JOptionPane.ERROR_MESSAGE);

            } else {
                //Update Dose 2
                modelDose2.setValueAt(pIC, tableDose2.getSelectedRow(), 0);
                modelDose2.setValueAt(pName, tableDose2.getSelectedRow(), 1);
                modelDose2.setValueAt(centreE, tableDose2.getSelectedRow(), 2);
                modelDose2.setValueAt(strAppDateE, tableDose2.getSelectedRow(), 3);
                modelDose2.setValueAt(appStatusE, tableDose2.getSelectedRow(), 4);

                String fileDose2 = "dose2.txt";
                String tempDose2File = "TempDose2.txt";
                File oldDose2File = new File(fileDose2);
                File newDose2File = new File(tempDose2File);

                try (FileWriter fw = new FileWriter(newDose2File, true); BufferedWriter bw = new BufferedWriter(fw); Scanner ss = new Scanner(oldDose2File);) {

                    ss.useDelimiter("[,\n]");

                    while (ss.hasNext()) {
                        String IC = ss.next();
                        String Name = ss.next();
                        String centre = ss.next();
                        String strAppDate = ss.next();
                        String appStatus = ss.next();

                        if (pIC.trim().equals(IC.trim()) && pName.trim().equals(Name.trim())) {
                            //mody
                            Centre centreNameE = new Centre(centreE);

                            Appointment modyAppointment = new Appointment(pIC, pName, strAppDateE, centreNameE);
                            modyAppointment.AssignAppStatus(appStatusE);

                            bw.write(modyAppointment.WriteDoseFile());

                        } else {
                            //ori                      
                            Centre centreName = new Centre(centre);

                            Appointment oriAppointment = new Appointment(IC, Name, strAppDate, centreName);
                            oriAppointment.AssignAppStatus(appStatus);

                            bw.write(oriAppointment.WriteDoseFile());

                        }
                    }

                    ss.close();
                    bw.close();
                    fw.close();

                    oldDose2File.delete();

                    File dump = new File(fileDose2);
                    newDose2File.renameTo(dump);
                    JOptionPane.showMessageDialog(this, "Record Updated Successfully");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Edit Appointment record fail due to " + e);
                    System.out.println(e);
                }
            }
        } else {
            if (tableDose1.getRowCount() == 0 || tableDose2.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Table if Empty");
            } else {
                JOptionPane.showMessageDialog(this, "Please select a Row for Update");
            }
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        if (cmbAppStatus.getSelectedItem().equals("Done")) {
            JOptionPane.showMessageDialog(null, "Appointment is done. Cannot update appointment record", "Empty text field found !", JOptionPane.ERROR_MESSAGE);
        } else {
            DefaultTableModel modelDose1 = (DefaultTableModel) tableDose1.getModel();
            DefaultTableModel modelDose2 = (DefaultTableModel) tableDose2.getModel();

            if (tableDose1.getSelectedRowCount() == 1) {
                int deleteAppDose1Option = JOptionPane.showConfirmDialog(this, "Wanted to Delete this Appointment record ?", "Delete Record",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (deleteAppDose1Option == JOptionPane.YES_OPTION) {

                    // delete from table
                    int i = tableDose1.getSelectedRow();
                    if (i >= 0) {
                        // remove a row from jtable
                        modelDose1.removeRow(i);
                        System.out.println("Delete from table");
                    }

                    String fileDose1 = "dose1.txt";
                    String pIC = txtIC.getText();

                    String tempDose1File = "TempDose1.txt";
                    File oldDose1File = new File(fileDose1);
                    File newDose1File = new File(tempDose1File);

                    try (FileWriter fw = new FileWriter(newDose1File, true); BufferedWriter bw = new BufferedWriter(fw); Scanner ss = new Scanner(oldDose1File);) {

                        ss.useDelimiter("[,\n]");

                        while (ss.hasNext()) {
                            String IC = ss.next();
                            String Name = ss.next();
                            String centre = ss.next();
                            String strAppDate = ss.next();
                            String appStatus = ss.next();

                            if (!pIC.trim().equals(IC.trim())) {
                                Centre centreName = new Centre(centre);

                                Appointment oriAppointment = new Appointment(IC, Name, strAppDate, centreName);
                                oriAppointment.AssignAppStatus(appStatus);

                                bw.write(oriAppointment.WriteDoseFile());
                            }
                        }

                        ss.close();
                        bw.close();
                        fw.close();

                        oldDose1File.delete();
                        File dump = new File(fileDose1);
                        newDose1File.renameTo(dump);

                        //clean txt
                        cleanAll();
                        JOptionPane.showMessageDialog(null, "Delete Dose 1 Appointment record Successfully");
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Edit Vaccine record fail due to " + e);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Cancel delete Centre record");

                }
            } else if (tableDose2.getSelectedRowCount() == 1) {
                int deleteAppDose1Option = JOptionPane.showConfirmDialog(this, "Wanted to Delete this Appointment record ?", "Delete Record",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (deleteAppDose1Option == JOptionPane.YES_OPTION) {

                    // delete from table
                    int i = tableDose2.getSelectedRow();
                    if (i >= 0) {
                        // remove a row from jtable
                        modelDose2.removeRow(i);
                        System.out.println("Delete from table");
                    }

                    String fileDose2 = "dose2.txt";
                    String pIC = txtIC.getText();

                    String tempDose2File = "TempDose1.txt";
                    File oldDose2File = new File(fileDose2);
                    File newDose2File = new File(tempDose2File);

                    try (FileWriter fw = new FileWriter(newDose2File, true); BufferedWriter bw = new BufferedWriter(fw); Scanner ss = new Scanner(oldDose2File);) {

                        ss.useDelimiter("[,\n]");

                        while (ss.hasNext()) {
                            String IC = ss.next();
                            String Name = ss.next();
                            String centre = ss.next();
                            String strAppDate = ss.next();
                            String appStatus = ss.next();

                            if (!pIC.trim().equals(IC.trim())) {
                                Centre centreName = new Centre(centre);

                                Appointment oriAppointment = new Appointment(IC, Name, strAppDate, centreName);
                                oriAppointment.AssignAppStatus(appStatus);

                                bw.write(oriAppointment.WriteDoseFile());
                            }
                        }

                        ss.close();
                        bw.close();
                        fw.close();

                        oldDose2File.delete();
                        File dump = new File(fileDose2);
                        newDose2File.renameTo(dump);

                        //clean txt
                        cleanAll();
                        JOptionPane.showMessageDialog(null, "Delete Dose 2 Appointment record Successfully");
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Edit Vaccine record fail due to " + e);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Cancel delete Centre record");

                }
            } else {
                if (tableDose1.getRowCount() == 0 || tableDose2.getRowCount() == 0) {
                    JOptionPane.showMessageDialog(this, "Table if Empty");
                } else {
                    JOptionPane.showMessageDialog(this, "Please select a Row for Delete");
                }
            }
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        PersonnelMain personnel = new PersonnelMain();
        personnel.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        cleanAll();
    }//GEN-LAST:event_btnClearActionPerformed

    private void cmbCentrePopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmbCentrePopupMenuWillBecomeVisible
        Centre showDropDown = new Centre();
        showDropDown.ShowCentreDropDown(cmbCentre);
    }//GEN-LAST:event_cmbCentrePopupMenuWillBecomeVisible

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        CheckDose1People(txtIC.getText(), txtName.getText());
        AddDose1Appointment(txtIC.getText(), txtName.getText(),
                String.valueOf(cmbCentre.getSelectedItem()),
                String.valueOf(dpAppDate.getDate()),
                String.valueOf(cmbAppStatus.getSelectedItem()));
    }//GEN-LAST:event_btnAddActionPerformed

    private void tableDose1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDose1MouseReleased
        tableDose2.clearSelection();
        int i = tableDose1.convertRowIndexToModel(tableDose1.getSelectedRow());
        DefaultTableModel model = (DefaultTableModel) tableDose1.getModel();

        txtIC.setText(model.getValueAt(i, 0).toString());
        txtName.setText(model.getValueAt(i, 1).toString());
        if (model.getValueAt(i, 2).toString() == "") {
            cmbCentre.setSelectedIndex(-1);
        } else {
            cmbCentre.setSelectedItem(model.getValueAt(i, 2).toString());
        }
        txtName.setText(model.getValueAt(i, 1).toString());
        if (model.getValueAt(i, 3).toString() == "") {
            dpAppDate.setText("");
        } else {
            dpAppDate.setDate(LocalDate.parse((String) model.getValueAt(i, 3).toString()));
        }

        cmbAppStatus.setSelectedItem(model.getValueAt(i, 4).toString());

        if (cmbAppStatus.getSelectedItem().equals("Done")) {
            cmbAppStatus.setEnabled(false);
            cmbCentre.setEnabled(false);
            dpAppDate.setEnabled(false);
            txtIC.setEnabled(false);
            txtName.setEnabled(false);
        } else {
            txtIC.setEnabled(false);
            txtName.setEnabled(false);
            cmbAppStatus.setEnabled(true);
            cmbCentre.setEnabled(true);
            dpAppDate.setEnabled(true);
        }
    }//GEN-LAST:event_tableDose1MouseReleased

    private void tableDose2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDose2MouseReleased
        tableDose1.clearSelection();
        int i = tableDose2.convertRowIndexToModel(tableDose2.getSelectedRow());
        DefaultTableModel model = (DefaultTableModel) tableDose2.getModel();

        txtIC.setText(model.getValueAt(i, 0).toString());
        txtName.setText(model.getValueAt(i, 1).toString());
        cmbCentre.setSelectedItem(model.getValueAt(i, 2).toString());
        dpAppDate.setDate(LocalDate.parse((String) model.getValueAt(i, 3).toString()));
        cmbAppStatus.setSelectedItem(model.getValueAt(i, 4).toString());

        if (cmbAppStatus.getSelectedItem().equals("Done")) {
            cmbAppStatus.setEnabled(false);
            cmbCentre.setEnabled(false);
            dpAppDate.setEnabled(false);
            txtIC.setEnabled(false);
            txtName.setEnabled(false);
        } else {
            txtIC.setEnabled(false);
            txtName.setEnabled(false);
            cmbAppStatus.setEnabled(true);
            cmbCentre.setEnabled(true);
            dpAppDate.setEnabled(true);
        }
    }//GEN-LAST:event_tableDose2MouseReleased

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        tableDose1.clearSelection();
        tableDose2.clearSelection();
    }//GEN-LAST:event_formMouseClicked

    public void cleanAll() {
        txtIC.setText("");
        txtName.setText("");
        cmbAppStatus.setSelectedIndex(0);
        cmbCentre.setSelectedIndex(-1);
        dpAppDate.setText("");
        txtIC.setEnabled(true);
        txtName.setEnabled(true);
        cmbAppStatus.setEnabled(true);
        cmbCentre.setEnabled(true);
        dpAppDate.setEnabled(true);
        tableDose1.getSelectionModel().clearSelection();
        tableDose2.getSelectionModel().clearSelection();

    }

    public void ShowDose1() {
        // show data in the JTable
        File fileDose1 = new File("dose1.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(fileDose1));) {
            tableDose1.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 15));

            DefaultTableModel model = (DefaultTableModel) tableDose1.getModel();

            Object[] data = br.lines().toArray();

            // extratct data from lines
            // set data to jtable model
            for (int i = 0; i < data.length; i++) {
                String line = data[i].toString().trim();
                String[] dataRow = line.split("[,\n]");

                model.addRow(dataRow);

            }
            br.close();

        } catch (IOException ex) {
            Logger.getLogger(ManageCentre.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void ShowDose2() {
        // show data in the JTable
        File fileDose2 = new File("dose2.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(fileDose2));) {
            tableDose1.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 15));

            DefaultTableModel model = (DefaultTableModel) tableDose2.getModel();

            Object[] data = br.lines().toArray();

            // extratct data from lines
            // set data to jtable model
            for (int i = 0; i < data.length; i++) {
                String line = data[i].toString().trim();
                String[] dataRow = line.split("[,\n]");

                model.addRow(dataRow);

            }
            br.close();

        } catch (IOException ex) {
            Logger.getLogger(ManageCentre.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void CheckDose1People(String PeopleIC, String PeopleName) {
        boolean foundDose1People = false;
        String tempPeopleIC = PeopleIC;
        String tempPeopleName = PeopleName;
        try {
            scanner = new Scanner(new File("dose1.txt"));
            scanner.useDelimiter("[,\n]");

            while (scanner.hasNext() && !foundDose1People) {
                tempPeopleIC = scanner.next();
                tempPeopleName = scanner.next();
                scanner.next();
                scanner.next();
                scanner.next();

                if (tempPeopleIC.trim().equals(PeopleIC.trim()) || tempPeopleName.trim().equals(PeopleName.trim())) {
                    foundDose1People = true;
                }
            }

            scanner.close();

            //after check file
            if (foundDose1People == true) {

                JOptionPane.showMessageDialog(this, "This people have registed the Dose 1 Appointment", "Uh Oh...", JOptionPane.WARNING_MESSAGE);
                cleanAll();
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void AddDose1Appointment(String PeopleIC, String PeopleName, String AppCentre, String AppDate, String AppStatus) {
        boolean foundPeople = false;

        String tempPeopleIC = PeopleIC;
        String tempPeopleName = PeopleName;

        try {
            scanner = new Scanner(new File("people.txt"));
            scanner.useDelimiter("[,\n]");

            while (scanner.hasNext() && !foundPeople) {
                tempPeopleIC = scanner.next();
                tempPeopleName = scanner.next();
                scanner.next();
                scanner.next();
                scanner.next();

                if (tempPeopleIC.trim().equals(PeopleIC.trim()) && tempPeopleName.trim().equals(PeopleName.trim())) {
                    foundPeople = true;
                }
            }
            scanner.close();

            //after check file
            if (PeopleIC.equals("") || PeopleName.equals("") || cmbCentre.getSelectedItem() == null || 
                    dpAppDate.getDate() == null || AppStatus.equals("-Appointment Status-")) {
                JOptionPane.showMessageDialog(null, "Please fill up the all the details.", "Empty text field found !", JOptionPane.ERROR_MESSAGE);

            } else if (foundPeople == false) {

                JOptionPane.showMessageDialog(this, "Name and IC/Passport does not exist", "Uh Oh...", JOptionPane.WARNING_MESSAGE);

            } else {
//                add appointment
                try {
                    File file = new File("dose1.txt");
                    FileWriter fw = new FileWriter(file, true);
                    BufferedWriter bw = new BufferedWriter(fw);

                    Centre centreName = new Centre(AppCentre);

                    Appointment oriAppointment = new Appointment(PeopleIC, PeopleName, AppDate, centreName);
                    oriAppointment.AssignAppStatus(AppStatus);

                    bw.write(oriAppointment.WriteDoseFile());

                    bw.close();
                    fw.close();

                    JOptionPane.showMessageDialog(this, "Add Dose 1 Appointment Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Error saving or loading data!!!", "Error", JOptionPane.ERROR_MESSAGE);
                }
//                Add to Dose 1 table
                Object[] dataRow = {PeopleIC, PeopleName, AppCentre, AppDate, AppStatus};
                DefaultTableModel model = (DefaultTableModel) tableDose1.getModel();
                model.addRow(dataRow);

                txtIC.setEnabled(false);
                txtName.setEnabled(false);
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void AddDose2Appointment(String PeopleIC, String PeopleName, String AppCentre, String AppDate, String AppStatus) {
        boolean foundPeople = false;

        String tempPeopleIC = PeopleIC;
        String tempPeopleName = PeopleName;

        try {
            scanner = new Scanner(new File("dose2.txt"));
            scanner.useDelimiter("[,\n]");

            while (scanner.hasNext() && !foundPeople) {
                tempPeopleIC = scanner.next();
                tempPeopleName = scanner.next();
                scanner.next();
                scanner.next();
                scanner.next();

                if (tempPeopleIC.trim().equals(PeopleIC.trim()) || tempPeopleName.trim().equals(PeopleName.trim())) {
                    foundPeople = true;
                }
            }

            //after check file
            if (PeopleIC.equals("") || PeopleName.equals("") || AppCentre.equals("") || AppDate.equals("") || AppStatus.equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill up the all the details.", "Empty text field found !", JOptionPane.ERROR_MESSAGE);

            } else if (foundPeople == true) {

                JOptionPane.showMessageDialog(this, "This person already has a Dose 2 Appointment record!", "Uh Oh...", JOptionPane.WARNING_MESSAGE);

            } else {
//                add appointment
                Appointment doseDate = new Appointment();
                String appDate = doseDate.Dose2AppDate(AppDate, AppCentre);
                try {
                    File file = new File("dose2.txt");
                    FileWriter fw = new FileWriter(file, true);
                    BufferedWriter bw = new BufferedWriter(fw);

                    //Add month for dose 2 appointment 
                    Centre centreName = new Centre(AppCentre);

                    Appointment oriAppointment = new Appointment(PeopleIC, PeopleName, appDate, centreName);
                    oriAppointment.AssignAppStatus(AppStatus);

                    bw.write(oriAppointment.WriteDoseFile());

                    bw.close();
                    fw.close();

                    JOptionPane.showMessageDialog(this, "Add Dose 2 Appointment Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Error saving or loading data!!!", "Error", JOptionPane.ERROR_MESSAGE);
                }
//                Add to Dose 1 table
                Object[] dataRow = {PeopleIC, PeopleName, AppCentre, appDate, AppStatus};
                DefaultTableModel model = (DefaultTableModel) tableDose2.getModel();
                model.addRow(dataRow);

                scanner.close();

                txtIC.setEnabled(false);
                txtName.setEnabled(false);
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageAppointment.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageAppointment.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageAppointment.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageAppointment.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageAppointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbAppStatus;
    private javax.swing.JComboBox<String> cmbCentre;
    private com.github.lgooddatepicker.components.DatePicker dpAppDate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblRegisterName1;
    private javax.swing.JLabel lblRegisterName3;
    private javax.swing.JLabel lblRegisterName4;
    private javax.swing.JLabel lblRegisterName5;
    private javax.swing.JLabel lblRegisterName6;
    private javax.swing.JLabel lblRegisterName7;
    private javax.swing.JTable tableDose1;
    private javax.swing.JTable tableDose2;
    private javax.swing.JTextField txtIC;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
