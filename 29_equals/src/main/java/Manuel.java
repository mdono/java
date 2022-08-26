
public class Manuel {

    public static void main(String[] args) {
        String a = "manzana", b = "mar", c = "Mar";
        
        /*
        if (a == b) {
            System.out.print(a + " es igual con " + b);
        } else {
            System.out.print(a + " no es igual con " + b);
        }
        */
        
        if (a.equals(b)) {
            System.out.println(a + " es igual con " + b);
        } else {
            System.out.println(a + " no es igual con " + b);
        }
        
        if(!a.equals(b)) {
            System.out.println(a + " no es igual con " + b);
        } else {
            System.out.println(a + " es igual con " + b);
        }
        
        if(b.equals(c)) {
            System.out.println(b + " es igual con " + c);
        } else {
            System.out.println(b + " no es igual con " + c);
        }
        
        if(b.equalsIgnoreCase(c)) {
            System.out.println(b + " es igual con " + c);
        } else {
            System.out.println(b + " no es igual con " + c);
        }
    }
}
