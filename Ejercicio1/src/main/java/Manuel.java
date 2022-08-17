
import javax.swing.JOptionPane;

public class Manuel {
    public static void main(String[] args) {
        String cadena;
        int opcion = 0;
        
        do {
            cadena = JOptionPane.showInputDialog("Las operaciones que puedes realizar son\n[1] Sumas\n[2] Restas\n[3] Multiplicaciones\n[4] Divisiones\nElige una opción ingresando el número de la operación");
            opcion = Integer.parseInt(cadena);
            //System.out.println(opcion);
        } while (opcion < 1 || opcion > 4);
        
        switch(opcion) {
            case 1:
                Suma suma = new Suma();
                break;
            case 2:
                Resta resta = new Resta();
                break;
            case 3:
                Multiplicacion multiplicacion = new Multiplicacion();
                break;
            case 4:
                Division division = new Division();
                break;
        }
    }
}