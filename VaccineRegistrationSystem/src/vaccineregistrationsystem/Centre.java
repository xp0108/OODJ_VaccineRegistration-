package vaccineregistrationsystem;

import java.awt.Font;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

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

    public Centre(String CentreName) {
        this.CentreName = CentreName;
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

    public int minusOneVaccine() {
        int updatedCentreAmount = 0;

        updatedCentreAmount = CentreAmount - 1;

        return updatedCentreAmount;
    }

//    AGGREGATION 
    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public String toString() {
        return CentreName + "," + CentreAddress + "," + vaccine.getVaccineType() + "," + CentreAmount + "\n";
    }

    public int UpdateCentreAmount(String cmbCentreDONE) {
        int updatedCentreAmt = 0;
        try {

            Centre centreName = new Centre(cmbCentreDONE);

            String centreFile = "centre.txt";

            FileReader centreFR = new FileReader(centreFile);
            BufferedReader centreBR = new BufferedReader(centreFR);
            String centreLine;

            while ((centreLine = centreBR.readLine()) != null) {
                String[] centreArr = centreLine.split("[,\n]");

                if (cmbCentreDONE.trim().equals(centreArr[0])) {

//                    if the centre is match, then get the centre's vaccine 
                    Centre centreAmt = new Centre();
                    int CentreAmount = Integer.parseInt(centreArr[3]);
                    centreAmt.setCentreAmount(CentreAmount);

                    updatedCentreAmt = centreAmt.minusOneVaccine();

                    break;

                }
            }
            centreBR.close();
            centreFR.close();
        } catch (HeadlessException | IOException e) {
            System.out.println(e);
        }

        return updatedCentreAmt;
    }

    public void UpdateCentreFileAfterDeduct(String cmbCentreDONE) {
        int updateCentreAmt = 0;
        Centre centre = new Centre();
        updateCentreAmt = centre.UpdateCentreAmount(cmbCentreDONE);

        try {

            File inFile = new File("centre.txt");

            if (!inFile.isFile()) {
                System.out.println("Parameter is not an existing file");
                return;
            }

            // Construct the new file that will later be renamed to the original
            // filename.
            File tempFile = new File(inFile.getAbsolutePath() + ".tmp");

            FileReader fr = new FileReader("centre.txt");
            BufferedReader br = new BufferedReader(fr);
            PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

            String line = null;

            while ((line = br.readLine()) != null) {
                String[] centreDetails = line.split("[,\n]");

                if (!cmbCentreDONE.trim().equals(centreDetails[0])) {

                    pw.println(line);
                    pw.flush();
                } else if (cmbCentreDONE.trim().equals(centreDetails[0])) {
                    Vaccine vaccine = new Vaccine(centreDetails[2]);
                    Centre updateCentre = new Centre(centreDetails[0], centreDetails[1], vaccine, updateCentreAmt);
                    pw.write(updateCentre.toString());
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

    public void ShowCentreDropDown(javax.swing.JComboBox<String> cmbCentre) {
        try {
            String file = "centre.txt";
            BufferedReader br = new BufferedReader(new FileReader(file));
            List<String> centreList = new ArrayList<String>();
            String line;
            try {
                while ((line = br.readLine()) != null) {
                    String[] loginarr = line.split("[,\n]");
                    centreList.add(loginarr[0]);
                }
            } catch (FileNotFoundException e) {
                System.err.println("Error, file " + file + " didn't exist.");
            } finally {
                br.close();
            }
            DefaultComboBoxModel<String> lineArray = new DefaultComboBoxModel(centreList.toArray());

            cmbCentre.setModel(lineArray);
        } catch (HeadlessException | IOException e) {
            System.out.println(e);
        }
    }

    public void ShowCentreData(javax.swing.JTable tableCentre) {
        // show data in the JTable
        File fileCentre = new File("centre.txt");
        try ( BufferedReader br = new BufferedReader(new FileReader(fileCentre));) {
            tableCentre.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 15));

            DefaultTableModel model = (DefaultTableModel) tableCentre.getModel();

            Object[] data = br.lines().toArray();

            // extratct data from lines
            // set data to jtable model
            for (int i = 0; i < data.length; i++) {
                String line = data[i].toString().trim();
                String[] dataRow = line.split("[,\n]");

                model.addRow(dataRow);

            }
            br.close();

        } catch (IOException ex) {
            Logger.getLogger(ManageCentre.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
