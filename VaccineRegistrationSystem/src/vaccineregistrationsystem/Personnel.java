package vaccineregistrationsystem;

public class Personnel {

    private int PersonnelID;
    private String PersonnelName;

    Personnel(int PersonnelID, String PersonnelName) {
        this.PersonnelID = PersonnelID;
        this.PersonnelName = PersonnelName;
    }

    public int getPersonnelID() {
        return PersonnelID;
    }

    public String getPersonnelName() {
        return PersonnelName;
    }

    public void setPersonnelID(int PersonnelID) {
        this.PersonnelID = PersonnelID;
    }

    public void setPersonnelName(String PersonnelName) {
        this.PersonnelName = PersonnelName;
    }

    public String toString() {
        return PersonnelID + ";" + PersonnelName + ";";
    }
}
