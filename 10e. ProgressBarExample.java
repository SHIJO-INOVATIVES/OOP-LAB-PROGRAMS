 import javax.swing.*;

public class ProgressBarExample extends JFrame {
    JProgressBar jb;
    int i = 0, num = 0;

    ProgressBarExample() {
        jb = new JProgressBar(0, 2000);
        jb.setBounds(40, 40, 160, 30);
        jb.setValue(0);
        jb.setStringPainted(true);
        add(jb);

        setSize(250, 150);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void iterate() {
        // Run in a separate thread to keep GUI responsive
        new Thread(() -> {
            while (i <= 2000) {
                jb.setValue(i);
                i = i + 20;
                try {
                    Thread.sleep(150);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public static void main(String[] args) {
        ProgressBarExample m = new ProgressBarExample();
        m.setVisible(true);
        m.iterate();
    }
}
