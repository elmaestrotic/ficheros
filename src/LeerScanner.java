import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerScanner {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("D:/notas/correos.txt"));
        String linea="";
        while (sc.hasNext()) {
            linea = sc.nextLine();
            System.out.println(linea);
        }//end while
    }//end main
}