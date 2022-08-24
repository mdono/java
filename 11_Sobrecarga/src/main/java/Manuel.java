
public class Manuel {
    public static void main(String[] args) {
        //tipo nombre = valor - inicializando la variable
        //tipo nombre - creando la variable
        
        // cuando empleamos la palabra reservada NEW 
        // estamos creando una instancia
        Sobrecarga sobrecarga = new Sobrecarga("Manuel", 16, "ciudad");
        sobrecarga.diciendo();
        
        sobrecarga.Sobrecarga("Manuel", "Progreso Guastatoya", 20);
        sobrecarga.diciendo();
        
        sobrecarga.Sobrecarga("Manuel", 21, "Guatemala");
        sobrecarga.diciendo();
        
        sobrecarga.setNombre("Anibal");
        //sobrecarga.getNombre();
        System.out.println(sobrecarga.getNombre());
    }
}
