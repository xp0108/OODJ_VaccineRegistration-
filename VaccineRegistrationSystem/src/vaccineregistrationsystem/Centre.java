package vaccineregistrationsystem;

public class Centre {

    private int CentreID, CentreAmount;
    private String CentreName, CentreAddress;

//    AGGREGATION
    private Vaccine vaccine;

/// Constructor
    public Centre() {
    }

    public Centre(int CentreID, String CentreName, String CentreAddress, int CentreAmount) {
        this.CentreID = CentreID;
        this.CentreName = CentreName;
        this.CentreAddress = CentreAddress;
        this.CentreAmount = CentreAmount;

    }

//    GETTER SETTER
    public int getCentreID() {
        return CentreID;
    }

    public void setCentreID(int CentreID) {
        this.CentreID = CentreID;
    }

    public int getCentreAmount() {
        return CentreAmount;
    }

    public void setCentreAmount(int CentreAmount) {
        this.CentreAmount = CentreAmount;
    }

    public String getCentreName() {
        return CentreName;
    }

    public void setCentreName(String CentreName) {
        this.CentreName = CentreName;
    }

    public String getCentreAddress() {
        return CentreAddress;
    }

    public void setCentreAddress(String CentreAddress) {
        this.CentreAddress = CentreAddress;
    }

//    AGGREGATION 
    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    public int getVaccineID() {
        return vaccine.getVaccineID();
    }

}
