package vaccineregistrationsystem;

abstract public class People {

    private int PeopleID;
    private String PeopleName;
    private String PeopleAddress;
    private String PeopleDOB;
    private String PeopleStatus;

    People(int PeopleID, String PeopleName, String PeopleAddress, String PeopleDOB, String PeopleStatus) {
        this.PeopleID = PeopleID;
        this.PeopleName = PeopleName;
        this.PeopleAddress = PeopleAddress;
        this.PeopleDOB = PeopleDOB;
        this.PeopleStatus = PeopleStatus;
    }

    public int getPeopleID() {
        return PeopleID;
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

    public String getPeopleStatus() {
        return PeopleStatus;
    }

    public void setPeopleID(int PeopleID) {
        this.PeopleID = PeopleID;
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

    public void setPeopleStatus(String PeopleStatus) {
        this.PeopleStatus = PeopleStatus;
    }

    public String toString() {
        return PeopleID + ";" + PeopleName + ";" + PeopleDOB + ";" + PeopleAddress + ";" + PeopleStatus + ";";
    }

    abstract public String getPeopleIC();

    abstract public void setPeopleIC(String PeopleIC);
}
