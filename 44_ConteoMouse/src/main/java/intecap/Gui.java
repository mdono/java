
package intecap;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Gui extends JFrame {
    
    private final JLabel ETIQUETA;
    private String detalles;
    
    public Gui() {
        super("Conteo del mouse");
        
        ETIQUETA = new JLabel("DEFAULT");
        add(ETIQUETA, BorderLayout.SOUTH);
        
        addMouseListener(new ElManejador());
    }
    
    private class ElManejador extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {
            detalles = String.format(
                    "Hiciste click %d ", 
                    e.getClickCount()
            );
            
            /*
            if(e.isMetaDown()) {
                detalles += "con el derecho";
            } else if(e.isAltDown()) {
                detalles += "con el centro";
            } else {
                detalles += "con el izquierdo";
            }*/
            
            if (e.getButton()==MouseEvent.BUTTON1) {
                detalles += "con el izquierdo";
            }
            
            if (e.getButton()==MouseEvent.BUTTON2) {
                detalles += "con el centro";
            }
            
            if (e.getButton()==MouseEvent.BUTTON3) {
                detalles += "con el derecho";
            }
            
            ETIQUETA.setText(detalles);
        }
    }
}
