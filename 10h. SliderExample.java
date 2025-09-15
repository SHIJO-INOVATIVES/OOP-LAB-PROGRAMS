 import javax.swing.*;

public class SliderExample extends JFrame {
    public SliderExample() {
        super("Slider Example");

        // Create the slider
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);
        slider.setMinorTickSpacing(2);
        slider.setMajorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        // Add slider to a panel
        JPanel panel = new JPanel();
        panel.add(slider);

        // Add panel to the frame
        add(panel);

        // Frame settings
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null); // Center the window
        setVisible(true);
    }

    public static void main(String[] args) {
        new SliderExample();
    }
}
