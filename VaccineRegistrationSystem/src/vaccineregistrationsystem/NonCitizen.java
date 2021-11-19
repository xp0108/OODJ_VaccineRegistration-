package vaccineregistrationsystem;

public class NonCitizen extends People {

    private String PeoplePassport;

    public NonCitizen(String Passport,int PeopleID, String PeopleName, String PeopleAddress, String PeopleDOB, String PeopleStatus) {
        super(PeopleID, PeopleName, PeopleAddress, PeopleDOB, PeopleStatus);
        this.PeoplePassport = Passport;
    }

    public String toString() {
        return PeoplePassport + ";" + super.toString();
    }

    public String getPeopleIC() {
        return PeoplePassport;
    }

    public void setPeopleIC(String CitizenIC) {
        this.PeoplePassport = PeoplePassport;
    }
;
}
