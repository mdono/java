
package intecap;

import java.awt.Graphics;
import javax.swing.JApplet;

public class Manuel extends JApplet {

    private String nombre;
    private int id;
    private Integer i;
    
    @Override
    public void init() {
        System.out.println("Applet inicializado");
        nombre = getParameter("nombre");
        
        try {
            id = Integer.parseInt(getParameter("id"));
        } catch(NumberFormatException e) {}
    }

    @Override
    public void start() {
        System.out.println("Applet arrancado");
        id++;
        i = new Integer(id);
    }
    
    @Override
    public void stop() {
        System.out.println("Applet detenido");
    }

    @Override
    public void destroy() {
        System.out.println("Applet destruido");
    }

    @Override
    public void paint(Graphics g) {
        System.out.println("Llamado al Paint");
        g.drawString(i.toString(), 20, 30);
        g.drawString("Hola mundo applet", 20, 40);
    }
}
