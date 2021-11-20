package vaccineregistrationsystem;

public class Citizen extends People {

    private String CitizenIC;

    Citizen() {
    }

    Citizen(String PeopleName, String PeoplePassword) {
        super(PeopleName, PeoplePassword);
    }
    
    public Citizen(String CitizenIC, String PeopleName, String PeopleAddress, String PeopleDOB) {
        super(PeopleName, PeopleAddress, PeopleDOB);
        this.CitizenIC = CitizenIC;
    }

    public String toString() {
        return CitizenIC + ";" + super.toString();
    }

    public String getPeopleIC() {
        return CitizenIC;
    }
    
    public void setPeopleIC(String CitizenIC){
          this.CitizenIC = CitizenIC;
    };

}
