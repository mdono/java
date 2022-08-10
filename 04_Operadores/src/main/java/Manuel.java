
public class Manuel {
    public static void main(String[] args) {
        // operadores lógicos
        // && 
        // ||
        String a = "Guatemala", b = "Progreso";
        String x = "Quetzaltenango", y = "Zacapa";
        
        //System.out.println("a == b " + (a == b));
        //System.out.println("a == b " + (a.equals(b)));
        // if(a.equals(x) && b.equals(y))
        System.out.println("a.equals(x) && b.equals(y): " + (a.equals(x) && b.equals(y)));
        System.out.println("a.equals(x) && b.equals(y): " + (a.equals(x) || b.equals(y)));
        System.out.println("!a.equals(x) && b.equals(y): " + (!a.equals(x) && b.equals(y)));
        System.out.println("!a.equals(x) && !b.equals(y): " + (!a.equals(x) && !b.equals(y)));
        System.out.println("!a.equals(x) && !b.equals(y): " + (!a.equals(x) || !b.equals(y)));
    }
}
