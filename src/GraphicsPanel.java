import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class GraphicsPanel extends JPanel implements KeyListener, MouseListener, ActionListener {
    private boolean[] pressedKeys;
    private ArrayList popUps;
    private MenuBackground menuBkgd;
    private NamePopUp title;
    private PlayButton start;
    private boolean play;
    private boolean choose;
    private boolean transition;
    private AButton a;
    private BButton b;
    private CButton c;
    private DButton d;
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
        choose = false;
        transition = false;
        a = new AButton(-30, -80);
        b = new BButton(-30, 20);
        c = new CButton(-30, 120);
        d = new DButton(-30, 220);
        pressedKeys = new boolean[128];
        addKeyListener(this);
        addMouseListener(this);
        setFocusable(true);
        requestFocusInWindow();
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < popUps.size(); i++) {
            if (play == true && choose == true) {
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
        int x = e.getX();
        int y = e.getY();
        if (play == false && (choose == false) && (x > 150 && x < 420 && y > 380 && y < 475)) {
            play = true;
            choose = true;
            for (int j = 0; j < 3; j++) {
                popUps.remove(0);
            }
        }
        if (play == true && choose == true && (x > 140 && x < 455 && y > 110 && y < 200)) {
            System.out.println(x + ", " + y);
            choose = false;

        }
        if (play == true && choose == true && (x > 140 && x < 455 && y > 210 && y < 300)) {
            System.out.println(x + ", " + y);
            choose = false;
        }
        if (play == true && choose == true && (x > 140 && x < 455 && y > 310 && y < 400)) {
            System.out.println(x + ", " + y);
        }
        if (play == true && choose == true && (x > 140 && x < 455 && y > 410 && y < 500)) {
            System.out.println(x + ", " + y);

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
