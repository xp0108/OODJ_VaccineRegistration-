package vaccineregistrationsystem;

public class Centre {

    private int CentreAmount;
    private String CentreName, CentreAddress;

//    AGGREGATION
    private Vaccine vaccine;

    public Centre(String CentreName, String CentreAddress, Vaccine vaccine, int CentreAmount) {
        this.vaccine = vaccine;
        this.CentreName = CentreName;
        this.CentreAddress = CentreAddress;
        this.CentreAmount = CentreAmount;
    }

/// Constructor
    public Centre() {
    }

    public Centre(String CentreName, String CentreAddress, int CentreAmount) {
        this.CentreName = CentreName;
        this.CentreAddress = CentreAddress;
        this.CentreAmount = CentreAmount;

    }

//    GETTER SETTER
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
}
