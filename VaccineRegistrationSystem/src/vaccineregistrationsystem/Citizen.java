package vaccineregistrationsystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Citizen extends People {

    private String CitizenIC;

    Citizen() {
    }

    Citizen(String CitizenIC, String PeoplePassword) {
        super(PeoplePassword);
        this.CitizenIC = CitizenIC;
    }

    public Citizen(String CitizenIC, String PeopleName, String PeopleAddress, String PeopleDOB) {
        super(PeopleName, PeopleAddress, PeopleDOB);
        this.CitizenIC = CitizenIC;
    }

    public Citizen(String CitizenIC, String PeopleName, String PeopleAddress, String PeopleDOB, String PeopleStatus) {
        super(PeopleName, PeopleAddress, PeopleDOB, PeopleStatus);
        this.CitizenIC = CitizenIC;
    }

    public String getPeopleIC() {
        return CitizenIC;
    }

    public void setPeopleIC(String CitizenIC) {
        this.CitizenIC = CitizenIC;
    }

    @Override
    public String toString() {
        return CitizenIC + "," + PeopleName + "," + PeopleAddress + "," + PeopleDOB + ",No Vaccinated\n";
    }

    public String WritePeopleForDose() {
        return CitizenIC + "," + PeopleName + "," + PeopleAddress + "," + PeopleDOB + "," + PeopleStatus + "\n";
    }

    public void UpdatePeopleStatus(String filePath, String PeopleIC, String PeopleStatus) {
        try {

            File inFile = new File(filePath);

            if (!inFile.isFile()) {
                System.out.println("Parameter is not an existing file");
                return;
            }

            // Construct the new file that will later be renamed to the original
            // filename.
            File tempFile = new File(inFile.getAbsolutePath() + ".tmp");

            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);
            PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

            String line = null;

            while ((line = br.readLine()) != null) {
                String[] poepleDetail = line.split("[,\n]");

                if (!PeopleIC.trim().equals(poepleDetail[0])) {

                    pw.println(line);
                    pw.flush();
                } else if (PeopleIC.trim().equals(poepleDetail[0])) {
                    Citizen people = new Citizen(poepleDetail[0], poepleDetail[1], poepleDetail[2], poepleDetail[3], PeopleStatus);
                    System.out.print(people.WritePeopleForDose());
                    pw.write(people.WritePeopleForDose());
                }
            }

            pw.close();
            br.close();
            fr.close();

            if (!inFile.delete()) {
                System.out.println("Could not delete file");
                return;
            }

            // Rename the new file to the filename the original file had.
            if (!tempFile.renameTo(inFile)) {
                System.out.println("Could not rename file");
            }

        } catch (Exception e) {
            System.out.println("No");
            e.printStackTrace();
        }
    }
}
