
package intecap;

import javax.swing.JFrame;

public class Manuel {

    public static void main(String[] args) {
        Gui instancia = new Gui();

        instancia.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        instancia.setLocationRelativeTo(null);
        instancia.setSize(300, 200);
        instancia.setVisible(true);
    }
}
