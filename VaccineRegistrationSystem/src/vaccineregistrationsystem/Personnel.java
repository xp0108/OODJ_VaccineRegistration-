package vaccineregistrationsystem;

public class Personnel {

    private String PersonnelPassword;
    private String PersonnelUsername;

    Personnel(String PersonnelUsername, String PersonnelPassword) {
        this.PersonnelPassword = PersonnelPassword;
        this.PersonnelUsername = PersonnelUsername;
    }

    public String getPersonnelPassword() {
        return PersonnelPassword;
    }

    public String getPersonnelUsername() {
        return PersonnelUsername;
    }

    public void setPersonnelPassword(String PersonnelPassword) {
        this.PersonnelPassword = PersonnelPassword;
    }

    public void setPersonnelUsername(String PersonnelUsername) {
        this.PersonnelUsername = PersonnelUsername;
    }

    public String toString() {
        return PersonnelUsername + ";" + PersonnelPassword + ";";
    }
}
