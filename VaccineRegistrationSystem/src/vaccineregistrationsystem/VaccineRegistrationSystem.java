package vaccineregistrationsystem;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class VaccineRegistrationSystem {

    public static void main(String[] args) {
        try {

            String txtCentre = "sdf";

            String txtVaccine = "";
            Vaccine strVaccineType = new Vaccine(txtVaccine);

            int txtDuration = 0;
            Vaccine intVaccineDuration = new Vaccine(txtDuration);

            String vaccineFile = "vaccine.txt";
            String centreFile = "centre.txt";

            FileReader vaccineFR = new FileReader(vaccineFile);
            BufferedReader vaccineBR = new BufferedReader(vaccineFR);
            String vaccineLine;

            FileReader centreFR = new FileReader(centreFile);
            BufferedReader centreBR = new BufferedReader(centreFR);
            String centreLine;

            boolean isCentre = false;
            boolean isVaccine = false;

            while ((centreLine = centreBR.readLine()) != null) {
                String[] centreArr = centreLine.split("[,\n]");

                if (txtCentre.equals(centreArr[0])) {
                    isCentre = true;
//                    if the centre is match, then get the centre's vaccine 
                    System.out.println(txtCentre + "." + centreArr[0]);
                    if (isCentre == true) {
                        Centre centreVaccine = new Centre();
                        Vaccine vaccineType = new Vaccine(centreArr[2]);
                        centreVaccine.setVaccine(vaccineType);

                        strVaccineType = centreVaccine.getVaccine();

                        System.out.println(strVaccineType);
                        break;
                    }

                    break;

                }
            }
            String[] vaccineArr;
            while ((vaccineLine = vaccineBR.readLine()) != null) {
                vaccineArr = vaccineLine.split("[,\n]");
                String getVT = strVaccineType.getVaccineType();

                System.out.println(getVT);

                if (getVT.equals(vaccineArr[0])) {
                    isVaccine = true;
                    intVaccineDuration.setVaccineDuration(txtDuration);
                    System.out.println(txtDuration);
                    System.out.println("Vaccine Duration" + intVaccineDuration.getVaccineDuration());
                    break;

                }
                break;

            }
            System.out.println(isVaccine);
            
            centreBR.close();
            centreFR.close();
            vaccineBR.close();
            vaccineFR.close();

        } catch (HeadlessException | IOException e) {
            System.out.println(e);
        }
    }

}
