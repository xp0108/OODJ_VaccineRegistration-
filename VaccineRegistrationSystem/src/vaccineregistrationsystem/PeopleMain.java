package vaccineregistrationsystem;

import java.awt.Dialog;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

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

        pnlPeopleProfile = new javax.swing.JPanel();
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
        btnPeopleProfileCancelA = new javax.swing.JButton();
        btnPeopleProfileStatusA = new javax.swing.JButton();
        lblPeopleProfileStatus = new javax.swing.JLabel();
        txtPeopleProfileStatus = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Covid-19 Vaccine Registration System |  Profile");
        setResizable(false);

        pnlPeopleProfile.setBackground(new java.awt.Color(212, 227, 247));
        pnlPeopleProfile.setForeground(new java.awt.Color(112, 227, 244));

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
        txtPeopleProfileIC.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtPeopleProfileIC.setEnabled(false);

        lblPeopleProfileName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPeopleProfileName.setForeground(new java.awt.Color(0, 0, 0));
        lblPeopleProfileName.setText("Name:");

        txtPeopleProfileName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPeopleProfileName.setForeground(new java.awt.Color(0, 0, 0));
        txtPeopleProfileName.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtPeopleProfileName.setEnabled(false);

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
        btnPeopleProfileSave.setEnabled(false);
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
        btnChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordActionPerformed(evt);
            }
        });

        lblPeoplePeofileAppointment.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblPeoplePeofileAppointment.setForeground(new java.awt.Color(0, 0, 0));
        lblPeoplePeofileAppointment.setText("Appointment");

        btnPeopleProfileRequestA.setBackground(new java.awt.Color(0, 0, 0));
        btnPeopleProfileRequestA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPeopleProfileRequestA.setForeground(new java.awt.Color(255, 255, 255));
        btnPeopleProfileRequestA.setText("Request Appointment");
        btnPeopleProfileRequestA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeopleProfileRequestAActionPerformed(evt);
            }
        });

        btnPeopleProfileCancelA.setBackground(new java.awt.Color(0, 0, 0));
        btnPeopleProfileCancelA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPeopleProfileCancelA.setForeground(new java.awt.Color(255, 255, 255));
        btnPeopleProfileCancelA.setText("Cancel Appointment");
        btnPeopleProfileCancelA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeopleProfileCancelAActionPerformed(evt);
            }
        });

        btnPeopleProfileStatusA.setBackground(new java.awt.Color(0, 0, 0));
        btnPeopleProfileStatusA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPeopleProfileStatusA.setForeground(new java.awt.Color(255, 255, 255));
        btnPeopleProfileStatusA.setText("Check Appointment Status");
        btnPeopleProfileStatusA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeopleProfileStatusAActionPerformed(evt);
            }
        });

        lblPeopleProfileStatus.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPeopleProfileStatus.setForeground(new java.awt.Color(0, 0, 0));
        lblPeopleProfileStatus.setText("Status:");

        txtPeopleProfileStatus.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPeopleProfileStatus.setForeground(new java.awt.Color(0, 0, 0));
        txtPeopleProfileStatus.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtPeopleProfileStatus.setEnabled(false);

        javax.swing.GroupLayout pnlPeopleProfileLayout = new javax.swing.GroupLayout(pnlPeopleProfile);
        pnlPeopleProfile.setLayout(pnlPeopleProfileLayout);
        pnlPeopleProfileLayout.setHorizontalGroup(
            pnlPeopleProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPeopleProfileLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(pnlPeopleProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPeopleProfileLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnPeopleProfileBack)
                        .addGap(19, 19, 19))
                    .addGroup(pnlPeopleProfileLayout.createSequentialGroup()
                        .addGroup(pnlPeopleProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPeopleProfileLayout.createSequentialGroup()
                                .addGroup(pnlPeopleProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlPeopleProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtPeopleProfileNew, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblPeopleProfileOld)
                                        .addComponent(txtPeopleProfileOld, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblPeopleProfileAddress)
                                        .addGroup(pnlPeopleProfileLayout.createSequentialGroup()
                                            .addGroup(pnlPeopleProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblPeopleProfileIC)
                                                .addComponent(txtPeopleProfileIC, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblPeopleProfileDOB)
                                                .addComponent(txtPeopleProfileDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(54, 54, 54)
                                            .addGroup(pnlPeopleProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtPeopleProfileName, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblPeopleProfileName)
                                                .addComponent(lblPeopleProfileStatus)
                                                .addComponent(txtPeopleProfileStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(txtPeopleProfileAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPeopleProfileLayout.createSequentialGroup()
                                            .addComponent(lblPeoplePeofile)
                                            .addGap(131, 131, 131)))
                                    .addGroup(pnlPeopleProfileLayout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(btnPeopleProfileSave)
                                        .addGap(67, 67, 67)
                                        .addComponent(btnPeopleProfileRefresh)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE))
                            .addGroup(pnlPeopleProfileLayout.createSequentialGroup()
                                .addComponent(lblPeopleProfileNew)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnChangePassword)
                                .addGap(81, 81, 81)))
                        .addGroup(pnlPeopleProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPeoplePeofileAppointment)
                            .addComponent(btnPeopleProfileRequestA, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPeopleProfileStatusA, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPeopleProfileCancelA, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43))))
        );
        pnlPeopleProfileLayout.setVerticalGroup(
            pnlPeopleProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPeopleProfileLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlPeopleProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPeopleProfileLayout.createSequentialGroup()
                        .addComponent(lblPeoplePeofile)
                        .addGap(18, 18, 18)
                        .addGroup(pnlPeopleProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPeopleProfileIC)
                            .addComponent(lblPeopleProfileName))
                        .addGap(18, 18, 18)
                        .addGroup(pnlPeopleProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPeopleProfileIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPeopleProfileName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlPeopleProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPeopleProfileLayout.createSequentialGroup()
                                .addComponent(lblPeopleProfileDOB)
                                .addGap(18, 18, 18)
                                .addComponent(txtPeopleProfileDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlPeopleProfileLayout.createSequentialGroup()
                                .addComponent(lblPeopleProfileStatus)
                                .addGap(18, 18, 18)
                                .addComponent(txtPeopleProfileStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(lblPeopleProfileAddress)
                        .addGap(18, 18, 18)
                        .addComponent(txtPeopleProfileAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(pnlPeopleProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPeopleProfileSave, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnPeopleProfileRefresh))
                        .addGap(18, 18, 18)
                        .addGroup(pnlPeopleProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPeopleProfileLayout.createSequentialGroup()
                                .addComponent(lblPeopleProfileOld)
                                .addGap(18, 18, 18)
                                .addComponent(txtPeopleProfileOld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblPeopleProfileNew))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPeopleProfileLayout.createSequentialGroup()
                                .addComponent(btnChangePassword)
                                .addGap(11, 11, 11)))
                        .addComponent(txtPeopleProfileNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPeopleProfileLayout.createSequentialGroup()
                        .addComponent(btnPeopleProfileBack)
                        .addGap(18, 18, 18)
                        .addComponent(lblPeoplePeofileAppointment)
                        .addGap(28, 28, 28)
                        .addComponent(btnPeopleProfileRequestA, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPeopleProfileCancelA, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPeopleProfileStatusA, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPeopleProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPeopleProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

            deleteFile("people.txt", txtPeopleProfileIC.getText());
            updateFile(login.getPeopleIC());

        }
    }//GEN-LAST:event_btnPeopleProfileSaveActionPerformed

    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordActionPerformed

        if (txtPeopleProfileOld.getText().isBlank() || txtPeopleProfileNew.getText().isBlank()) {
            JOptionPane.showMessageDialog(this,
                    "Please fill up Old Password and New Password", "Uh Oh...",
                    JOptionPane.WARNING_MESSAGE);
        } else if (txtPeopleProfileOld.getText().equals(txtPeopleProfileNew.getText())) {
            JOptionPane.showMessageDialog(this,
                    "New password cannot same as old password", "Uh Oh...",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            verifyOld(txtPeopleProfileOld.getText());
            txtPeopleProfileOld.setText("");
            txtPeopleProfileNew.setText("");
        }

    }//GEN-LAST:event_btnChangePasswordActionPerformed

    private void btnPeopleProfileRequestAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeopleProfileRequestAActionPerformed
        Appointment appointment = new Appointment();
        appointment.PeopleRequestAppointment(login.getPeopleIC().trim());
    }//GEN-LAST:event_btnPeopleProfileRequestAActionPerformed

    private void btnPeopleProfileStatusAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeopleProfileStatusAActionPerformed
        Citizen login = new Citizen(this.login.getPeopleIC(), this.login.getPeoplePassword());

        PeopleAppointmentStatus peopleAppStatus = new PeopleAppointmentStatus(this.login, this, Dialog.ModalityType.APPLICATION_MODAL);
        peopleAppStatus.setVisible(true);
    }//GEN-LAST:event_btnPeopleProfileStatusAActionPerformed

    private void btnPeopleProfileCancelAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeopleProfileCancelAActionPerformed
        try {
            String file = "dose1.txt";
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            int IsDose1Done = 0;

            String IC = this.login.getPeopleIC().trim();

            while ((line = br.readLine()) != null) {
                String[] arrdose1 = line.split(",");

                if (IC.equals(arrdose1[0]) && arrdose1[4].equals("Done")) {
                    IsDose1Done = 1;
                    break;
                } else if (IC.equals(arrdose1[0]) && !arrdose1[4].equals("Done")) {
                    IsDose1Done = 2;
                    break;
                }
            }

            br.close();
            fr.close();

            if (IsDose1Done == 1) {
                JOptionPane.showMessageDialog(null, "Cannot cancel appointment because Dose 1 is done or no appointmene request!!!",
                        "WARNING!!", JOptionPane.WARNING_MESSAGE);
            } else if (IsDose1Done == 2) {
                deleteFile(file, this.login.getPeopleIC());
                JOptionPane.showMessageDialog(this, "Successful Delete Appointment",
                        "Congratulation", JOptionPane.PLAIN_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No appointment request",
                        "WARNING!!", JOptionPane.WARNING_MESSAGE);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnPeopleProfileCancelAActionPerformed

    public static Scanner y;

    public void readFile(String PeopleFile) {
        try {
            boolean found = false;
            String tempPeopleIC, tempPeopleName, tempAddress, tempDOB, tempStatus;

            y = new Scanner(new File(PeopleFile));
            y.useDelimiter("[,\n]");

            while (y.hasNext() && !found) {
                tempPeopleIC = y.next();
                tempPeopleName = y.next();
                tempAddress = y.next();
                tempDOB = y.next();
                tempStatus = y.next();

                if (tempPeopleIC.trim().equals(login.getPeopleIC())) {
                    found = true;
                }

                if (found == true) {
                    txtPeopleProfileIC.setText(tempPeopleIC);
                    txtPeopleProfileName.setText(tempPeopleName);
                    txtPeopleProfileDOB.setText(tempDOB);
                    txtPeopleProfileAddress.setText(tempAddress);
                    txtPeopleProfileStatus.setText(tempStatus.trim());
                    System.out.println(tempStatus.trim());
                }

                if (tempStatus.trim().equals("No Vaccinated")) {

                    btnPeopleProfileSave.setEnabled(true);

                }
            }

            y.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No");
        }
    }

    public void deleteFile(String pathFile, String IC) {
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
            PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

            String line = null;

            while ((line = br.readLine()) != null) {
                String[] poepleDetail = line.split(",");

                if (!IC.trim().equals(poepleDetail[0])) {

                    pw.println(line);
                    pw.flush();

                }
            }

            pw.close();
            br.close();
            fr.close();

            if (!inFile.delete()) {
                System.out.println("Could not delete file");
                return;
            }

            // Rename the new file to the filename the original file had.
            if (!tempFile.renameTo(inFile)) {
                System.out.println("Could not rename file");
            }

        } catch (Exception e) {
            System.out.println("No");
            e.printStackTrace();
        }
    }

    public void updateFile(String ic) {
        try {
            File file = new File("people.txt");
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);

            String name = txtPeopleProfileName.getText();
            String address = txtPeopleProfileAddress.getText();
            String dob = txtPeopleProfileDOB.getText();

            Citizen change = new Citizen(ic, name, address, dob);
            bw.write(change.toString());

            JOptionPane.showMessageDialog(this, "Successful Change", "Congratulation", JOptionPane.PLAIN_MESSAGE);

            bw.close();
            fw.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No");
            e.printStackTrace();
        }
    }

    public void verifyOld(String old) {
        try {
            String file = "login.txt";

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            boolean checkPassword = false;

            while ((line = br.readLine()) != null) {
                String[] loginarr = line.split(",");

                if (login.getPeopleIC().equals(loginarr[0]) && old.equals(loginarr[1])) {
                    checkPassword = true;

                    br.close();
                    fr.close();
                    deleteFile(file, txtPeopleProfileIC.getText());
                    updateLoginFile(login.getPeopleIC());

                }
            }

            br.close();
            fr.close();

            if (checkPassword == false) {
                JOptionPane.showMessageDialog(null, "Old Password is not match", "WARNING!!", JOptionPane.WARNING_MESSAGE);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void updateLoginFile(String ic) {
        try {

            File file = new File("login.txt");
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);

            String passwordNew = txtPeopleProfileNew.getText();

            Citizen newPassword = new Citizen(ic, passwordNew);
            bw.write(newPassword.getPeopleIC());
            bw.write(",");
            bw.write(newPassword.getPeoplePassword());
            bw.write(",");
            bw.write("People");
            bw.write("\n");

            JOptionPane.showMessageDialog(this, "Successful Change Password", "Congratulation", JOptionPane.PLAIN_MESSAGE);

            bw.close();
            fw.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No");
            e.printStackTrace();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JButton btnPeopleProfileBack;
    private javax.swing.JButton btnPeopleProfileCancelA;
    private javax.swing.JButton btnPeopleProfileRefresh;
    private javax.swing.JButton btnPeopleProfileRequestA;
    private javax.swing.JButton btnPeopleProfileSave;
    private javax.swing.JButton btnPeopleProfileStatusA;
    private javax.swing.JLabel lblPeoplePeofile;
    private javax.swing.JLabel lblPeoplePeofileAppointment;
    private javax.swing.JLabel lblPeopleProfileAddress;
    private javax.swing.JLabel lblPeopleProfileDOB;
    private javax.swing.JLabel lblPeopleProfileIC;
    private javax.swing.JLabel lblPeopleProfileName;
    private javax.swing.JLabel lblPeopleProfileNew;
    private javax.swing.JLabel lblPeopleProfileOld;
    private javax.swing.JLabel lblPeopleProfileStatus;
    private javax.swing.JPanel pnlPeopleProfile;
    private javax.swing.JTextField txtPeopleProfileAddress;
    private javax.swing.JTextField txtPeopleProfileDOB;
    private javax.swing.JTextField txtPeopleProfileIC;
    private javax.swing.JTextField txtPeopleProfileName;
    private javax.swing.JTextField txtPeopleProfileNew;
    private javax.swing.JTextField txtPeopleProfileOld;
    private javax.swing.JTextField txtPeopleProfileStatus;
    // End of variables declaration//GEN-END:variables
}
