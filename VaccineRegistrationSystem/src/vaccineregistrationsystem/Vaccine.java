package vaccineregistrationsystem;

public class Vaccine {

    private int VaccineAmount, VaccineDuration;
    private String VaccineType;

    public Vaccine() {

    }

    public Vaccine(String VaccineType, int VaccineDuration, int VaccineAmount) {

        this.VaccineType = VaccineType;
        this.VaccineDuration = VaccineDuration;
        this.VaccineAmount = VaccineAmount;
    }

    public Vaccine(String VaccineType) {
        this.VaccineType = VaccineType;
    }

    public Vaccine(int VaccineDuration) {
        this.VaccineDuration = VaccineDuration;
    }
//    GETTER SETTER

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

    public int getVaccineDuration() {
        return VaccineDuration;
    }

    public void setVaccineDuration(int VaccineDuration) {
        this.VaccineDuration = VaccineDuration;
    }

    public String toString() {
        return VaccineType + "," + VaccineDuration + "," + VaccineAmount + "\n";

    }

    public String displayVaccineType() {
        return VaccineType;

    }

}
