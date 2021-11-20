package vaccineregistrationsystem;

public class NonCitizen extends People {

    private String Passport;
    
    NonCitizen() {
    }

    NonCitizen(String PeopleName, String PeoplePassword) {
        super(PeopleName, PeoplePassword);
    }

    public NonCitizen(String Passport, String PeopleName, String PeopleAddress, String PeopleDOB) {
        super(PeopleName, PeopleAddress, PeopleDOB);
        this.Passport = Passport;
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
