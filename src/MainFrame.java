import javax.swing.*;
import java.awt.*;

public class MainFrame implements Runnable {
    private GraphicsPanel panel;
    public MainFrame() {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(800, 700);
        window.setLocationRelativeTo(null);
        panel = new GraphicsPanel();
        window.add(panel);
        window.setVisible(true);
        Thread thread = new Thread(this);
        thread.start();
    }
    public void run() {
        while (true) {
            panel.repaint();
        }
    }
}
