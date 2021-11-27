package vaccineregistrationsystem;

import java.awt.Window;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;

public class PeopleAppointmentStatus extends javax.swing.JDialog {

    Citizen login;

    public PeopleAppointmentStatus(Citizen login, Window owner, ModalityType modalityType) {
        super(owner, modalityType);
        initComponents();
        this.login = login;
        readAppointmentStatus(this.login.getPeopleIC().trim());
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

        jPanel1 = new javax.swing.JPanel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(212, 227, 247));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDose1Center, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblStatusTitle)
                            .addComponent(txtDose1Date, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDose1Status, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(121, 121, 121))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDose1Status)
                                    .addComponent(lblDose1Date)
                                    .addComponent(lblDose1Title)
                                    .addComponent(lblDose1Center)
                                    .addComponent(lblDose2Title)
                                    .addComponent(lblDose2Status)
                                    .addComponent(lblDose2Date)
                                    .addComponent(lblDose2Center))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblAppointmentTitle)
                                .addGap(18, 18, 18)
                                .addComponent(btnRegisterBack, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDose2Center, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDose2Date, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDose2Status, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(121, 121, 121))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lblAppointmentTitle))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRegisterBack)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStatusTitle)
                .addGap(18, 18, 18)
                .addComponent(lblDose1Title)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDose1Center)
                    .addComponent(txtDose1Center, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDose1Date)
                    .addComponent(txtDose1Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDose1Status)
                    .addComponent(txtDose1Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblDose2Title)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDose2Center)
                    .addComponent(txtDose2Center, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDose2Date)
                    .addComponent(txtDose2Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDose2Status)
                    .addComponent(txtDose2Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
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

    private void btnRegisterBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterBackActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRegisterBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegisterBack;
    private javax.swing.JPanel jPanel1;
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
    private javax.swing.JTextField txtDose1Center;
    private javax.swing.JTextField txtDose1Date;
    private javax.swing.JTextField txtDose1Status;
    private javax.swing.JTextField txtDose2Center;
    private javax.swing.JTextField txtDose2Date;
    private javax.swing.JTextField txtDose2Status;
    // End of variables declaration//GEN-END:variables
}
