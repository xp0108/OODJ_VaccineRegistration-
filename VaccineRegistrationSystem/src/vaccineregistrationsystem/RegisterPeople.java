package vaccineregistrationsystem;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class RegisterPeople extends javax.swing.JFrame {

    public RegisterPeople() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GroupCitizenType = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblRegisterTitle = new javax.swing.JLabel();
        lblRegisterName = new javax.swing.JLabel();
        txtRegisterName = new javax.swing.JTextField();
        lblRegisterPassword = new javax.swing.JLabel();
        txtRegisterPassword = new javax.swing.JTextField();
        lblCitizenType = new javax.swing.JLabel();
        rdbCitizen = new javax.swing.JRadioButton();
        rdbNonCitizen = new javax.swing.JRadioButton();
        lblDOB = new javax.swing.JLabel();
        txtRegisterDOB = new javax.swing.JTextField();
        lblRegisterAddress = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRegisterAddress = new javax.swing.JTextArea();
        btnRegister = new javax.swing.JButton();
        btnRegisterBack = new javax.swing.JButton();
        lblRegisterIC = new javax.swing.JLabel();
        txtRegisterIC = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 153, 255));

        jPanel1.setBackground(new java.awt.Color(212, 227, 247));

        lblRegisterTitle.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        lblRegisterTitle.setForeground(new java.awt.Color(0, 0, 0));
        lblRegisterTitle.setText("Register");

        lblRegisterName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRegisterName.setForeground(new java.awt.Color(0, 0, 0));
        lblRegisterName.setText("Username:");

        txtRegisterName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtRegisterName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegisterNameActionPerformed(evt);
            }
        });

        lblRegisterPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRegisterPassword.setForeground(new java.awt.Color(0, 0, 0));
        lblRegisterPassword.setText("Password:");

        txtRegisterPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblCitizenType.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCitizenType.setForeground(new java.awt.Color(0, 0, 0));
        lblCitizenType.setText("Citizen Type:");

        rdbCitizen.setBackground(new java.awt.Color(212, 227, 247));
        GroupCitizenType.add(rdbCitizen);
        rdbCitizen.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdbCitizen.setForeground(new java.awt.Color(0, 0, 0));
        rdbCitizen.setText("Citizen");

        rdbNonCitizen.setBackground(new java.awt.Color(212, 227, 247));
        GroupCitizenType.add(rdbNonCitizen);
        rdbNonCitizen.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdbNonCitizen.setForeground(new java.awt.Color(0, 0, 0));
        rdbNonCitizen.setText("Non-Citizen");

        lblDOB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDOB.setForeground(new java.awt.Color(0, 0, 0));
        lblDOB.setText("Birth Date:");

        txtRegisterDOB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtRegisterDOB.setForeground(new java.awt.Color(204, 204, 204));
        txtRegisterDOB.setText("yyyy-mm-dd");
        txtRegisterDOB.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRegisterDOBFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRegisterDOBFocusLost(evt);
            }
        });
        txtRegisterDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegisterDOBActionPerformed(evt);
            }
        });

        lblRegisterAddress.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRegisterAddress.setForeground(new java.awt.Color(0, 0, 0));
        lblRegisterAddress.setText("Address:");

        txtRegisterAddress.setColumns(20);
        txtRegisterAddress.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtRegisterAddress.setForeground(new java.awt.Color(0, 0, 0));
        txtRegisterAddress.setRows(5);
        jScrollPane1.setViewportView(txtRegisterAddress);

        btnRegister.setBackground(new java.awt.Color(0, 0, 0));
        btnRegister.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnRegisterBack.setBackground(new java.awt.Color(0, 0, 0));
        btnRegisterBack.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRegisterBack.setForeground(new java.awt.Color(255, 255, 255));
        btnRegisterBack.setText("Back");
        btnRegisterBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterBackActionPerformed(evt);
            }
        });

        lblRegisterIC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRegisterIC.setForeground(new java.awt.Color(0, 0, 0));
        lblRegisterIC.setText("IC/Passport");

        txtRegisterIC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtRegisterIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegisterICActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblRegisterTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(btnRegisterBack, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRegisterName)
                            .addComponent(rdbNonCitizen)
                            .addComponent(rdbCitizen)
                            .addComponent(lblCitizenType)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtRegisterPassword, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtRegisterName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblRegisterPassword)
                            .addComponent(lblRegisterIC)
                            .addComponent(txtRegisterIC, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(91, 91, 91)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDOB)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRegisterAddress)
                            .addComponent(txtRegisterDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(lblRegisterTitle))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnRegisterBack)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegisterName)
                    .addComponent(lblDOB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRegisterName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRegisterDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblRegisterPassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRegisterPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblCitizenType)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdbCitizen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdbNonCitizen)
                        .addGap(18, 18, 18)
                        .addComponent(lblRegisterIC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRegisterIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblRegisterAddress)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnRegister)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRegisterNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegisterNameActionPerformed

    }//GEN-LAST:event_txtRegisterNameActionPerformed

    private void btnRegisterBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegisterBackActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        String dateRegex = "^\\d{4}-\\d{2}-\\d{2}$";
        Pattern datePattern = Pattern.compile(dateRegex);
        Matcher dateMatcher = datePattern.matcher(txtRegisterDOB.getText());

        if (txtRegisterName.getText().isEmpty() || txtRegisterPassword.getText().isEmpty() || txtRegisterIC.getText().isEmpty()
                || txtRegisterDOB.getText().isEmpty() || txtRegisterAddress.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Please fill up all the fills", "Uh Oh...",
                    JOptionPane.WARNING_MESSAGE);
        } else if (GroupCitizenType.isSelected(null)) {
            JOptionPane.showMessageDialog(this,
                    "Please choose Citizen Type", "Uh Oh...",
                    JOptionPane.WARNING_MESSAGE);
        } else if (!dateMatcher.find()) {
            JOptionPane.showMessageDialog(this,
                    "Date format wrong (yyyy-mm-dd)", "Uh Oh...",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                File file = new File("login.txt");
                FileWriter fw = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(fw);

                String name = txtRegisterName.getText();
                String password = txtRegisterPassword.getText();

                if (rdbCitizen.isSelected()) {
                    Citizen register = new Citizen(name, password);
                    bw.write(register.getPeopleName());
                    bw.write(",");
                    bw.write(register.getPeoplePassword());
                    bw.write("\n");
                } else if (rdbNonCitizen.isSelected()) {
                    NonCitizen register = new NonCitizen(name, password);
                    bw.write(register.getPeopleName());
                    bw.write(",");
                    bw.write(register.getPeoplePassword());
                    bw.write("\n");
                }

                bw.close();
                fw.close();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error saving or loading data!!!", "Error", JOptionPane.ERROR_MESSAGE);
            }

            try {
                File file = new File("people.txt");
                FileWriter fw = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(fw);

                String CitizenRegex = "^\\d{6}-\\d{2}-\\d{4}$";
                Pattern CitizenPattern = Pattern.compile(CitizenRegex);
                Matcher CitizenMatcher = CitizenPattern.matcher(txtRegisterIC.getText());

                String NonCitizenRegex = "[0-9]+";
                Pattern NonCitizenPattern = Pattern.compile(NonCitizenRegex);
                Matcher NonCitizenMatcher = NonCitizenPattern.matcher(txtRegisterIC.getText());

                String IC = txtRegisterIC.getText();
                String name = txtRegisterName.getText();
                String address = txtRegisterAddress.getText();
                String dob = txtRegisterDOB.getText();

                if (rdbCitizen.isSelected()) {
                    if (!CitizenMatcher.find()) {
                        JOptionPane.showMessageDialog(this,
                                "IC format wrong (nnnnnn-nn-nnnn)", "Uh Oh...",
                                JOptionPane.WARNING_MESSAGE);
                    } else {
                        Citizen register = new Citizen(IC, name, address, dob);
                        bw.write(register.getPeopleIC());
                        bw.write(",");
                        bw.write(register.getPeopleName());
                        bw.write(",");
                        bw.write(register.getPeopleAddress());
                        bw.write(",");
                        bw.write(register.getPeopleDOB());
                        bw.write("\n");

                        bw.close();
                        fw.close();

                        JOptionPane.showMessageDialog(this, "Register Successful", "Congratulation", JOptionPane.PLAIN_MESSAGE);

                        Login a = new Login();
                        a.setVisible(true);
                        this.dispose();
                    }
                } else if (rdbNonCitizen.isSelected()) {
                    if (!NonCitizenMatcher.find()) {
                        JOptionPane.showMessageDialog(this,
                                "Passport format wrong (only number)", "Uh Oh...",
                                JOptionPane.WARNING_MESSAGE);
                    } else {
                        NonCitizen register = new NonCitizen(IC, name, address, dob);
                        bw.write(register.getPeopleIC());
                        bw.write(",");
                        bw.write(register.getPeopleName());
                        bw.write(",");
                        bw.write(register.getPeopleAddress());
                        bw.write(",");
                        bw.write(register.getPeopleDOB());
                        bw.write("\n");

                        bw.close();
                        fw.close();

                        JOptionPane.showMessageDialog(this, "Register Successful", "Congratulation", JOptionPane.PLAIN_MESSAGE);

                        Login a = new Login();
                        a.setVisible(true);
                        this.dispose();
                    }
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error saving or loading data!!!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnRegisterActionPerformed

    private void txtRegisterDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegisterDOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegisterDOBActionPerformed

    private void txtRegisterICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegisterICActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegisterICActionPerformed

    private void txtRegisterDOBFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRegisterDOBFocusGained
        if (txtRegisterDOB.getText().equals("yyyy-mm-dd")) {
            txtRegisterDOB.setText("");
            txtRegisterDOB.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtRegisterDOBFocusGained

    private void txtRegisterDOBFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRegisterDOBFocusLost
        if (txtRegisterDOB.getText().equals("")) {
            txtRegisterDOB.setText("yyyy-mm-dd");
            txtRegisterDOB.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtRegisterDOBFocusLost

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterPeople().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GroupCitizenType;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnRegisterBack;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCitizenType;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblRegisterAddress;
    private javax.swing.JLabel lblRegisterIC;
    private javax.swing.JLabel lblRegisterName;
    private javax.swing.JLabel lblRegisterPassword;
    private javax.swing.JLabel lblRegisterTitle;
    private javax.swing.JRadioButton rdbCitizen;
    private javax.swing.JRadioButton rdbNonCitizen;
    private javax.swing.JTextArea txtRegisterAddress;
    private javax.swing.JTextField txtRegisterDOB;
    private javax.swing.JTextField txtRegisterIC;
    private javax.swing.JTextField txtRegisterName;
    private javax.swing.JTextField txtRegisterPassword;
    // End of variables declaration//GEN-END:variables

}
