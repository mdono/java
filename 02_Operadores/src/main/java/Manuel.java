import java.util.Random;

public class Manuel {
    // variable
    // 1. tipo de la variable 2. nombre de la variable 3. valor de la variable
    // Tipos de datos: primitivos y de clase
    
    public static void main(String[] args) {
        //int base = 5;// el tipo int corresponde a los valores enteros
        //int exponente = 3;
        double potencia;
        int base = 5, exponente = 3;

        potencia = Math.pow(base, exponente);
        double raiz = Math.sqrt(base);
        double menor = Math.floor(5.6);
        double mayor = Math.ceil(5.6);
        double aprox = Math.round(4.6);
        //double aleatorio = Math.random();
        Random random = new Random();
        int valor = random.nextInt(1, 100);
       
        //System.out.println(potencia);
        //System.out.println(raiz);
        //System.out.println(menor);
        //System.out.println(mayor);
        //System.out.println(aprox);
        System.out.println(valor);
    }
}
