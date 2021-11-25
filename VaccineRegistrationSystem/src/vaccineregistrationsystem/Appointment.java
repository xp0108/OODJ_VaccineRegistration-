package vaccineregistrationsystem;

public class Appointment {

    public String appPeopleIC;
    public String appPeopleName;
    public String appdate;
    public Centre appcentre;

    public Appointment() {
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

    public void pending() {
        AppointmentStatus appPending = new AppointmentStatus(); //composition
        appPending.pending();
    }

    public void active() {
        AppointmentStatus appActive = new AppointmentStatus(); //composition
        appActive.active();
    }

    public void done() {
        AppointmentStatus appDane = new AppointmentStatus(); //composition
        appDane.done();
    }

    public String toString() {
        return appPeopleIC + "," + appPeopleName + "," + appcentre + "," + appdate;
    }

}
