 import javax.swing.*;
import java.awt.event.*;

class PopupMenuExample {
    PopupMenuExample() {
        final JFrame f = new JFrame("PopupMenu Example");

        // Create popup menu
        final JPopupMenu popupmenu = new JPopupMenu();

        // Create menu items
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");

        // Add menu items to popup menu
        popupmenu.add(cut);
        popupmenu.add(copy);
        popupmenu.add(paste);

        // Add mouse listener to show popup menu
        f.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                // Show popup menu at mouse location
                popupmenu.show(f, e.getX(), e.getY());
            }
        });

        // Frame settings
        f.setSize(300, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new PopupMenuExample();
    }
}
