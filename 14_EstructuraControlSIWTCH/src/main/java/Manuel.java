
public class Manuel {
    public static void main(String[] args) {
        //int caso = 10;
        /*
        switch(caso) {
            case 0:
                System.out.println("valor " + caso);
                break;
            case 1:
                System.out.println("valor " + caso);
                break;
            case 2:
                System.out.println("valor " + caso);
                break;
            default:
                System.out.println("No contamos con el caso " + caso);
        }*/
        
        /*
        char genero = 'm';
        
        switch(genero) {
            case 'f':
                System.out.println("Femenino");
                break;
            case 'm':
                System.out.println("Masculino");
                break;    
            default:
                System.out.println("Por ley no se permite más géneros");
                break;
        }
        */
        
        String pais = "Guatemala";
        
        switch(pais) {
            case "Guatemala" -> System.out.println("Es el país de Guatemala");
            case "El Salvador" -> System.out.println("Es el país de El Salvador");
            case "Honduras" -> System.out.println("Es el país de Honduras");
            case "Nicaragua" -> System.out.println("El el país de Nicaragua");
            case "Costa Rica" -> System.out.println("El el país de Costa Rica");
            default -> System.out.println("No es un país de Centroamérica");
        }
    }
}
