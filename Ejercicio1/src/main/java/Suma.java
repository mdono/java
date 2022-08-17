
import javax.swing.JOptionPane;

public class Suma {
    public Suma() {
        System.out.println("ingresando en las operaciones de suma");
        String cadena;
        int valor1, valor2 = 0;
        
        cadena = JOptionPane.showInputDialog("Para realizar la suma debes de ingresar 2 valores\nIngresa tu primer valor entero");
        valor1 = Integer.parseInt(cadena);
        System.out.println(valor1);
        
        cadena = JOptionPane.showInputDialog("Ingresa tu segundo valor entero");
        valor2 = Integer.parseInt(cadena);
        System.out.println(valor2);
        
        operacion(valor1, valor2);
    }
    
    public void operacion(int val1, int val2) {
        int resultado = 0;
        
        resultado = val1 + val2;
        System.out.println(resultado);
        
        JOptionPane.showMessageDialog(null, resultado);
    }
}
