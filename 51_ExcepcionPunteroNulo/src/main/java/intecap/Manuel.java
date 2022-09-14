
package intecap;

public class Manuel {
    
    private static String cadena = null;
    
    public static void main(String[] args) {
        System.out.println("Valor de la cadena: " + cadena);
        
        //cadena = miFuncion();
        //cadena = "Manuel";
        cadena = new String("Manuel");
        System.out.print(cadena.charAt(1));
    }

    private static String miFuncion() {
        //return "Manuel";
        return null;
    }
}
