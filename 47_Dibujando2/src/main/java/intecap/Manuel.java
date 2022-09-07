
package intecap;

import javax.swing.JFrame;

public class Manuel extends JFrame {
    
    public Manuel() {
        add(new Gui());
        setTitle("Dona");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(360, 360);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Manuel();
    }
}
