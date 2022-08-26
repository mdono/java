
public class Manuel {
    
    public static void main(String[] args) {
        int arreglo[] = { 3,4,5,6 }, total = 0;
        
        /*
        for(int i=0;i<arreglo.length;i++) {
            System.out.println(arreglo[i]);
            total += arreglo[i];
        }
        
        System.out.println(total);
        */
        
        for(int i : arreglo) {
            total += i;
        }
        
        System.out.println("valor de total: " + total);
    }
}
