import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GraphicsPanel extends JPanel implements KeyListener, MouseListener, ActionListener {
    private boolean[] pressedKeys;
    private MenuBackground background;
    private PlayButton start;
    public GraphicsPanel() {
        background = new MenuBackground("src/R.jpg");
        start = new PlayButton("src/button.png", 100, 100);
        pressedKeys = new boolean[128];
        addKeyListener(this);
        addMouseListener(this);
        setFocusable(true);
        requestFocusInWindow();
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(background.getBackground(), background.getX(), background.getY(), null);
        g.drawImage(start.getImage(), start.getX(), start.getY(), null);
        if ()
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
