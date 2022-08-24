
public class Sobrecarga {
    private String nombre;
    private int edad;
    public String direccion;
    
    // este es el constructor
    public Sobrecarga(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }
    
    // sobrecarga
    public void Sobrecarga(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }
    
    //sobrecarga
    public void Sobrecarga(String nombre, String direccion, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }
    
    //sobrecarga
    public void Sobrecarga(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    //método
    public void diciendo() {
        System.out.println("nombre: " + nombre + " edad: " + edad  + " dirección: " + direccion);
    }
    
    // setters & getters
    public String getNombre() {
        return nombre;
    }
    
    // set - get - to
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
