package vaccineregistrationsystem;

public class Citizen extends People {

    private String CitizenIC;

    public Citizen(String CitizenIC, int PeopleID, String PeopleName, String PeopleAddress, String PeopleDOB, String PeopleStatus) {
        super(PeopleID, PeopleName, PeopleAddress, PeopleDOB, PeopleStatus);
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
