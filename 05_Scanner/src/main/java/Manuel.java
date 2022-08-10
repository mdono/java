
import java.util.Scanner;

public class Manuel {
    public static void main(String[] args) {
        int a, b;
        
        Scanner x = new Scanner(System.in);
        
        System.out.println("Ingrese un primer valor entero");
        a = x.nextInt();
        
        System.out.println("Ingrese un segundo valor entero");
        b = x.nextInt();
        
        int c = a + b;
        
        System.out.println("Resultado: " + c);
    }
}