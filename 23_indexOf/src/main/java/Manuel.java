
public class Manuel {
    
    public static void main(String[] args) {
        String cadena = "Estamos en el curso de java y seguiremos aprendiendo sobre java aunque siempre estaré aprendiendo de java";
        
        int indice = cadena.indexOf("java");
        System.out.println(indice);
        
        indice = cadena.indexOf("java", indice + 1);
        System.out.println(indice);
        
        indice = cadena.lastIndexOf("java");
        System.out.println(indice);
    }
}
