
import java.util.Formatter;

public class EscribeFile {

    private Formatter x;
    
    public final void abrirArchivo() {
        try {
            x = new Formatter("manuel.txt");
        } catch (Exception ex) {
            System.err.println("Err: " + ex.getMessage());
        }
    }
    
    public final void escribirArhivo() {
        x.format(
                "%s %s %s %s", 
                "Manuel","Edgardo","Doño","Lobo"
        );
    }
    
    public final void cerrarArchivo() {
        x.close();
        System.out.println("Archivo grabado");
    }
}
