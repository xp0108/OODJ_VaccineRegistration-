package vaccineregistrationsystem;

abstract public class People {

    private String PeopleName;
    private String PeoplePassword;
    private String PeopleAddress;
    private String PeopleDOB;
    private String PeopleStatus;

    People() {
    }

    People(String PeopleName, String PeoplePassword) {
        this.PeopleName = PeopleName;
        this.PeoplePassword = PeoplePassword;
    }

    People(String PeopleName, String PeopleAddress, String PeopleDOB) {
        this.PeopleName = PeopleName;
        this.PeopleAddress = PeopleAddress;
        this.PeopleDOB = PeopleDOB;
    }

    public String getPeopleName() {
        return PeopleName;
    }

    public String getPeopleAddress() {
        return PeopleAddress;
    }

    public String getPeopleDOB() {
        return PeopleDOB;
    }

    public void setPersonnelName(String PeopleName) {
        this.PeopleName = PeopleName;
    }

    public void setPeopleAddress(String PeopleAddress) {
        this.PeopleAddress = PeopleAddress;
    }

    public void setPeopleDOB(String PeopleDOB) {
        this.PeopleDOB = PeopleDOB;
    }

    public String getPeoplePassword() {
        return PeoplePassword;
    }

    public void setPeoplePassword(String PeoplePassword) {
        this.PeoplePassword = PeoplePassword;
    }

    public String toString() {
        return PeopleName + ";" + PeopleDOB + ";" + PeopleAddress + ";";
    }

    abstract public String getPeopleIC();

    abstract public void setPeopleIC(String PeopleIC);
}
