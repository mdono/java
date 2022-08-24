
public class Manuel {
    public static void main(String[] args) {
        for(int i=0;i<10;i++) {
            if(i == 4) {
                //break;
                continue;
            }
            
            if (i == 8)
                break;
            
            System.out.println("El valor de i es: " + i);
        }
    }
}
