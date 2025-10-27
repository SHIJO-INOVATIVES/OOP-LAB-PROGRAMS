import javax.swing.*;
import java.awt.*;

public class x10dSeparatorExample {
    public static void main(String args[]) {
        JFrame f = new JFrame("Separator Example");
        f.setLayout(new GridLayout(0, 1));

        JLabel l1 = new JLabel("Above Separator");
        f.add(l1);

        // Corrected line: added space between type and variable name
        JSeparator sep = new JSeparator();
        f.add(sep);

        JLabel l2 = new JLabel("Below Separator");
        f.add(l2);

        f.setSize(400, 100);
        f.setLocationRelativeTo(null); // Center the frame
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
