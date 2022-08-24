public class Manuel {
    public static void main(String[] args) {
        Tuna instancia = new Tuna();
        
        System.out.println(instancia.toMilitar());
        instancia.setTiempo(29, 19, 19);
        System.out.println(instancia.toMilitar());
    }
}
