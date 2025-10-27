import javax.swing.*;
import java.awt.event.*;

public class x10aMenuExample implements ActionListener {
    JFrame f;
    JMenuBar mb;
    JMenu file, edit, help;
    JMenuItem cut, copy, paste, selectAll;
    JTextArea ta;

    x10aMenuExample() {
        f = new JFrame("Menu Example");

        // Create menu items
        cut = new JMenuItem("Cut");
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");
        selectAll = new JMenuItem("Select All");

        // Add action listeners
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);

        // Create menu bar and menus
        mb = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");

        // Add menu items to 'Edit' menu
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);

        // Add menus to menu bar
        mb.add(file);
        mb.add(edit);
        mb.add(help);

        // Create text area
        ta = new JTextArea();
        ta.setBounds(5, 5, 360, 320);

        // Setup frame
        f.setJMenuBar(mb);
        f.add(ta);
        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Handle menu item actions
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cut)
            ta.cut();
        else if (e.getSource() == copy)
            ta.copy();
        else if (e.getSource() == paste)
            ta.paste();
        else if (e.getSource() == selectAll)
            ta.selectAll();
    }

    public static void main(String[] args) {
        new x10aMenuExample();
    }
}
