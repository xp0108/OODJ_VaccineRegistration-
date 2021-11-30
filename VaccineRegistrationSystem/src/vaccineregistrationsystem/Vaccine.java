package vaccineregistrationsystem;

import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

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

    public void PrintVaccineComponenet(Component component) {
        PrinterJob pj = PrinterJob.getPrinterJob();
        pj.setJobName(" Print Component ");

        pj.setPrintable(new Printable() {
            public int print(Graphics pg, PageFormat pf, int pageNum) {
                if (pageNum > 0) {
                    return Printable.NO_SUCH_PAGE;
                }

                Graphics2D g2 = (Graphics2D) pg;
                g2.translate(pf.getImageableX(), pf.getImageableY());
                component.paint(g2);
                return Printable.PAGE_EXISTS;
            }
        });
        if (pj.printDialog() == false) {
            return;
        }

        try {
            pj.print();
        } catch (PrinterException ex) {
            // handle exception
        }
    }

    public void ShowCmbVeccineTypeData(javax.swing.JComboBox<String> cmbVaccineType) {
        try {
            String file = "vaccine.txt";
            BufferedReader br = new BufferedReader(new FileReader(file));
            List<String> vaccineTypes = new ArrayList<String>();
            String line;
            try {
                while ((line = br.readLine()) != null) {
                    String[] loginarr = line.split("[,\n]");
                    vaccineTypes.add(loginarr[0]);
                }
            } catch (FileNotFoundException e) {
                System.err.println("Error, file " + file + " didn't exist.");
            } finally {
                br.close();
            }
            DefaultComboBoxModel<String> lineArray = new DefaultComboBoxModel(vaccineTypes.toArray());

            cmbVaccineType.setModel(lineArray);
        } catch (HeadlessException | IOException e) {
            System.out.println(e);
        }
    }

    public void ShowVaccineData(javax.swing.JTable tableVaccine) {
        // show data in the JTable
        File fileVaccine = new File("vaccine.txt");
        try ( BufferedReader br = new BufferedReader(new FileReader(fileVaccine));) {
            tableVaccine.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 15));

            DefaultTableModel model = (DefaultTableModel) tableVaccine.getModel();

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
            Logger.getLogger(ManageVaccine.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
