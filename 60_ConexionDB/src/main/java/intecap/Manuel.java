
package intecap;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Manuel {

    private String url, usuario, contrasena;
    private Connection miConexion;
    private PreparedStatement ptmt = null;

    public Manuel(String url, String usuario, String contrasena) {
        this.url = url;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }
    
    public boolean conecta() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            miConexion = DriverManager.getConnection(
                    url, 
                    usuario, 
                    contrasena
            );
            
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println("Err: " + ex.getMessage());
            return false;
        }
        
        //return false;
    }
    
    public String ejecutaConsulta(String consulta) {
        try {
            ptmt = miConexion.prepareStatement(consulta);
            ptmt.setString(1, "Pedro");
            ptmt.setString(2, "prodriguez@gmail.com");
            ptmt.executeUpdate();
            
            return String.format("%s", "Inserción exitosa");
        } catch (SQLException ex) {
            System.err.println("Err: " + ex.getMessage());
            return null;
        }
        
        //return null;
    }
    
    public void cerrarConexion() {
        try {
            ptmt.close();
            miConexion.close();
        } catch (SQLException ex) {
            System.err.println("Err: " + ex.getMessage());
        }
    }
    
    public static void main(String[] args) {
        Manuel instancia = new Manuel(
                "jdbc:mysql://localhost/java", 
                "root", 
                "root"
        );
        String query = "INSERT INTO manuel(nombre, correo_electronico) VALUES(?,?)";
        
        if (instancia.conecta()) {
            if (instancia.ejecutaConsulta(query) != null) {
                instancia.cerrarConexion();
            }
        } else {
            System.out.println("Sin datos");
        }
    }
}