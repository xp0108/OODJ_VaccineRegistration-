package vaccineregistrationsystem;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class Appointment {

    private String appPeopleIC;
    private String appPeopleName;
    private String appDate;
    private Centre appCentre;
    private AppointmentStatus appointmentStatus;
    private String appStatus;

    public Appointment() {
    }

    public Appointment(String appPeopleIC, String appPeopleName, String appdate) {
        this.appPeopleIC = appPeopleIC;
        this.appPeopleName = appPeopleName;
        this.appDate = appdate;
    }

    public Appointment(String appPeopleIC, String appPeopleName, String appdate, Centre appcentre) {
        this.appPeopleIC = appPeopleIC;
        this.appPeopleName = appPeopleName;
        this.appDate = appdate;
        this.appCentre = appcentre;
    }

    public String getAppPeopleIC() {
        return appPeopleIC;
    }

    public void setAppPeopleIC(String appPeopleIC) {
        this.appPeopleIC = appPeopleIC;
    }

    public String getAppPeopleName() {
        return appPeopleName;
    }

    public void setAppPeopleName(String appPeopleName) {
        this.appPeopleName = appPeopleName;
    }

    public String getAppdate() {
        return appDate;
    }

    public void setAppdate(String appdate) {
        this.appDate = appdate;
    }

    public Centre getAppcentre() {
        return appCentre;
    }

    public void setAppcentre(Centre appcentre) {
        this.appCentre = appcentre;
    }

    public String WriteDoseFile() {
        return appPeopleIC + "," + appPeopleName + "," + appCentre.getCentreName() + "," + appDate + "," + this.appStatus + "\n";
    }

    public void setAppStatus(String appStatus) {
        this.appStatus = appStatus;
    }

    public String AssignAppStatus(String appStatus) {
        this.appStatus = appStatus;
        this.appointmentStatus = new AppointmentStatus();

        if (this.appointmentStatus.active().equals(appStatus)) {
            return appStatus = this.appointmentStatus.active();
        } else if (this.appointmentStatus.done().equals(appStatus)) {
            return appStatus = this.appointmentStatus.done();
        } else if (this.appointmentStatus.pending().equals(appStatus)) {
            return appStatus = this.appointmentStatus.pending();
        } else if (this.appointmentStatus.cancel().equals(appStatus)) {
            return appStatus = this.appointmentStatus.cancel();
        }
        return appStatus;
    }

    public String Dose2AppDate(String AppDate, String cmbCentre) {
        int vaccineDuration = 0;
        try {

            String txtVaccine = "";

            Vaccine strVaccineType = new Vaccine(txtVaccine);

            String centreFile = "centre.txt";

            FileReader centreFR = new FileReader(centreFile);
            BufferedReader centreBR = new BufferedReader(centreFR);
            String centreLine;

            while ((centreLine = centreBR.readLine()) != null) {
                String[] centreArr = centreLine.split("[,\n]");

                if (cmbCentre.trim().equals(centreArr[0])) {

//                    if the centre is match, then get the centre's vaccine 
                    System.out.println(cmbCentre + "." + centreArr[0]);

                    Centre centreVaccine = new Centre();
                    Vaccine vaccineType = new Vaccine(centreArr[2]);
                    centreVaccine.setVaccine(vaccineType);

                    strVaccineType = centreVaccine.getVaccine();

                    System.out.println(strVaccineType.displayVaccineType());
                    break;

                }
            }
            centreBR.close();
            centreFR.close();

            String vaccineFile = "vaccine.txt";
            FileReader vaccineFR = new FileReader(vaccineFile);
            BufferedReader vaccineBR = new BufferedReader(vaccineFR);
            String vaccineLine;

//            Aggregation
            Vaccine intVaccineDuration = new Vaccine(vaccineDuration);

            while ((vaccineLine = vaccineBR.readLine()) != null) {
                String[] vaccineArr = vaccineLine.split("[,\n]");

                String getVT = strVaccineType.getVaccineType();

                if (getVT.trim().equals(vaccineArr[0])) {
                    vaccineDuration = Integer.parseInt(vaccineArr[1]);
                    intVaccineDuration.setVaccineDuration(vaccineDuration);
                    System.out.println(vaccineDuration);
                    System.out.println("Vaccine Duration " + intVaccineDuration.getVaccineDuration());

                    break;

                }

            }

            vaccineBR.close();
            vaccineFR.close();

        } catch (HeadlessException | IOException e) {
            System.out.println(e);
        }

        LocalDate ldAppDate = LocalDate.parse(AppDate);
        LocalDate dose2AppDate = ldAppDate.plusMonths(vaccineDuration);

        return dose2AppDate.toString();

    }

    public void PrintAppointmentComponenet(Component component) {
        PrinterJob pj = PrinterJob.getPrinterJob();
        pj.setJobName(" Print Component ");

        pj.setPrintable(new Printable() {
            public int print(Graphics pg, PageFormat pf, int pageNum) {
                if (pageNum > 0) {
                    return Printable.NO_SUCH_PAGE;
                }

                Graphics2D g2 = (Graphics2D) pg;
                g2.translate(pf.getImageableX(), pf.getImageableY());
                component.paint(g2);
                return Printable.PAGE_EXISTS;
            }
        });
        if (pj.printDialog() == false) {
            return;
        }

        try {
            pj.print();
        } catch (PrinterException ex) {
            // handle exception
        }
    }

    public void PeopleRequestAppointment(String ic) {
        //check dose1 file is there any appointment request for this user
        // if these is already a appointment request for this user, show erroe message
        // if no then write into the dose1 file
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
                    break;
                }
            }

            br.close();
            fr.close();

            if (isExist == true) {
                JOptionPane.showMessageDialog(null, "Apointment has already been made", "WARNING!!", JOptionPane.WARNING_MESSAGE);
                return;
            }

            String file1 = "people.txt";
            fr = new FileReader(file1);
            br = new BufferedReader(fr);

            while ((line = br.readLine()) != null) {
                String[] apparr = line.split(",");

                if (ic.equals(apparr[0])) {
                    AddPeopleAppointment(ic, apparr[1]);
                    break;
                }
            }

            br.close();
            fr.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void AddPeopleAppointment(String ic, String name) {
        try {

            File file = new File("dose1.txt");
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);

            String date = "";

            Appointment appointment = new Appointment(ic, name, date);
            bw.write(appointment.getAppPeopleIC());
            bw.write(",");
            bw.write(appointment.getAppPeopleName());
            bw.write(",");
            bw.write("");
            bw.write(",");
            bw.write(appointment.getAppdate());
            bw.write(",");
            bw.write("Pending");
            bw.write("\n");

            JOptionPane.showMessageDialog(null, "Successful Register for Appointment", "Congratulation", JOptionPane.PLAIN_MESSAGE);

            bw.close();
            fw.close();

        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
