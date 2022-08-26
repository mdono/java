
public class Manuel {
    
    public static void main(String[] args) {
        int[] a = new int[4], x={};
        int b[] = new int[4], y;
        
        x[0] = 13;
        y = 21;
        
        a[0] = 31;
        a[1] = 16;
        a[2] = 20;
        a[3] = 24;
        
        obtenerValor(a, 2);
    }
    
    public static void obtenerValor(int v[], int p) {
        System.out.println(v[p]);
    }
}
