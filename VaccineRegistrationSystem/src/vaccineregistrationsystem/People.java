package vaccineregistrationsystem;

import java.util.Scanner;
import javax.swing.JOptionPane;

abstract public class People {

    protected String PeopleName;
    protected String PeoplePassword;
    protected String PeopleAddress;
    protected String PeopleDOB;
    protected String PeopleStatus;

    People() {
    }

    People(String PeoplePassword) {
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

    public void setPeopleName(String PeopleName) {
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

    public String getPeopleStatus() {
        return PeopleStatus;
    }

    public void setPeopleStatus(String PeopleStatus) {
        this.PeopleStatus = PeopleStatus;
    }

    abstract public String getPeopleIC();

    abstract public void setPeopleIC(String PeopleIC);
    
    @Override
    public String toString() {
        return PeopleName + "," + PeopleAddress + "," + PeopleDOB + ",No Vaccinated\n";
    }
    
}
