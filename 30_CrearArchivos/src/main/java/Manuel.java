
import java.util.Formatter;

public class Manuel {

    public static void main(String[] args) {
        final Formatter x;
        
        try {
            //x = new Formatter("manuel.yo");
            //x = new Formatter("manuel.txt");
            new Formatter("manuel.txt");
            System.out.println("Has creado un archivo");
        } catch(Exception ex) {
            System.err.println("Err: " + ex.getMessage());
        }
    }
}
