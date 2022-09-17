
package intecap;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conectate {

    private Connection conn = null;
    
    public Conectate() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1/java", // URL
                    "root", // USER
                    "root" // PASSWORD
            );
            
            if (conn != null) {
                System.out.println("Conexión exitosa");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println("Err: " + ex.getMessage());
        }
    }
    
    public boolean desconectar() throws SQLException {
        conn.close();
        return true;
    }

    public Connection getConexion() {
        return conn;
    }

    public void setConexion(Connection conn) {
        this.conn = conn;
    }
}
