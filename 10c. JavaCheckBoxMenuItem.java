 import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.AbstractButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JavaCheckBoxMenuItem {
    public static void main(final String args[]) {
        JFrame frame = new JFrame("JMenu Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create menu bar
        JMenuBar menuBar = new JMenuBar();

        // File menu with mnemonic 'F'
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        menuBar.add(fileMenu);

        // File -> Open menu item with mnemonic 'O'
        JMenuItem menuItem1 = new JMenuItem("Open", KeyEvent.VK_O);
        fileMenu.add(menuItem1);

        // File -> Option_1 as checkbox menu item with mnemonic 'C'
        JCheckBoxMenuItem caseMenuItem = new JCheckBoxMenuItem("Option_1");
        caseMenuItem.setMnemonic(KeyEvent.VK_C);
        fileMenu.add(caseMenuItem);

        // Action listener for the checkbox menu item
        ActionListener aListener = new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                AbstractButton aButton = (AbstractButton) event.getSource();
                boolean selected = aButton.getModel().isSelected();
                String newLabel;
                if (selected) {
                    newLabel = "Value-1";
                } else {
                    newLabel = "Value-2";
                }
                aButton.setText(newLabel);
            }
        };
        caseMenuItem.addActionListener(aListener);

        // Set the menu bar and display frame
        frame.setJMenuBar(menuBar);
        frame.setSize(350, 250);
        frame.setLocationRelativeTo(null); // Center the window
        frame.setVisible(true);
    }
}
