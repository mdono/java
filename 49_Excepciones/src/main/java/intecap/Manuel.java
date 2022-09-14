
package intecap;

public class Manuel {
    
    public static void main(String[] args) {
        String cadena1 = "23";
        String cadena2 = "0";
        String respuesta;
        int numerador, denominador, cociente;
        
        try {
            numerador = Integer.parseInt(cadena1);
            denominador = Integer.parseInt(cadena2);
        
            rango(numerador, denominador);
            
            cociente = numerador / denominador;
            respuesta = String.valueOf(cociente);
        } catch (IntervaloExcepcion ex) {
            respuesta = ex.getMessage();
        } catch (ArithmeticException ex) {
            //respuesta = ex.getMessage();
            respuesta = "División bajo cero no permitida";
        } catch (NumberFormatException ex) {
            //respuesta = ex.getMessage();
            respuesta = "Se han introducido caracteres no numéricos";
        }
        
        System.out.println("RESULTADO: " + respuesta);
    }

    private static void rango(int num, int den) throws IntervaloExcepcion {
        if (num > 100 || den < -5) {
            throw new IntervaloExcepcion("Números fuera de rango");
        }
    }
}

// excepciones
// contamos con 2 bloques
// el bloque 1 ejecuta una acción
// el bloque 2 captura un excepción calculada












