package vaccineregistrationsystem;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Window;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.BufferedReader;
import java.io.FileReader;

public class PeopleAppointmentStatus extends javax.swing.JDialog {

    Citizen login;

    public PeopleAppointmentStatus(Citizen login, Window owner, ModalityType modalityType) {
        super(owner, modalityType);
        initComponents();
        this.login = login;
        readAppointmentStatus(this.login.getPeopleIC().trim());
        txtAppSIC.setText(this.login.getPeopleIC().trim());

        if (txtDose1Status.getText().trim().equals("Done") && txtDose2Status.getText().trim().equals("Done")) {
            btnRegisterPrint.setEnabled(true);
        }
    }

    @SuppressWarnings("unchecked")

    public void readAppointmentStatus(String ic) {
        try {
            String file = "dose1.txt";
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            boolean isExist = false;

            while ((line = br.readLine()) != null) {
                String[] apparr = line.split(",");

                if (ic.equals(apparr[0])) {
                    isExist = true;
                    txtDose1Center.setText(apparr[2]);
                    txtDose1Date.setText(apparr[3]);
                    txtDose1Status.setText(apparr[4]);
                    break;
                }
            }

            br.close();
            fr.close();

            String file1 = "dose2.txt";
            fr = new FileReader(file1);
            br = new BufferedReader(fr);

            while ((line = br.readLine()) != null) {
                String[] apparr = line.split(",");

                if (ic.equals(apparr[0])) {
                    txtDose2Center.setText(apparr[2]);
                    txtDose2Date.setText(apparr[3]);
                    txtDose2Status.setText(apparr[4]);
                    break;
                }
            }

            br.close();
            fr.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlAppointmentStatus = new javax.swing.JPanel();
        lblAppointmentTitle = new javax.swing.JLabel();
        lblStatusTitle = new javax.swing.JLabel();
        lblDose1Title = new javax.swing.JLabel();
        lblDose1Center = new javax.swing.JLabel();
        txtDose1Center = new javax.swing.JTextField();
        lblDose1Date = new javax.swing.JLabel();
        txtDose1Date = new javax.swing.JTextField();
        lblDose1Status = new javax.swing.JLabel();
        txtDose1Status = new javax.swing.JTextField();
        lblDose2Title = new javax.swing.JLabel();
        lblDose2Center = new javax.swing.JLabel();
        txtDose2Date = new javax.swing.JTextField();
        lblDose2Date = new javax.swing.JLabel();
        txtDose2Status = new javax.swing.JTextField();
        lblDose2Status = new javax.swing.JLabel();
        txtDose2Center = new javax.swing.JTextField();
        btnRegisterBack = new javax.swing.JButton();
        btnRegisterPrint = new javax.swing.JButton();
        lblAppSIC = new javax.swing.JLabel();
        txtAppSIC = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        pnlAppointmentStatus.setBackground(new java.awt.Color(212, 227, 247));

        lblAppointmentTitle.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        lblAppointmentTitle.setForeground(new java.awt.Color(0, 0, 0));
        lblAppointmentTitle.setText("Appointment");

        lblStatusTitle.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        lblStatusTitle.setForeground(new java.awt.Color(0, 0, 0));
        lblStatusTitle.setText("Status");

        lblDose1Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblDose1Title.setForeground(new java.awt.Color(0, 0, 0));
        lblDose1Title.setText("Dose 1:");

        lblDose1Center.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDose1Center.setForeground(new java.awt.Color(0, 0, 0));
        lblDose1Center.setText("Center:");

        txtDose1Center.setBackground(new java.awt.Color(60, 63, 65));
        txtDose1Center.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDose1Center.setForeground(new java.awt.Color(0, 0, 0));
        txtDose1Center.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtDose1Center.setEnabled(false);

        lblDose1Date.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDose1Date.setForeground(new java.awt.Color(0, 0, 0));
        lblDose1Date.setText("Date:");

        txtDose1Date.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDose1Date.setForeground(new java.awt.Color(0, 0, 0));
        txtDose1Date.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtDose1Date.setEnabled(false);

        lblDose1Status.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDose1Status.setForeground(new java.awt.Color(0, 0, 0));
        lblDose1Status.setText("Status:");

        txtDose1Status.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDose1Status.setForeground(new java.awt.Color(0, 0, 0));
        txtDose1Status.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtDose1Status.setEnabled(false);

        lblDose2Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblDose2Title.setForeground(new java.awt.Color(0, 0, 0));
        lblDose2Title.setText("Dose 2:");

        lblDose2Center.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDose2Center.setForeground(new java.awt.Color(0, 0, 0));
        lblDose2Center.setText("Center:");

        txtDose2Date.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDose2Date.setForeground(new java.awt.Color(0, 0, 0));
        txtDose2Date.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtDose2Date.setEnabled(false);

        lblDose2Date.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDose2Date.setForeground(new java.awt.Color(0, 0, 0));
        lblDose2Date.setText("Date:");

        txtDose2Status.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDose2Status.setForeground(new java.awt.Color(0, 0, 0));
        txtDose2Status.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtDose2Status.setEnabled(false);

        lblDose2Status.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDose2Status.setForeground(new java.awt.Color(0, 0, 0));
        lblDose2Status.setText("Status:");

        txtDose2Center.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDose2Center.setForeground(new java.awt.Color(0, 0, 0));
        txtDose2Center.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtDose2Center.setEnabled(false);

        btnRegisterBack.setBackground(new java.awt.Color(0, 0, 0));
        btnRegisterBack.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRegisterBack.setForeground(new java.awt.Color(255, 255, 255));
        btnRegisterBack.setText("Back");
        btnRegisterBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterBackActionPerformed(evt);
            }
        });

        btnRegisterPrint.setBackground(new java.awt.Color(0, 0, 0));
        btnRegisterPrint.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRegisterPrint.setForeground(new java.awt.Color(255, 255, 255));
        btnRegisterPrint.setText("Print");
        btnRegisterPrint.setEnabled(false);
        btnRegisterPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterPrintActionPerformed(evt);
            }
        });

        lblAppSIC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblAppSIC.setForeground(new java.awt.Color(0, 0, 0));
        lblAppSIC.setText("IC/Passport:");

        txtAppSIC.setBackground(new java.awt.Color(60, 63, 65));
        txtAppSIC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtAppSIC.setForeground(new java.awt.Color(0, 0, 0));
        txtAppSIC.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtAppSIC.setEnabled(false);

        javax.swing.GroupLayout pnlAppointmentStatusLayout = new javax.swing.GroupLayout(pnlAppointmentStatus);
        pnlAppointmentStatus.setLayout(pnlAppointmentStatusLayout);
        pnlAppointmentStatusLayout.setHorizontalGroup(
            pnlAppointmentStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAppointmentStatusLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnRegisterBack, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAppointmentStatusLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlAppointmentStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAppointmentStatusLayout.createSequentialGroup()
                        .addComponent(lblStatusTitle)
                        .addGap(201, 201, 201))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAppointmentStatusLayout.createSequentialGroup()
                        .addComponent(lblAppointmentTitle)
                        .addGap(104, 104, 104))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAppointmentStatusLayout.createSequentialGroup()
                        .addComponent(btnRegisterPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(217, 217, 217))))
            .addGroup(pnlAppointmentStatusLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(pnlAppointmentStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlAppointmentStatusLayout.createSequentialGroup()
                        .addComponent(lblAppSIC)
                        .addGap(18, 18, 18)
                        .addComponent(txtAppSIC, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAppointmentStatusLayout.createSequentialGroup()
                        .addGroup(pnlAppointmentStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDose1Status)
                            .addComponent(lblDose1Date)
                            .addComponent(lblDose1Title)
                            .addComponent(lblDose1Center)
                            .addComponent(lblDose2Title)
                            .addComponent(lblDose2Status)
                            .addComponent(lblDose2Date)
                            .addComponent(lblDose2Center))
                        .addGap(18, 18, 18)
                        .addGroup(pnlAppointmentStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAppointmentStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDose1Center, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDose1Date, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDose1Status, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAppointmentStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDose2Center, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDose2Date, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDose2Status, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        pnlAppointmentStatusLayout.setVerticalGroup(
            pnlAppointmentStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAppointmentStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegisterBack)
                .addGap(11, 11, 11)
                .addComponent(lblAppointmentTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStatusTitle)
                .addGap(29, 29, 29)
                .addGroup(pnlAppointmentStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAppSIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAppSIC))
                .addGap(33, 33, 33)
                .addComponent(lblDose1Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAppointmentStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDose1Center, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDose1Center))
                .addGap(18, 18, 18)
                .addGroup(pnlAppointmentStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDose1Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDose1Date))
                .addGap(18, 18, 18)
                .addGroup(pnlAppointmentStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDose1Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDose1Status))
                .addGap(18, 18, 18)
                .addComponent(lblDose2Title)
                .addGap(18, 18, 18)
                .addGroup(pnlAppointmentStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDose2Center, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDose2Center))
                .addGap(18, 18, 18)
                .addGroup(pnlAppointmentStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDose2Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDose2Date))
                .addGap(18, 18, 18)
                .addGroup(pnlAppointmentStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDose2Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDose2Status))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(btnRegisterPrint)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlAppointmentStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlAppointmentStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterBackActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRegisterBackActionPerformed

    private void btnRegisterPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterPrintActionPerformed
        Appointment appointment = new Appointment();
        appointment.PrintAppointmentComponenet(pnlAppointmentStatus);
    }//GEN-LAST:event_btnRegisterPrintActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegisterBack;
    private javax.swing.JButton btnRegisterPrint;
    private javax.swing.JLabel lblAppSIC;
    private javax.swing.JLabel lblAppointmentTitle;
    private javax.swing.JLabel lblDose1Center;
    private javax.swing.JLabel lblDose1Date;
    private javax.swing.JLabel lblDose1Status;
    private javax.swing.JLabel lblDose1Title;
    private javax.swing.JLabel lblDose2Center;
    private javax.swing.JLabel lblDose2Date;
    private javax.swing.JLabel lblDose2Status;
    private javax.swing.JLabel lblDose2Title;
    private javax.swing.JLabel lblStatusTitle;
    private javax.swing.JPanel pnlAppointmentStatus;
    private javax.swing.JTextField txtAppSIC;
    private javax.swing.JTextField txtDose1Center;
    private javax.swing.JTextField txtDose1Date;
    private javax.swing.JTextField txtDose1Status;
    private javax.swing.JTextField txtDose2Center;
    private javax.swing.JTextField txtDose2Date;
    private javax.swing.JTextField txtDose2Status;
    // End of variables declaration//GEN-END:variables
}
