import javax.swing.*;

public class x10eProgressBarExample extends JFrame {
    JProgressBar jb;
    int i = 0, num = 0;

    x10eProgressBarExample() {
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
        x10eProgressBarExample m = new x10eProgressBarExample();
        m.setVisible(true);
        m.iterate();
    }
}
