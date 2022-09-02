
package intecap;

import javax.swing.JFrame;

public class Manuel {
    
    public static void main(String[] args) {
        Tuna instancia = new Tuna();
        
        instancia.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        instancia.setLocationRelativeTo(null);
        instancia.setSize(350, 200);
        instancia.setVisible(true);
    }
}