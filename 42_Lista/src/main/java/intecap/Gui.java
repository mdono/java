
package intecap;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Gui extends JFrame {
    
    private JList lista;
    private String nombreColores[] = {"Azul", "Blanco", "Negro", "Rojo"};
    private Color color[] = { Color.BLUE, Color.WHITE, Color.BLACK, Color.RED };
    
    public Gui() {
        super("Lista de colores");
        setLayout(new FlowLayout());
        
        lista = new JList(nombreColores);
        lista.setVisibleRowCount(3);
        lista.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                getContentPane().setBackground(color[lista.getSelectedIndex()]);
                lista.setSelectionForeground(color[lista.getSelectedIndex()]);
            }
        });
        add(new JScrollPane(lista));
    }
}
