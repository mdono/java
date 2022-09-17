
package intecap;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Manuel {
    
    private Connection miConexion;
    private Statement stmt;
    private String url, usuario, contrasena;

    public Manuel(String url, String usuario, String contrasena) {
        this.url = url;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }
    
    public boolean conecta() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            miConexion = DriverManager.getConnection(url, usuario, contrasena);
            System.out.println("Database Connected successfully");
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
            System.err.println("Err: " + ex.getMessage());
            System.out.println("Database Connected failed");
            return false;
        }
        
        //return true;
    }
    
    public String ejecutaConsulta(String consulta) {
        ResultSet rs;
        
        try {
            stmt = miConexion.createStatement();
            rs = stmt.executeQuery(consulta);
            
            while (rs.next()) {
                System.out.println(rs.getString("correlativo"));
                System.out.println(rs.getString("nombre"));
                System.out.println(rs.getString("correo_electronico"));
                System.out.println(rs.getString("fecha_creacion"));
                System.out.println(rs.getString("estado"));
            }
        } catch (SQLException ex) {
            System.err.println("Err: " + ex.getMessage());
            ex.printStackTrace();
        }
        
        return String.format("%s", "Consulta exitosa, imprimiendo...");
    }
    
    public void cerrarConexion() {
        try {
            stmt.close();
            miConexion.close();
        } catch (SQLException ex) {
            System.err.println("Err: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
    
    public static void main(String[] args){
        Manuel instancia = new Manuel(
                "jdbc:mysql://localhost/java", 
                "root", 
                "root"
        );
        String query = "SELECT * FROM manuel";
        
        if (instancia.conecta()) {
            if (instancia.ejecutaConsulta(query) != null) {
                instancia.cerrarConexion();
            }
        } else {
            System.out.println("Sin datos");
        }
    }
}
