package vaccineregistrationsystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import static vaccineregistrationsystem.RegisterPeople.y;

public class PeopleMain extends javax.swing.JFrame {

    Citizen login;

    public PeopleMain(Citizen login) {
        initComponents();
        this.login = login;
        readFile("people.txt");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnPeopleProfileBack = new javax.swing.JButton();
        lblPeoplePeofile = new javax.swing.JLabel();
        lblPeopleProfileIC = new javax.swing.JLabel();
        txtPeopleProfileIC = new javax.swing.JTextField();
        lblPeopleProfileName = new javax.swing.JLabel();
        txtPeopleProfileName = new javax.swing.JTextField();
        lblPeopleProfileDOB = new javax.swing.JLabel();
        txtPeopleProfileDOB = new javax.swing.JTextField();
        lblPeopleProfileAddress = new javax.swing.JLabel();
        txtPeopleProfileAddress = new javax.swing.JTextField();
        btnPeopleProfileSave = new javax.swing.JButton();
        btnPeopleProfileRefresh = new javax.swing.JButton();
        lblPeopleProfileOld = new javax.swing.JLabel();
        txtPeopleProfileOld = new javax.swing.JTextField();
        lblPeopleProfileNew = new javax.swing.JLabel();
        txtPeopleProfileNew = new javax.swing.JTextField();
        btnChangePassword = new javax.swing.JButton();
        lblPeoplePeofileAppointment = new javax.swing.JLabel();
        btnPeopleProfileRequestA = new javax.swing.JButton();
        btnPeopleProfileStatusA = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(212, 227, 247));
        jPanel1.setForeground(new java.awt.Color(112, 227, 244));

