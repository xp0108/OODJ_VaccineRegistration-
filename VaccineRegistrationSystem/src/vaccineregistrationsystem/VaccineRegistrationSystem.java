package vaccineregistrationsystem;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;

public class VaccineRegistrationSystem {

    public static void main(String[] args) {
        int txtDuration = 0;
        try {

            String txtCentre = "qqq";
            String txtVaccine = "";

            Vaccine strVaccineType = new Vaccine(txtVaccine);

            String centreFile = "centre.txt";

            FileReader centreFR = new FileReader(centreFile);
            BufferedReader centreBR = new BufferedReader(centreFR);
            String centreLine;

            while ((centreLine = centreBR.readLine()) != null) {
                String[] centreArr = centreLine.split("[,\n]");

                System.out.println("aaaa " + centreArr[0]);
                if (txtCentre.equals(centreArr[0])) {

//                    if the centre is match, then get the centre's vaccine 
                    System.out.println(txtCentre + "." + centreArr[0]);

                    Centre centreVaccine = new Centre();
                    Vaccine vaccineType = new Vaccine(centreArr[2]);
                    centreVaccine.setVaccine(vaccineType);

                    strVaccineType = centreVaccine.getVaccine();

                    System.out.println(strVaccineType.displayVaccineType());
                    break;

                }
            }
            centreBR.close();
            centreFR.close();

            String vaccineFile = "vaccine.txt";
            FileReader vaccineFR = new FileReader(vaccineFile);
            BufferedReader vaccineBR = new BufferedReader(vaccineFR);
            String vaccineLine;

//            Aggregation
            Vaccine intVaccineDuration = new Vaccine(txtDuration);

            while ((vaccineLine = vaccineBR.readLine()) != null) {
                String[] vaccineArr = vaccineLine.split("[,\n]");

                String getVT = strVaccineType.getVaccineType();

                System.out.println("bbb  " + vaccineArr[0]);
                if (getVT.trim().equals(vaccineArr[0])) {
                    txtDuration = Integer.parseInt(vaccineArr[1]);
                    intVaccineDuration.setVaccineDuration(txtDuration);
                    System.out.println(txtDuration);
                    System.out.println("Vaccine Duration " + intVaccineDuration.getVaccineDuration());

                    break;

                }

            }

            vaccineBR.close();
            vaccineFR.close();

        } catch (HeadlessException | IOException e) {
            System.out.println(e);
        }

        System.out.println(LocalDate.now().plusMonths(txtDuration));
    }

}
