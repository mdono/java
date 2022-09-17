
package intecap;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Manuel {
    
    public static void main(String[] args) {
        Conectate instancia = new Conectate();
        
        if (instancia.getConexion() != null) {
            try {
                instancia.desconectar();
                System.out.println("Desconectado exitosamente");
            } catch (SQLException ex) {
                System.err.println("Err: " + ex.getMessage());
            }
        }
    }
}
