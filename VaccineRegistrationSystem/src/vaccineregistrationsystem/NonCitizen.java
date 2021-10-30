package vaccineregistrationsystem;

public class NonCitizen extends People {

    private String Passport;

    public NonCitizen(String Passport,int PeopleID, String PeopleName, String PeopleAddress, String PeopleDOB, String PeopleStatus) {
        super(PeopleID, PeopleName, PeopleAddress, PeopleDOB, PeopleStatus);
        this.Passport = Passport;
    }

    public String toString() {
        return Passport + ";" + super.toString();
    }

    public String getPeopleIC() {
        return Passport;
    }

    public void setPeopleIC(String CitizenIC) {
        this.Passport = Passport;
    }
;
}
