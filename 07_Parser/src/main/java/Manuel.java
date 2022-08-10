
public class Manuel {
    public static void main(String[] args) {
        String cadenaEntero = "123";
        String cadenaEntero1 = "123.45";
        
        int entero = Integer.parseInt(cadenaEntero);
        double entero1 = Double.parseDouble(cadenaEntero1);
        float entero2 = Float.parseFloat(cadenaEntero1); // 2
        //long entero3 = Long.parseLong(cadenaEntero1);
        
        System.out.println("Valor cadena: " + cadenaEntero);
        System.out.println("Operación cadena: " + cadenaEntero + cadenaEntero);
        System.out.println("Valor entero: " + entero);
        System.out.println("Operación entero" + entero + entero);
        
        System.out.println("Valor double: " + entero1);
        System.out.println("Valor float: " + entero2);
        //System.out.println("Valor long: " + entero3);
    }
}
