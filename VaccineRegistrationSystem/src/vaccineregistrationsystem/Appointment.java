package vaccineregistrationsystem;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;

public class Appointment {

    private String appPeopleIC;
    private String appPeopleName;
    private String appdate;
    private Centre appcentre;
    private AppointmentStatus appointmentStatus;
    private String appStatus;

    public Appointment() {
    }

    public Appointment(String appPeopleIC, String appPeopleName, String appdate) {
        this.appPeopleIC = appPeopleIC;
        this.appPeopleName = appPeopleName;
        this.appdate = appdate;
    }

    public Appointment(String appPeopleIC, String appPeopleName, String appdate, Centre appcentre) {
        this.appPeopleIC = appPeopleIC;
        this.appPeopleName = appPeopleName;
        this.appdate = appdate;
        this.appcentre = appcentre;
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
        return appdate;
    }

    public void setAppdate(String appdate) {
        this.appdate = appdate;
    }

    public Centre getAppcentre() {
        return appcentre;
    }

    public void setAppcentre(Centre appcentre) {
        this.appcentre = appcentre;
    }

    public String pending() {
        AppointmentStatus appPending = new AppointmentStatus(); //composition
//        appPending.pending();
        return appPending.pending();
    }

    public String active() {
        AppointmentStatus appActive = new AppointmentStatus(); //composition
        return appActive.active();
    }

    public String done() {
        AppointmentStatus appDane = new AppointmentStatus(); //composition
        return appDane.done();
    }

    public String writeDoseFile() {
        return appPeopleIC + "," + appPeopleName + "," + appcentre.getCentreName() + "," + appdate + "," + this.appStatus + "\n";
    }

    public void setAppStatus(String appStatus) {
        this.appStatus = appStatus;
    }

    public String assignAppStatus(String appStatus) {
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

}
