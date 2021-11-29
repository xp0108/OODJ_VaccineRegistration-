package vaccineregistrationsystem;

public class VaccineRegistrationSystem {

    public static void main(String[] args) {

//        try {
//            String IC = "1111";
//            String peopleStatus = "Dose 1";
//            File inFile = new File("people.txt");
//
//            if (!inFile.isFile()) {
//                System.out.println("Parameter is not an existing file");
//                return;
//            }
//
//            // Construct the new file that will later be renamed to the original
//            // filename.
//            File tempFile = new File(inFile.getAbsolutePath() + ".tmp");
//
//            FileReader fr = new FileReader("people.txt");
//            BufferedReader br = new BufferedReader(fr);
//            PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
//
//            String line = null;
//
//            while ((line = br.readLine()) != null) {
//                String[] poepleDetail = line.split("[,\n]");
//
//                if (!IC.trim().equals(poepleDetail[0])) {
//
//                    pw.println(line);
//                    pw.flush();
//                } else if (IC.trim().equals(poepleDetail[0])) {
//                    Citizen people = new Citizen(poepleDetail[0], poepleDetail[1], poepleDetail[2], poepleDetail[3], peopleStatus);
//                    System.out.print(people.writePeopleForDose());
//                    pw.write(people.writePeopleForDose());
//                }
//            }
//
//            pw.close();
//            br.close();
//            fr.close();
//
//            if (!inFile.delete()) {
//                System.out.println("Could not delete file");
//                return;
//            }
//
//            // Rename the new file to the filename the original file had.
//            if (!tempFile.renameTo(inFile)) {
//                System.out.println("Could not rename file");
//            }
//
//        } catch (Exception e) {
//            System.out.println("No");
//            e.printStackTrace();
//        }
    }
}
