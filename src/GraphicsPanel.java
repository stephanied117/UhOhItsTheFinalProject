import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class GraphicsPanel extends JPanel implements KeyListener, MouseListener, ActionListener {
    private boolean[] pressedKeys;
    private ArrayList popUps;
    private ArrayList options;
    private MenuBackground background;
    private NamePopUp title;
    private PlayButton start;
    private boolean play;
    private boolean transition;
    private AButton a;
    private BButton b;
    private CButton c;
    private DButton d;
    public GraphicsPanel() {
        popUps = new ArrayList<>();
        options = new ArrayList<>();
        background = new MenuBackground("src/MenuBackgroundImage.jpg");
        title = new NamePopUp("src/NamePopUpImage.png", -60, -75);
        start = new PlayButton("src/PlayButtonImage.png", -30, 300);
        popUps.add(background);
        popUps.add(title);
        popUps.add(start);
        play = false;
        transition = false;
        a = new AButton(-30, 0);
        b = new BButton(-30, 30);
        c = new CButton(-30, 60);
        d = new DButton(-30, 90);
        options.add(a);
        options.add(b);
        options.add(c);
        options.add(d);
        pressedKeys = new boolean[128];
        addKeyListener(this);
        addMouseListener(this);
        setFocusable(true);
        requestFocusInWindow();
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(background.getBackground(), background.getX(), background.getY(), null);
        for (int i = 0; i < popUps.size(); i++) {
            if (play == true && popUps.size() != 0) {
                popUps.remove(i);
                i++;
            }
            if (popUps.get(i) == background) {
                g.drawImage(background.getBackground(), background.getX(), background.getY(), null);
            }
            if (popUps.get(i) == title) {
                g.drawImage(title.getImage(), title.getX(), title.getY(), null);
            }
            if (popUps.get(i) == start) {
                g.drawImage(start.getImage(), start.getX(), start.getY(), null);
            }
        }
        for (int i = 0; i < options.size(); i++) {
            if (options.get(i) == a) {
                g.drawImage(a.getImage(), a.getX(), a.getY(), null);
            }
            if (options.get(i) == b) {
                g.drawImage(b.getImage(), b.getX(), b.getY(), null);
            }
            if (options.get(i) == c) {
                g.drawImage(c.getImage(), c.getX(), c.getY(), null);
            }
            if (options.get(i) == d) {
                g.drawImage(d.getImage(), d.getX(), d.getY(), null);
            }
        }

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
        int x = e.getX();
        int y = e.getY();
        if (play == false && (x > 150 && x < 420 && y > 380 && y < 475)) {
            play = true;
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
