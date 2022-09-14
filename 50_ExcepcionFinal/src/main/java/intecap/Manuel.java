
package intecap;

public class Manuel {
    
    public static void main(String[] args) {
        String saludos[] = { "Hola", "Hello", "Hallo" };
        int i = 0;
        
        while (i < 4) {            
            try {
                System.out.println(saludos[i]);
                i++;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Err: " + e.getMessage());
                i = 0;
                break;
            } finally {
                System.out.println("Este bloque siempre se ejecuta");
            }
        }
    }
}
