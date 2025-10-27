import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class x10gColorChooserExample extends JFrame implements ActionListener {
    JButton b;
    JTextArea ta;

    x10gColorChooserExample() {
        super("Color Chooser Example");

        // Initialize components
        b = new JButton("Pad Color");
        b.setBounds(200, 250, 100, 30);

        ta = new JTextArea();
        ta.setBounds(10, 10, 300, 200);

        b.addActionListener(this);

        // Add components to the frame
        add(b);
        add(ta);

        setLayout(null);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Color c = JColorChooser.showDialog(this, "Choose a Color", Color.CYAN);
        if (c != null) {
            ta.setBackground(c);
        }
    }

    public static void main(String[] args) {
        new x10gColorChooserExample();
    }
}
