import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class GraphicsPanel extends JPanel implements KeyListener, MouseListener, ActionListener {
    private ArrayList popUps;
    private MenuBackground menuBkgd;
    private NamePopUp title;
    private PlayButton start;
    private boolean play;
    private boolean transition;
    private AButton a;
    private BButton b;
    private CButton c;
    private DButton d;
    private int tally;
    public GraphicsPanel() {
        popUps = new ArrayList<>();
        menuBkgd = new MenuBackground("src/MenuBackgroundImage.png");
        title = new NamePopUp("src/NamePopUpImage.png", -60, -75);
        start = new PlayButton("src/PlayButtonImage.png", -30, 300);
        popUps.add(menuBkgd);
        popUps.add(title);
        popUps.add(start);
        popUps.add(a);
        popUps.add(b);
        popUps.add(c);
        popUps.add(d);
        play = false;
        transition = false;
        a = new AButton(-30, -80);
        b = new BButton(-30, 20);
        c = new CButton(-30, 120);
        d = new DButton(-30, 220);
        tally = 1;
        addKeyListener(this);
        addMouseListener(this);
        setFocusable(true);
        requestFocusInWindow();
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < popUps.size(); i++) {
            if (play == true) {
                g.drawImage(a.getImage(), a.getX(), a.getY(), null);
                g.drawImage(b.getImage(), b.getX(), b.getY(), null);
                g.drawImage(c.getImage(), c.getX(), c.getY(), null);
                g.drawImage(d.getImage(), d.getX(), d.getY(), null);
            }
            if (popUps.get(i) == menuBkgd) {
                g.drawImage(menuBkgd.getBackground(), menuBkgd.getX(), menuBkgd.getY(), null);
            }
            if (popUps.get(i) == title) {
                g.drawImage(title.getImage(), title.getX(), title.getY(), null);
            }
            if (popUps.get(i) == start) {
                g.drawImage(start.getImage(), start.getX(), start.getY(), null);
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
        Point clicked = e.getPoint();
        if (start.buttonRectangle().contains(clicked)) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException l) {
                Thread.currentThread().interrupt();
            }
            play = true;
            for (int j = 0; j < 3; j++) {
                popUps.remove(0);
            }
        } else if (tally < 4 && (a.buttonRectangle().contains(clicked) || b.buttonRectangle().contains(clicked) || c.buttonRectangle().contains(clicked) || d.buttonRectangle().contains(clicked))) {
            tally++;
            play = false;
        }
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
