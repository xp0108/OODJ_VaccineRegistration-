package vaccineregistrationsystem;

import java.io.BufferedReader;
import java.io.FileReader;

public class VaccineRegistrationSystem {

    public static void main(String[] args) {

//        Compare 2 files 
        String ic = "121212";
        try {
            String dose1File = "dose1.txt";
            String poepleFile = "people.txt";

            FileReader frDose1 = new FileReader(dose1File);
            BufferedReader brDose1 = new BufferedReader(frDose1);
            String lineDose1 = "";
            boolean checkApp = false;

            FileReader frPeople = new FileReader(poepleFile);
            BufferedReader brPeople = new BufferedReader(frPeople);
            String linePeople = "";

            if ((lineDose1 = brDose1.readLine()) != null) {
                String[] apparr = lineDose1.split("[,\n]");

//                compare file 1
                if (!ic.equals(apparr[0])) {
                    checkApp = true;

                    while ((linePeople = brPeople.readLine()) != null) {
                        String[] people = linePeople.split("[,\n]");

                        if (ic.equals(people[0])) {
                            System.out.println("------------1");
                            System.out.println(people[0] + " " + people[1]);
                            brDose1.close();
                            frDose1.close();

                            brPeople.close();
                            frPeople.close();

//                            addApp(people[0], people[1]);
                        }
                    }
                }
            }

            if (lineDose1 == null) {
                checkApp = true;

                while ((linePeople = brPeople.readLine()) != null) {
                    String[] people = linePeople.split("[,\n]");

//                    compare file 2
                    if (ic.equals(people[0])) {
                        System.out.println("-------------------");
                        System.out.println(people[0] + " " + people[1]);
                        brDose1.close();
                        frDose1.close();

                        brPeople.close();
                        frPeople.close();
//                        addApp(people[0], people[1]);
                    }
                }
            }

            brDose1.close();
            frDose1.close();

            brPeople.close();
            frPeople.close();

            if (checkApp == true) {
                System.out.println("Dose1");
                System.out.println(lineDose1);
                  System.out.println("People");
                System.out.println(linePeople);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