        btnPeopleProfileBack.setBackground(new java.awt.Color(0, 0, 0));
        btnPeopleProfileBack.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPeopleProfileBack.setForeground(new java.awt.Color(255, 255, 255));
        btnPeopleProfileBack.setText("LOGOUT");
        btnPeopleProfileBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeopleProfileBackActionPerformed(evt);
            }
        });

        lblPeoplePeofile.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblPeoplePeofile.setForeground(new java.awt.Color(0, 0, 0));
        lblPeoplePeofile.setText("Profile");

        lblPeopleProfileIC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPeopleProfileIC.setForeground(new java.awt.Color(0, 0, 0));
        lblPeopleProfileIC.setText("IC/Passport:");

        txtPeopleProfileIC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPeopleProfileIC.setForeground(new java.awt.Color(0, 0, 0));
        txtPeopleProfileIC.setEnabled(false);

        lblPeopleProfileName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPeopleProfileName.setForeground(new java.awt.Color(0, 0, 0));
        lblPeopleProfileName.setText("Name:");

        txtPeopleProfileName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPeopleProfileName.setForeground(new java.awt.Color(0, 0, 0));

        lblPeopleProfileDOB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPeopleProfileDOB.setForeground(new java.awt.Color(0, 0, 0));
        lblPeopleProfileDOB.setText("Date of Birth:");

        txtPeopleProfileDOB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPeopleProfileDOB.setForeground(new java.awt.Color(0, 0, 0));

        lblPeopleProfileAddress.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPeopleProfileAddress.setForeground(new java.awt.Color(0, 0, 0));
        lblPeopleProfileAddress.setText("Address:");

        txtPeopleProfileAddress.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPeopleProfileAddress.setForeground(new java.awt.Color(0, 0, 0));

        btnPeopleProfileSave.setBackground(new java.awt.Color(0, 0, 0));
        btnPeopleProfileSave.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPeopleProfileSave.setForeground(new java.awt.Color(255, 255, 255));
        btnPeopleProfileSave.setText("Save and Change");
        btnPeopleProfileSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeopleProfileSaveActionPerformed(evt);
            }
        });

        btnPeopleProfileRefresh.setBackground(new java.awt.Color(0, 0, 0));
        btnPeopleProfileRefresh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPeopleProfileRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnPeopleProfileRefresh.setText("Refresh");
        btnPeopleProfileRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeopleProfileRefreshActionPerformed(evt);
            }
        });

        lblPeopleProfileOld.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPeopleProfileOld.setForeground(new java.awt.Color(0, 0, 0));
        lblPeopleProfileOld.setText("Old Password:");

        txtPeopleProfileOld.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPeopleProfileOld.setForeground(new java.awt.Color(0, 0, 0));

        lblPeopleProfileNew.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPeopleProfileNew.setForeground(new java.awt.Color(0, 0, 0));
        lblPeopleProfileNew.setText("New Password:");

        txtPeopleProfileNew.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPeopleProfileNew.setForeground(new java.awt.Color(0, 0, 0));

        btnChangePassword.setBackground(new java.awt.Color(0, 0, 0));
        btnChangePassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnChangePassword.setForeground(new java.awt.Color(255, 255, 255));
        btnChangePassword.setText("Change Password");

        lblPeoplePeofileAppointment.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblPeoplePeofileAppointment.setForeground(new java.awt.Color(0, 0, 0));
        lblPeoplePeofileAppointment.setText("Appointment");

        btnPeopleProfileRequestA.setBackground(new java.awt.Color(0, 0, 0));
        btnPeopleProfileRequestA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPeopleProfileRequestA.setForeground(new java.awt.Color(255, 255, 255));
        btnPeopleProfileRequestA.setText("Request Appointment");

        btnPeopleProfileStatusA.setBackground(new java.awt.Color(0, 0, 0));
        btnPeopleProfileStatusA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPeopleProfileStatusA.setForeground(new java.awt.Color(255, 255, 255));
        btnPeopleProfileStatusA.setText("Check Appointment Status");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnPeopleProfileBack)
                        .addGap(19, 19, 19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPeopleProfileNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnChangePassword)
                        .addGap(435, 435, 435))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPeopleProfileNew, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblPeopleProfileOld)
                                .addComponent(txtPeopleProfileOld, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblPeopleProfileAddress)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblPeopleProfileIC)
                                        .addComponent(txtPeopleProfileIC, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblPeopleProfileDOB)
                                        .addComponent(txtPeopleProfileDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(54, 54, 54)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtPeopleProfileName, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblPeopleProfileName)))
                                .addComponent(txtPeopleProfileAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblPeoplePeofile)
                                    .addGap(131, 131, 131)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(btnPeopleProfileSave)
                                .addGap(67, 67, 67)
                                .addComponent(btnPeopleProfileRefresh)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPeoplePeofileAppointment)
                            .addComponent(btnPeopleProfileRequestA, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPeopleProfileStatusA, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPeoplePeofile)
                            .addComponent(btnPeopleProfileBack))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPeopleProfileIC)
                            .addComponent(lblPeopleProfileName))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPeopleProfileIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPeopleProfileName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblPeopleProfileDOB)
                        .addGap(18, 18, 18)
                        .addComponent(txtPeopleProfileDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblPeopleProfileAddress)
                        .addGap(18, 18, 18)
                        .addComponent(txtPeopleProfileAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPeopleProfileSave, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnPeopleProfileRefresh))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblPeopleProfileOld)
                                .addGap(18, 18, 18)
                                .addComponent(txtPeopleProfileOld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblPeopleProfileNew))
                            .addComponent(btnChangePassword)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(lblPeoplePeofileAppointment)
                        .addGap(29, 29, 29)
                        .addComponent(btnPeopleProfileRequestA, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPeopleProfileStatusA, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(txtPeopleProfileNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
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

    private void btnPeopleProfileRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeopleProfileRefreshActionPerformed

        readFile("people.txt");

    }//GEN-LAST:event_btnPeopleProfileRefreshActionPerformed

    private void btnPeopleProfileBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeopleProfileBackActionPerformed
        Login login = new Login();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPeopleProfileBackActionPerformed

    private void btnPeopleProfileSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeopleProfileSaveActionPerformed
        String dateRegex = "^\\d{4}-\\d{2}-\\d{2}$";
        Pattern datePattern = Pattern.compile(dateRegex);
        Matcher dateMatcher = datePattern.matcher(txtPeopleProfileDOB.getText());

        if (!dateMatcher.find()) {
            JOptionPane.showMessageDialog(this,
                    "Date format wrong (yyyy-mm-dd)", "Uh Oh...",
                    JOptionPane.WARNING_MESSAGE);
        } else {
        }
    }//GEN-LAST:event_btnPeopleProfileSaveActionPerformed

    public static Scanner y;

    public void readFile(String PeopleFile) {
        try {
            boolean found = false;
            String tempPeopleIC, tempPeopleName, tempAddress, tempDOB;

            y = new Scanner(new File(PeopleFile));
            y.useDelimiter("[,\n]");

            while (y.hasNext() && !found) {
                tempPeopleIC = y.next();
                tempPeopleName = y.next();
                tempAddress = y.next();
                tempDOB = y.next();
                y.next();

                if (tempPeopleName.trim().equals(login.getPeopleName())) {
                    found = true;
                }
                if (found == true) {
                    txtPeopleProfileIC.setText(tempPeopleIC);
                    txtPeopleProfileName.setText(tempPeopleName);
                    txtPeopleProfileDOB.setText(tempDOB);
                    txtPeopleProfileAddress.setText(tempAddress);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No");
        }
    }

    public void updateFile(String pathFile, String IC) {
        try {

            File inFile = new File(pathFile);

            if (!inFile.isFile()) {
                System.out.println("Parameter is not an existing file");
                return;
            }

            // Construct the new file that will later be renamed to the original
            // filename.
            File tempFile = new File(inFile.getAbsolutePath() + ".tmp");

            FileReader fr = new FileReader(pathFile);
            BufferedReader br = new BufferedReader(fr);
            String line = null;

            while ((line = br.readLine()) != null) {
                String[] poepleDetail = line.split(",");

                if (IC.equals(poepleDetail[0])) {
                    
                    
                    
                }

            }

        } catch (Exception e) {

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JButton btnPeopleProfileBack;
    private javax.swing.JButton btnPeopleProfileRefresh;
    private javax.swing.JButton btnPeopleProfileRequestA;
    private javax.swing.JButton btnPeopleProfileSave;
    private javax.swing.JButton btnPeopleProfileStatusA;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPeoplePeofile;
    private javax.swing.JLabel lblPeoplePeofileAppointment;
    private javax.swing.JLabel lblPeopleProfileAddress;
    private javax.swing.JLabel lblPeopleProfileDOB;
    private javax.swing.JLabel lblPeopleProfileIC;
    private javax.swing.JLabel lblPeopleProfileName;
    private javax.swing.JLabel lblPeopleProfileNew;
    private javax.swing.JLabel lblPeopleProfileOld;
    private javax.swing.JTextField txtPeopleProfileAddress;
    private javax.swing.JTextField txtPeopleProfileDOB;
    private javax.swing.JTextField txtPeopleProfileIC;
    private javax.swing.JTextField txtPeopleProfileName;
    private javax.swing.JTextField txtPeopleProfileNew;
    private javax.swing.JTextField txtPeopleProfileOld;
    // End of variables declaration//GEN-END:variables
}
