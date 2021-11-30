package vaccineregistrationsystem;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Personnel {

    private String PersonnelPassword;
    private String PersonnelUsername;

    Personnel() {
    }

    Personnel(String PersonnelUsername, String PersonnelPassword) {
        this.PersonnelPassword = PersonnelPassword;
        this.PersonnelUsername = PersonnelUsername;
    }

    public String getPersonnelPassword() {
        return PersonnelPassword;
    }

    public String getPersonnelUsername() {
        return PersonnelUsername;
    }

    public void setPersonnelPassword(String PersonnelPassword) {
        this.PersonnelPassword = PersonnelPassword;
    }

    public void setPersonnelUsername(String PersonnelUsername) {
        this.PersonnelUsername = PersonnelUsername;
    }

    public String toString() {
        return PersonnelUsername + "," + PersonnelPassword + ",Personnel\n";
    }

    public static Scanner scnnaer;

    public void AddPersonnel(String PersonnelUsername, String PersonnelPassword, String filepath) {

        boolean found = false;
        String tempUsername = PersonnelUsername;

        try {
            scnnaer = new Scanner(new File(filepath));
            scnnaer.useDelimiter("[,\n]");

            while (scnnaer.hasNext() && !found) {
                tempUsername = scnnaer.next();

                if (tempUsername.trim().equals(PersonnelUsername.trim())) {
                    found = true;
                }
            }

            //after check file
            if (found == true) {

                JOptionPane.showMessageDialog(null, "Username already exist", "Uh Oh...", JOptionPane.WARNING_MESSAGE);

            } else {

                try {
                    File file = new File("login.txt");
                    FileWriter fw = new FileWriter(file, true);
                    BufferedWriter bw = new BufferedWriter(fw);

                    String username = PersonnelUsername;
                    String password = PersonnelPassword;

                    Personnel register = new Personnel(username, password);
                    bw.write(register.toString());

                    bw.close();
                    fw.close();

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error saving or loading data!!!", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Something went wrong, please try again!!!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
