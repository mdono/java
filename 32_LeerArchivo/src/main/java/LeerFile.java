
import java.io.File;
import java.util.Scanner;

public class LeerFile {

    private Scanner x;
    
    public final void abrirArchivo() {
        try {
            //x = new Scanner(new File("manuel.txt"));
            x = new Scanner(new File("C:\\manuel\\nba.txt"));
        } catch(Exception ex) {
            System.err.println("Err: " + ex.getMessage());
        }
    }
    
    public final void leerArchivo() {
        while(x.hasNext()) {
            String a = x.nextLine();
            System.out.printf("%s\n", a);
        }
    }
    
    public final void cerrarArchivo() {
        x.close();
    }
}
