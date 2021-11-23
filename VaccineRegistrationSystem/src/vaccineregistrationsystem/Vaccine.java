package vaccineregistrationsystem;

public class Vaccine {

    private int VaccineID, VaccineAmount;
    private String VaccineType, VaccineDuration;

    public Vaccine() {

    }

    public Vaccine(int VaccineID, String VaccineType, String VaccineDuration, int VaccineAmount) {
        this.VaccineID = VaccineID;
        this.VaccineType = VaccineType;
        this.VaccineDuration = VaccineDuration;
        this.VaccineAmount = VaccineAmount;
    }
//    GETTER SETTER

    public int getVaccineID() {
        return VaccineID;
    }

    public void setVaccineID(int VaccineID) {
        this.VaccineID = VaccineID;
    }

    public int getVaccineAmount() {
        return VaccineAmount;
    }

    public void setVaccineAmount(int VaccineAmount) {
        this.VaccineAmount = VaccineAmount;
    }

    public String getVaccineType() {
        return VaccineType;
    }

    public void setVaccineType(String VaccineType) {
        this.VaccineType = VaccineType;
    }

    public String getVaccineDuration() {
        return VaccineDuration;
    }

    public void setVaccineDuration(String VaccineDuration) {
        this.VaccineDuration = VaccineDuration;
    }

    public String toString() {
        return VaccineID + "," + VaccineType + "," + VaccineDuration + "," + VaccineAmount + "\n";
    }
}
