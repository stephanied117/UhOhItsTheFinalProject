import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class GraphicsPanel extends JPanel implements KeyListener, MouseListener, ActionListener {
    private Player bobette;
    private ArrayList popUps;
    private MenuBackground menuBkgd;
    private NamePopUp title;
    private PlayButton start;
    private Animation display;
    private AButton a;
    private BButton b;
    private CButton c;
    private DButton d;
    private boolean play;
    private boolean anole;
    private boolean oneA;
    private boolean oneB;
    private boolean oneC;
    private boolean oneD;
    private boolean twoA;
    private boolean twoB;
    private boolean twoC;
    private boolean twoD;
    private boolean threeA;
    private boolean threeB;
    private boolean threeC;
    private boolean threeD;
    private boolean fourA;
    private boolean fourB;
    private boolean fourC;
    private boolean fourD;
    private boolean transition;
    private int tally;
    public GraphicsPanel() {
        bobette = new Player();
        popUps = new ArrayList<>();
        menuBkgd = new MenuBackground("src/MenuBackgroundImage.png");
        title = new NamePopUp("src/NamePopUpImage.png", -60, -75);
        start = new PlayButton("src/PlayButtonImage.png", -30, 300);
        display = new Animation();
        popUps.add(menuBkgd);
        popUps.add(title);
        popUps.add(start);
        popUps.add(a);
        popUps.add(b);
        popUps.add(c);
        popUps.add(d);
        play = false;
        anole = false;
        transition = false;
        a = new AButton(-30, -70);
        b = new BButton(-30, 30);
        c = new CButton(-30, 130);
        d = new DButton(-30, 230);
        tally = 1;
        addKeyListener(this);
        addMouseListener(this);
        setFocusable(true);
        requestFocusInWindow();
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < popUps.size(); i++) {
            if (play == true && tally < 4) {
                g.drawImage(a.getImage(), a.getX(), a.getY(), null);
                g.drawImage(b.getImage(), b.getX(), b.getY(), null);
                g.drawImage(c.getImage(), c.getX(), c.getY(), null);
                g.drawImage(d.getImage(), d.getX(), d.getY(), null);
            }
            if (anole == true && play == false) {
                if (oneA) {
                    g.drawImage(display.ani(display.getOneA()), 0, 0, null);
                } else if (oneB) {
                    g.drawImage(display.ani(display.getOneB()), 0, 0, null);
                } else if (oneC) {
                    g.drawImage(display.ani(display.getOneC()), 0, 0, null);
                } else if (oneD) {
                    g.drawImage(display.ani(display.getOneD()), 0, 0, null);
                } else if (twoA) {
                    g.drawImage(display.ani(display.getTwoA()), 0, 0, null);
                } else if (twoB) {
                    g.drawImage(display.ani(display.getTwoB()), 0, 0, null);
                } else if (twoC) {
                    g.drawImage(display.ani(display.getTwoC()), 0, 0, null);
                } else if (twoD) {
                    g.drawImage(display.ani(display.getTwoD()), 0, 0, null);
                } else if (threeA) {
                    g.drawImage(display.ani(display.getThreeA()), 0, 0, null);
                } else if (threeB) {
                    g.drawImage(display.ani(display.getThreeB()), 0, 0, null);
                } else if (threeC) {
                    g.drawImage(display.ani(display.getThreeC()), 0, 0, null);
                } else if (threeD) {
                    g.drawImage(display.ani(display.getThreeD()), 0, 0, null);
                } else if (fourA) {
                    g.drawImage(display.ani(display.getFourA()), 0, 0, null);
                } else if (fourB) {
                    g.drawImage(display.ani(display.getFourB()), 0, 0, null);
                } else if (fourC) {
                    g.drawImage(display.ani(display.getFourC()), 0, 0, null);
                } else if (fourD) {
                    g.drawImage(display.ani(display.getFourD()), 0, 0, null);
                }
                anole = false;
                play = true;
            }
            if (tally == 4) {
                if (bobette.getPoints() == 0) {

                } else if (bobette.getPoints() < 0 && bobette.getPoints() > -6) {

                } else if (bobette.getPoints() < -5 && bobette.getPoints() > -11) {

                }
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
                Thread.sleep(100);
            } catch (InterruptedException l) {
                Thread.currentThread().interrupt();
            }
            play = true;
            for (int j = 0; j < 3; j++) {
                popUps.remove(0);
            }
        } else {
            if (a.buttonRectangle().contains(clicked)) {
                play = false;
                anole = true;
                if (a.getImageString().equals("src/AButtonImage.png")) {
                    bobette.subtract();
                    oneA = true;
                } else if (a.getImageString().equals("src/AButtonImage.png")) {
                    twoA = true;
                } else if (a.getImageString().equals("src/AButtonImage.png")) {
                    bobette.subtract();
                    threeA = true;
                } else if (a.getImageString().equals("src/AButtonImage.png")) {
                    bobette.subtractMore();
                    fourA = true;
                }
            } else if (b.buttonRectangle().contains(clicked)) {
                play = false;
                anole = true;
                if (b.getImageString().equals("src/AButtonImage.png")) {
                    oneB = true;
                } else if (b.getImageString().equals("src/AButtonImage.png")) {
                    bobette.subtract();
                    twoB = true;
                } else if (b.getImageString().equals("src/AButtonImage.png")) {
                    bobette.subtractMore();
                    threeB = true;
                } else if (b.getImageString().equals("src/AButtonImage.png")) {
                    bobette.subtract();
                    fourB = true;
                }
            } else if (c.buttonRectangle().contains(clicked)) {
                play = false;
                anole = true;
                if (c.getImageString().equals("src/AButtonImage.png")) {
                    bobette.subtract();
                    oneC = true;
                } else if (c.getImageString().equals("src/AButtonImage.png")) {
                    bobette.subtractMore();
                    twoC = true;
                } else if (c.getImageString().equals("src/AButtonImage.png")) {
                    threeC = true;
                } else if (c.getImageString().equals("src/AButtonImage.png")) {
                    bobette.subtract();
                    fourC = true;
                }
            } else if (d.buttonRectangle().contains(clicked)) {
                play = false;
                anole = true;
                if (d.getImageString().equals("src/AButtonImage.png")) {
                    bobette.subtractMore();
                    oneD = true;
                } else if (d.getImageString().equals("src/AButtonImage.png")) {
                    bobette.subtract();
                    twoD = true;
                } else if (d.getImageString().equals("src/AButtonImage.png")) {
                    bobette.subtract();
                    threeD = true;
                } else if (d.getImageString().equals("src/AButtonImage.png")) {
                    fourD = true;
                }
            }
            tally++;
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
