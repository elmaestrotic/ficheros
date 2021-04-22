
import java.io.*;

class StreamFiles {
    public static void main(String[] args) {
        try {
            File inputFile = new File("D:/notas/correos.txt");
            File outputFile = new File("D:/notas/backup.txt");
            FileInputStream fis = new FileInputStream(inputFile);
            FileOutputStream fos = new  FileOutputStream(outputFile);
            int c;
            while ((c = fis.read()) != -1) {
                fos.write(c);
            }
            fis.close();
            fos.close();
        } catch (FileNotFoundException e) {
            System.err.println("FileStreamsTest: " + e);
        } catch (IOException e) {
            System.err.println("FileStreamsTest: " + e);
        }
    }
}