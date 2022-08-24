
public class Manuel {
    public static void main(String[] args) {
        //while(condicion){}//true-false
        int i = 1;
        
        /*while(i <= 10) {
            System.out.println(i);
            i++;
            //System.out.println(i);
        }*/
        
        while(true) {
            if(i > 10){
                break;
            }
            
            System.out.println(i);
            i++;
        }
    }
}
