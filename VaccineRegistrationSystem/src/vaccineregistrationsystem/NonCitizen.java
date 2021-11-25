package vaccineregistrationsystem;

public class NonCitizen extends People {

    private String PeoplePassport;

    NonCitizen() {
    }

    NonCitizen(String PeoplePassport, String PeoplePassword) {
        super(PeoplePassword);
        this.PeoplePassport = PeoplePassport;
    }

    public NonCitizen(String PeoplePassport, String PeopleName, String PeopleAddress, String PeopleDOB) {
        super(PeopleName, PeopleAddress, PeopleDOB);
        this.PeoplePassport = PeoplePassport;
    }

    public String getPeopleIC() {
        return PeoplePassport;
    }

    public void setPeopleIC(String CitizenIC) {
        this.PeoplePassport = PeoplePassport;
    }
<<<<<<< HEAD
=======
    
    @Override
    public String toString() {
        return PeoplePassport + "," + PeopleName + "," + PeopleAddress + "," + PeopleDOB + ",No Vaccinated\n";
    }
>>>>>>> main

}
