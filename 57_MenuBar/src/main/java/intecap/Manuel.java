
package intecap;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

public class Manuel extends JFrame implements ActionListener, ItemListener {
    
    private JTextArea area;
    private JScrollPane scroll;
    private String nuevaLinea = "\n";
    private JPopupMenu popup;
    
    public Manuel() {
        JMenuBar barra;
        JMenu menu, subMenu;
        JMenuItem menuItem;
        JRadioButtonMenuItem rbMenuItem;
        JCheckBoxMenuItem cbMenuItem;
        
        Container contenedor = getContentPane();
        area = new JTextArea(5, 30);
        area.setEditable(false);
        scroll = new JScrollPane(area);
        contenedor.add(scroll, BorderLayout.CENTER);
        
        barra = new JMenuBar();
        setJMenuBar(barra);
        
        menu = new JMenu("Archivo");
        menu.setMnemonic(KeyEvent.VK_C);
        menu.getAccessibleContext()
                .setAccessibleDescription("El único menú en este programa que tiene menú item");
        barra.add(menu);
        
        menu.addSeparator();
        subMenu = new JMenu("Un Submenu");
        subMenu.setMnemonic(KeyEvent.VK_S);
        
        menuItem = new JMenuItem("Un item en el sumenu");
        menuItem.setAccelerator(KeyStroke.
                getKeyStroke(KeyEvent.VK_2, ActionEvent.ALT_MASK));
        menuItem.addActionListener(this);
        subMenu.add(menuItem);
        
        menuItem = new JMenuItem("Otro Item");
        menuItem.addActionListener(this);
        subMenu.add(menuItem);
        
        menu.add(subMenu);
        
        // crear un grupo del menu item
        menuItem = new JMenuItem("Unico texto del menu item", KeyEvent.VK_T);
        menuItem.setAccelerator(KeyStroke
                .getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext()
                .setAccessibleDescription("Este no hace nada");
        menuItem.addActionListener(this);
        menu.add(menuItem);
        
        menuItem = new JMenuItem("Ambos textos");
        menuItem.setMnemonic(KeyEvent.VK_A);
        menuItem.addActionListener(this);
        menu.add(menuItem);
        
        menuItem = new JMenuItem("Imágenes");
        menuItem.setMnemonic(KeyEvent.VK_I);
        menuItem.addActionListener(this);
        menu.add(menuItem);
        
        menu.addSeparator();
        ButtonGroup grupo = new ButtonGroup();
        rbMenuItem = new JRadioButtonMenuItem("Un Radio");
        rbMenuItem.setSelected(true);
        rbMenuItem.setMnemonic(KeyEvent.VK_R);
        grupo.add(rbMenuItem);
        rbMenuItem.addActionListener(this);
        menu.add(rbMenuItem);
        
        rbMenuItem = new JRadioButtonMenuItem("Otro mas");
        rbMenuItem.setMnemonic(KeyEvent.VK_O);
        grupo.add(rbMenuItem);
        rbMenuItem.addActionListener(this);
        menu.add(rbMenuItem);
        
        menu.addSeparator();
        cbMenuItem = new JCheckBoxMenuItem("Un checkbox menu item");
        cbMenuItem.setMnemonic(KeyEvent.VK_H);
        cbMenuItem.addActionListener(this);
        menu.add(cbMenuItem);
        
        cbMenuItem = new JCheckBoxMenuItem("Otro checkbox menu item");
        cbMenuItem.setMnemonic(KeyEvent.VK_N);
        cbMenuItem.addActionListener(this);
        menu.add(cbMenuItem);
        
        menu = new JMenu("Otro Menu");
        menu.setMnemonic(KeyEvent.VK_E);
        menu.getAccessibleContext()
                .setAccessibleDescription("Este menu no hace nada");
        barra.add(menu);
        
        popup = new JPopupMenu();
        menuItem = new JMenuItem("Un popup menu item");
        menuItem.addActionListener(this);
        popup.add(menuItem);
        
        menuItem = new JMenuItem("Otro popup menu item");
        menuItem.addActionListener(this);
        popup.add(menuItem);
        
        MouseListener popupListener = new PopupListener();
        area.addMouseListener(popupListener);
        scroll.addMouseListener(popupListener);
        barra.addMouseListener(popupListener);
    }
    
    public static void main(String[] args) {
        Manuel instancia = new Manuel();
        instancia.setTitle("Menú con popup");
        instancia.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        instancia.setLocationRelativeTo(null);
        instancia.setSize(450, 260);
        instancia.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JMenuItem fuente = (JMenuItem) e.getSource();
        String texto = "Acción detectada"
                + nuevaLinea
                + "evento fuente: "
                + fuente.getText()
                + " (instancia de "
                + getNombreClase(fuente)
                + ")";
        area.append(texto + nuevaLinea);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        JMenuItem fuente = (JMenuItem) e.getSource();
        String texto = "ItemEvent detectado"
                + nuevaLinea
                + "Evento fuente: "
                + " (Instancia de "
                + getNombreClase(fuente)
                + ")"
                + nuevaLinea
                + ((e.getStateChange() == ItemEvent.SELECTED) 
                ? "Seleccionado"
                : "No seleccionado");
        area.append(texto + nuevaLinea);
    }

    private String getNombreClase(Object obj) {
        String claseString = obj.getClass().getName();
        int indice = claseString.lastIndexOf(".");
        
        return claseString.substring(indice + 1);
    }

    private class PopupListener extends MouseAdapter {

        @Override
        public void mousePressed(MouseEvent e) {
            quizasMuestrePopup(e);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            quizasMuestrePopup(e);
        }

        private void quizasMuestrePopup(MouseEvent e) {
            if (e.isPopupTrigger()) {
                popup.show(e.getComponent(), e.getX(), e.getY());
            }
        }
    }
}
