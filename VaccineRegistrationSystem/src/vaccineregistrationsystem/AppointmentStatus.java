package vaccineregistrationsystem;

public class AppointmentStatus {

    private String pending = "Pending";
    private String active = "Active";
    private String done = "Done";
    private String cancel = "Cancel";

    public String pending() {
        return pending;
    }

    public String active() {
        return active;
    }

    public String done() {
        return done;
    }

    public String cancel() {
        return cancel;
    }
}
