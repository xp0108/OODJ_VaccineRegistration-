package vaccineregistrationsystem;

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

//    Testing
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
        }
        return appStatus;
    }
}
