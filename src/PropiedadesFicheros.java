import java.io.File;
import java.io.FileNotFoundException;
    public class PropiedadesFicheros {
        public static void main(String[] args) {
            File f = new File("D:/notas/correos.txt");
            if(f.exists()){
                System.out.println("Nombre del archivo: "+f.getName());
                System.out.println("Camino"+f.getPath());
                System.out.println("Camino absoluto: "
                        +f.getAbsolutePath());
                        System.out.println("Se puede escribir: "+f.canRead());
                System.out.println("Se puede leer: "+f.canWrite());
                System.out.println("Tamaño "+f.length());
            }
        }
    }
