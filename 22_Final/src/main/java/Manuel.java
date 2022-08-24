public class Manuel {
    
    public static void main(String[] args) {
        // variables y constantes
        Tuna instancia = new Tuna(21);
        
        for(int i=0;i<5;i++) {
            instancia.agregar();
            System.out.printf("%s", instancia);
        }
    }
}
