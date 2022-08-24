
public class Manuel {
    public static String analisis(int prueba, int objetivo) {
        String resultado = null;
        
        //if(condicion)verdadero-falso
        //if(condición) {} else {}
        /*
        if(prueba == objetivo) {
            resultado = "bloque verdadero";
        } else {
            resultado = "bloque falso";
        }
        */
        
        if(prueba < objetivo) {
            resultado = "bloque verdadero 1";
            System.out.println("hola");
        } else 
            resultado = "bloque falso 1";
        
        if (prueba != objetivo) {
            resultado = "bloque verdadero 2";
        } else 
            resultado = "bloque falso 2";
        
        if (prueba != objetivo) {
            resultado = "bloque verdadero 3";
        } else if (prueba == objetivo) {
            resultado = "bloque falso 3";
            
            if (prueba > objetivo) 
                resultado = "bloque verdadero 4";
            else 
                resultado = "blque falso 4";
        } else
            resultado = "algo más";

        return resultado;
    }
    
    public static void main(String[] args) {
        //analisis(7, 3);
        System.out.println(analisis(3, 3));
    }
}
