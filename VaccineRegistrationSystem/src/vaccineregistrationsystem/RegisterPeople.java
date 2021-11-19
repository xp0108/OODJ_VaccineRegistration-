package vaccineregistrationsystem;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
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
        lblRegisterUsername = new javax.swing.JLabel();
        txtRagisterUsername = new javax.swing.JTextField();
        lblRegisterPassword = new javax.swing.JLabel();
        txtRegisterPassword = new javax.swing.JTextField();
        lblCitizenType = new javax.swing.JLabel();
        rdbCitizen = new javax.swing.JRadioButton();
        rdbNonCitizen = new javax.swing.JRadioButton();
        lblBOD = new javax.swing.JLabel();
        lblRegisterAddress = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRegisterAddress = new javax.swing.JTextArea();
        btnRegister = new javax.swing.JButton();
        btnRegisterBack = new javax.swing.JButton();
        txtRegisterBOD = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 153, 255));

        jPanel1.setBackground(new java.awt.Color(212, 227, 247));

        lblRegisterTitle.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        lblRegisterTitle.setForeground(new java.awt.Color(0, 0, 0));
        lblRegisterTitle.setText("Register");

        lblRegisterUsername.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRegisterUsername.setForeground(new java.awt.Color(0, 0, 0));
        lblRegisterUsername.setText("Username:");

        txtRagisterUsername.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtRagisterUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRagisterUsernameActionPerformed(evt);
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

        lblBOD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblBOD.setForeground(new java.awt.Color(0, 0, 0));
        lblBOD.setText("Birth Date:");

        lblRegisterAddress.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRegisterAddress.setForeground(new java.awt.Color(0, 0, 0));
        lblRegisterAddress.setText("Address:");

        txtRegisterAddress.setColumns(20);
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

        txtRegisterBOD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtRegisterBOD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegisterBODActionPerformed(evt);
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
                            .addComponent(lblRegisterUsername)
                            .addComponent(rdbNonCitizen)
                            .addComponent(rdbCitizen)
                            .addComponent(lblCitizenType)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtRegisterPassword, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtRagisterUsername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblRegisterPassword))
                        .addGap(91, 91, 91)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBOD)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRegisterAddress)
                            .addComponent(txtRegisterBOD, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(118, Short.MAX_VALUE))
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
                    .addComponent(lblRegisterUsername)
                    .addComponent(lblBOD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRagisterUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRegisterBOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(rdbNonCitizen))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblRegisterAddress)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
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

    private void txtRagisterUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRagisterUsernameActionPerformed

    }//GEN-LAST:event_txtRagisterUsernameActionPerformed

    private void btnRegisterBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegisterBackActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        try {
            File file = new File("people.txt");
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            
            
            
            bw.close();
            fw.close();
        } catch  (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error saving or loading data!!!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void txtRegisterBODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegisterBODActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegisterBODActionPerformed

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
    private javax.swing.JLabel lblBOD;
    private javax.swing.JLabel lblCitizenType;
    private javax.swing.JLabel lblRegisterAddress;
    private javax.swing.JLabel lblRegisterPassword;
    private javax.swing.JLabel lblRegisterTitle;
    private javax.swing.JLabel lblRegisterUsername;
    private javax.swing.JRadioButton rdbCitizen;
    private javax.swing.JRadioButton rdbNonCitizen;
    private javax.swing.JTextField txtRagisterUsername;
    private javax.swing.JTextArea txtRegisterAddress;
    private javax.swing.JTextField txtRegisterBOD;
    private javax.swing.JTextField txtRegisterPassword;
    // End of variables declaration//GEN-END:variables

}
