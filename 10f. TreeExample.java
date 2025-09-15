 import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class TreeExample {
    JFrame f;

    TreeExample() {
        f = new JFrame("Tree Example");

        // Create root node
        DefaultMutableTreeNode style = new DefaultMutableTreeNode("Style");

        // Create branches
        DefaultMutableTreeNode color = new DefaultMutableTreeNode("Color");
        DefaultMutableTreeNode font = new DefaultMutableTreeNode("Font");

        // Add branches to root
        style.add(color);
        style.add(font);

        // Create leaf nodes under "color"
        color.add(new DefaultMutableTreeNode("Red"));
        color.add(new DefaultMutableTreeNode("Blue"));
        color.add(new DefaultMutableTreeNode("Black"));
        color.add(new DefaultMutableTreeNode("Green"));

        // Create the tree
        JTree jt = new JTree(style);

        // Add tree to a scroll pane for better usability
        JScrollPane sp = new JScrollPane(jt);

        // Add scroll pane to frame
        f.add(sp);

        f.setSize(200, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new TreeExample();
    }
}
