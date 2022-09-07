
package intecap;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gui extends JFrame {
    
    private JButton boton;
    private JPanel panel;
    private Color color = Color.BLACK;
    
    public Gui() {
        super("Selección de colores");
        
        panel = new JPanel();
        add(panel, BorderLayout.CENTER);
        
        boton = new JButton("Escoge un color");
        boton.addActionListener((ActionEvent e) -> {
            color = JColorChooser.showDialog(
                    null,
                    "Seleccione el color",
                    color
            );
            panel.setBackground(color);
        });
        add(boton, BorderLayout.SOUTH);
    }
}
