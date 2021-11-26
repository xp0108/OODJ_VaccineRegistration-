package vaccineregistrationsystem;

import java.awt.Font;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class ManageVaccine extends javax.swing.JFrame {

    /**
     * Creates new form ManageVaccine
     */
    public ManageVaccine() {
        initComponents();
        setLocationRelativeTo(null);
        ShowVaccineData();
        tableVaccine.setDefaultEditor(Object.class, null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableVaccine = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        lblRegisterName1 = new javax.swing.JLabel();
        txtVaccineType = new javax.swing.JTextField();
        lblRegisterName3 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        lblRegisterName4 = new javax.swing.JLabel();
        lblRegisterName5 = new javax.swing.JLabel();
        cmbDuration = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lbVAmount = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Covid-19 Vaccine Registration System |  Manage Covid-19 Vaccine Supply");

        jPanel1.setBackground(new java.awt.Color(212, 227, 247));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Manage Covid-19 Vaccine Supply");
        jLabel3.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));

        tableVaccine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Type", "Duration", "Amount"
            }
        ));
        tableVaccine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableVaccineMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableVaccine);

        txtSearch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        lblRegisterName1.setText("Vaccine ID/Type:");
        lblRegisterName1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRegisterName1.setForeground(new java.awt.Color(0, 0, 0));

        txtVaccineType.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblRegisterName3.setText("Vaccine Type:");
        lblRegisterName3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRegisterName3.setForeground(new java.awt.Color(0, 0, 0));

        txtAmount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAmountKeyPressed(evt);
            }
        });

        lblRegisterName4.setText("Vaccine Duration:");
        lblRegisterName4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRegisterName4.setForeground(new java.awt.Color(0, 0, 0));

        lblRegisterName5.setText("Vaccine Amount:");
        lblRegisterName5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRegisterName5.setForeground(new java.awt.Color(0, 0, 0));

        cmbDuration.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Number of Month-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cmbDuration.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbDuration.setToolTipText("");

        btnAdd.setText("Add");
        btnAdd.setBackground(new java.awt.Color(0, 0, 0));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.setBackground(new java.awt.Color(0, 0, 0));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
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
        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lbVAmount.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lbVAmount.setForeground(new java.awt.Color(255, 51, 51));

        btnClear.setBackground(new java.awt.Color(0, 0, 0));
        btnClear.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblRegisterName1)
                        .addGap(18, 18, 18)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(164, 164, 164))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143)
                        .addComponent(btnBack)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lblRegisterName3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVaccineType, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblRegisterName4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lblRegisterName5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbVAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))))
                        .addGap(0, 104, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegisterName1)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblRegisterName3)
                        .addComponent(txtVaccineType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblRegisterName4)
                        .addComponent(cmbDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegisterName5)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbVAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btnUpdate)
                            .addComponent(btnClear)
                            .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(14, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        DefaultTableModel model = (DefaultTableModel) tableVaccine.getModel();
        String search = txtSearch.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        tableVaccine.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));

    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        if (txtVaccineType.getText().isEmpty() || txtAmount.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Please fill up all the fills", "Uh Oh...",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            int duration = Integer.valueOf((String) cmbDuration.getSelectedItem());
            int amount = Integer.parseInt(txtAmount.getText());
            AddVaccine(txtVaccineType.getText(), duration, amount);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        DefaultTableModel model = (DefaultTableModel) tableVaccine.getModel();

        if (tableVaccine.getSelectedRowCount() == 1) {
            //single row selected than update
            String pVaccineType = txtVaccineType.getText();
            int durationE = Integer.valueOf((String) cmbDuration.getSelectedItem());
            int amountE = Integer.parseInt(txtAmount.getText());

            if (pVaccineType.equals("") || txtAmount.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill up the all the details.", "Empty text field found !", JOptionPane.ERROR_MESSAGE);

            } else {
                //update table
                model.setValueAt(pVaccineType, tableVaccine.getSelectedRow(), 0);
                model.setValueAt(durationE, tableVaccine.getSelectedRow(), 1);
                model.setValueAt(amountE, tableVaccine.getSelectedRow(), 2);

                String file = "vaccine.txt";
                String tempVaccineFile = "TempVaccine.txt";
                File oldVaccineFile = new File(file);
                File newVaccineFile = new File(tempVaccineFile);

                try ( FileWriter fw = new FileWriter(newVaccineFile, true);  BufferedWriter bw = new BufferedWriter(fw);  Scanner ss = new Scanner(oldVaccineFile);) {

                    ss.useDelimiter("[,\n]");

                    while (ss.hasNext()) {
                        String vaccineType = ss.next();
                        int amount = ss.nextInt();
                        int duration = ss.nextInt();

                        if (pVaccineType.trim().equals(vaccineType.trim())) {
                            Vaccine modyVaccine = new Vaccine(pVaccineType, durationE, amountE);
                            bw.write(modyVaccine.toString());
                        } else {
                            Vaccine remainVaccine = new Vaccine(vaccineType, amount, duration);
                            bw.write(remainVaccine.toString());

                        }
                    }

                    ss.close();
                    bw.close();
                    fw.close();

                    System.out.println("flie close");

                    oldVaccineFile.delete();
                    System.out.println("flie deleted");

                    File dump = new File(file);
                    newVaccineFile.renameTo(dump);
                    System.out.println("flie renamed");

                    JOptionPane.showMessageDialog(this, "Record Updated Successfully");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Edit Vaccine record fail due to " + e);
                    System.out.println(e);
                }

            }
        } else {
            if (tableVaccine.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Table if Empty");
            } else {
                JOptionPane.showMessageDialog(this, "Please select a Row for Update");
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        DefaultTableModel model = (DefaultTableModel) tableVaccine.getModel();

        if (tableVaccine.getSelectedRowCount() == 1) {
            int deleteBookingOption = JOptionPane.showConfirmDialog(this, "Wanted to Delete this booking record ?", "Delete Record",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (deleteBookingOption == JOptionPane.YES_OPTION) {

                // delete from table
                int i = tableVaccine.getSelectedRow();
                if (i >= 0) {
                    // remove a row from jtable
                    model.removeRow(i);
                    System.out.println("Delete from table");
                }

                String file = "vaccine.txt";
                String pVaccineType = txtVaccineType.getText();

                String tempVaccineFile = "TempVaccine.txt";
                File oldVaccineFile = new File(file);
                File newVaccineFile = new File(tempVaccineFile);

                try ( FileWriter fw = new FileWriter(newVaccineFile, true);  BufferedWriter bw = new BufferedWriter(fw);  Scanner ss = new Scanner(oldVaccineFile);) {

                    ss.useDelimiter("[,\n]");
                    while (ss.hasNext()) {
                        String vaccineType = ss.next();
                        int amount = ss.nextInt();
                        int duration = ss.nextInt();

                        if (!pVaccineType.trim().equals(vaccineType.trim())) {
                            Vaccine remainVaccine = new Vaccine(vaccineType, amount, duration);
                            bw.write(remainVaccine.toString());
                        }
                    }

                    ss.close();
                    bw.close();
                    fw.close();

                    oldVaccineFile.delete();
                    File dump = new File(file);
                    newVaccineFile.renameTo(dump);
                    JOptionPane.showMessageDialog(null, "Vaccine record delete successfully !");

                    //clean txt
                    txtVaccineType.setText("");
                    txtAmount.setText("");
                    cmbDuration.setSelectedIndex(0);
                    txtVaccineType.setEnabled(true);

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Edit Vaccine record fail due to " + e);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Cancel delete Vaccine record");

            }
        } else {
            if (tableVaccine.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Table if Empty");
            } else {
                JOptionPane.showMessageDialog(this, "Please select a Row for Delete");
            }
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        PersonnelMain personnel = new PersonnelMain();
        personnel.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void tableVaccineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableVaccineMouseClicked
        int i = tableVaccine.getSelectedRow();
        TableModel model = tableVaccine.getModel();

        txtVaccineType.setText(model.getValueAt(i, 0).toString());
        cmbDuration.setSelectedItem(model.getValueAt(i, 1).toString());
        txtAmount.setText(model.getValueAt(i, 2).toString());

        //disable to edit
        txtVaccineType.setEnabled(false);
    }//GEN-LAST:event_tableVaccineMouseClicked

    private void txtAmountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAmountKeyPressed
        try {
            int i = Integer.parseInt(txtAmount.getText());
            lbVAmount.setText("");
        } catch (NumberFormatException e1) {
            lbVAmount.setText("Only Accept Number");
        }
    }//GEN-LAST:event_txtAmountKeyPressed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtVaccineType.setText("");
        txtAmount.setText("");
        cmbDuration.setSelectedIndex(0);
        txtVaccineType.setEnabled(true);
    }//GEN-LAST:event_btnClearActionPerformed

    public static Scanner scanner;

    public void AddVaccine(String VaccineType, int Duration, int Amount) {
        boolean found = false;
        String tmpVaccineType = txtVaccineType.getText();

        try {
            scanner = new Scanner(new File("vaccine.txt"));
            scanner.useDelimiter("[,\n]");

            while (scanner.hasNext() && !found) {
                tmpVaccineType = scanner.next();

                if (tmpVaccineType.trim().equals(VaccineType.trim())) {
                    found = true;
                }
            }

            //after check file
            if (found == true) {

                JOptionPane.showMessageDialog(this, "Vaccine already exist", "Uh Oh...", JOptionPane.WARNING_MESSAGE);

            } else {

                try {
                    File file = new File("vaccine.txt");
                    FileWriter fw = new FileWriter(file, true);
                    BufferedWriter bw = new BufferedWriter(fw);

                    Vaccine addVaccine = new Vaccine(VaccineType, Duration, Amount);
                    bw.write(addVaccine.toString());

                    bw.close();
                    fw.close();
                    JOptionPane.showMessageDialog(this, "Add Vaccine Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Error saving or loading data!!!", "Error", JOptionPane.ERROR_MESSAGE);
                }

//                Add data into jtable
                Object[] dataRow = {VaccineType, Duration, Amount};
                DefaultTableModel model = (DefaultTableModel) tableVaccine.getModel();
                model.addRow(dataRow);

                txtVaccineType.setText("");
                txtAmount.setText("");
                cmbDuration.setSelectedIndex(-1);
            }
            scanner.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Something went wrong, please try again!!!", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void ShowVaccineData() {
        // show data in the JTable
        File fileVaccine = new File("vaccine.txt");
        try ( BufferedReader br = new BufferedReader(new FileReader(fileVaccine));) {
            tableVaccine.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 15));

            DefaultTableModel model = (DefaultTableModel) tableVaccine.getModel();

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
            Logger.getLogger(ManageVaccine.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(ManageVaccine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageVaccine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageVaccine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageVaccine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageVaccine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbDuration;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbVAmount;
    private javax.swing.JLabel lblRegisterName1;
    private javax.swing.JLabel lblRegisterName3;
    private javax.swing.JLabel lblRegisterName4;
    private javax.swing.JLabel lblRegisterName5;
    private javax.swing.JTable tableVaccine;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtVaccineType;
    // End of variables declaration//GEN-END:variables
}
