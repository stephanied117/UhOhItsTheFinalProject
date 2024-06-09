import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class GraphicsPanel extends JPanel implements KeyListener, MouseListener, ActionListener {
    private Player bobette;
    private ArrayList popUps;
    private Transition flash;
    private MenuBackground menuBkgd;
    private NamePopUp name;
    private PlayButton play;
    private ScenarioBoard board;
    private Animation display;
    private AButton a;
    private BButton b;
    private CButton c;
    private DButton d;
    private boolean start;
    private boolean animation;
    private boolean optionA;
    private boolean optionB;
    private boolean optionC;
    private boolean optionD;
    private boolean transition;
    private int transFrameTick;
    private int tally;
    public GraphicsPanel() {
        bobette = new Player(); // manages points and rating of user
        popUps = new ArrayList<>(); // list of visual assets
        flash = new Transition(0, 0); // white flash
        display = new Animation(); // contains all mini animations

        /* starting menu */
        menuBkgd = new MenuBackground("src/MenuBackgroundImage.png"); // background
        name = new NamePopUp("src/NamePopUpImage.png", -60, -75); // ui with game name
        play = new PlayButton("src/PlayButtonImage.png", -30, 300); // play button ui

        /* game play */
        board = new ScenarioBoard("src/ScenarioBoardImage.png"); // ui box containing scenarios & options
        a = new AButton(240, 125); // option a
        b = new BButton(240, 190); // option b
        c = new CButton(240, 255); // option c
        d = new DButton(240, 320); // option d

        /* adds objects with still images */
        popUps.add(menuBkgd);
        popUps.add(name);
        popUps.add(play);
        popUps.add(board);
        popUps.add(a);
        popUps.add(b);
        popUps.add(c);
        popUps.add(d);

        /* signals */
        start = false; // begins gameplay
        transition = false; // transition signal
        animation = false; // animation allow signal
        optionA = false; // a animation signal
        optionB = false; // b animation signal
        optionC = false; // c animation signal
        optionD = false; // d animation signal
        transFrameTick = -1;
        tally = 1; // question number tracker

        /* necessary graphics code */
        addKeyListener(this);
        addMouseListener(this);
        setFocusable(true);
        requestFocusInWindow();
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < popUps.size(); i++) {
            /* start menu */
            if (!start) {
                if (popUps.get(i) == menuBkgd) {
                    g.drawImage(menuBkgd.getBackground(), menuBkgd.getX(), menuBkgd.getY(), null); // menu background
                }
                if (popUps.get(i) == name) {
                    g.drawImage(name.getImage(), name.getX(), name.getY(), null); // game name ui
                }
                if (popUps.get(i) == play) {
                    g.drawImage(play.getImage(), play.getX(), play.getY(), null); // play button
                }
                if (transition) {

                }
            } else if (start) {
                /* game play */
                if (!animation && tally < 5) {
                    if (popUps.get(i) == board) {
                        g.drawImage(board.getBoard(), board.getX(), board.getY(), null); // board
                    }
                    if (popUps.get(i) == board) {
                        g.drawImage(a.getImage(), a.getX(), a.getY(), null); // a
                    }
                    if (popUps.get(i) == board) {
                        g.drawImage(b.getImage(), b.getX(), b.getY(), null); // b
                    }
                    if (popUps.get(i) == board) {
                        g.drawImage(c.getImage(), c.getX(), c.getY(), null); // c
                    }
                    if (popUps.get(i) == board) {
                        g.drawImage(d.getImage(), d.getX(), d.getY(), null); // d
                    }
                } else if (animation && tally == 1) { // scenario 1
                    if (optionA) {
                        bobette.subtract();
                    } else if (optionB) {

                    } else if (optionC) {
                        bobette.subtract();
                    } else if (optionD) {
                        bobette.subtractMore();
                    }
                } else if (animation && tally == 2) { // scenario 2
                    if (optionA) {

                    } else if (optionB) {
                        bobette.subtract();
                    } else if (optionC) {
                        bobette.subtractMore();
                    } else if (optionD) {
                        bobette.subtract();
                    }
                } else if (animation && tally == 3) { // scenario 3
                    if (optionA) {
                        bobette.subtract();
                    } else if (optionB) {
                        bobette.subtractMore();
                    } else if (optionC) {

                    } else if (optionD) {
                        bobette.subtract();
                    }
                } else if (animation && tally == 4) { // scenario 4
                    if (optionA) {
                        bobette.subtractMore();
                    } else if (optionB) {
                        bobette.subtract();
                    } else if (optionC) {
                        bobette.subtract();
                    } else if (optionD) {

                    }
                } else if (tally >= 5) { // end results
                    if (bobette.getPoints() == 0) {

                    } else if (bobette.getPoints() < 0 && bobette.getPoints() > -6) {

                    } else if (bobette.getPoints() < -5 && bobette.getPoints() > -11) {

                    }
                }
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
        if (play.buttonRectangle().contains(clicked)) {
            transition = true;
        } else {
            if (a.buttonRectangle().contains(clicked) && (a.getImageString().equals("src/AButtonImage.png") || a.getImageString().equals("src/AButtonImage.png") || a.getImageString().equals("src/AButtonImage.png") || a.getImageString().equals("src/AButtonImage.png"))) {
                animation = true;
                optionA = true;
            } else if (b.buttonRectangle().contains(clicked) && (b.getImageString().equals("src/BButtonImage.png") || b.getImageString().equals("src/BButtonImage.png") || b.getImageString().equals("src/BButtonImage.png") || b.getImageString().equals("src/BButtonImage.png"))) {
                animation = true;
                optionB = true;
            } else if (c.buttonRectangle().contains(clicked) && (c.getImageString().equals("src/CButtonImage.png") || c.getImageString().equals("src/CButtonImage.png") || c.getImageString().equals("src/CButtonImage.png") || c.getImageString().equals("src/CButtonImage.png"))) {
                animation = true;
                optionC = true;
            } else if (d.buttonRectangle().contains(clicked) && (d.getImageString().equals("src/DButtonImage.png") || d.getImageString().equals("src/DButtonImage.png") || d.getImageString().equals("src/DButtonImage.png") || d.getImageString().equals("src/DButtonImage.png"))) {
                animation = true;
                optionD = true;
            }
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
    public void transitionTime(Graphics g) {
        for (int i = 0; i < flash.getFrames().size(); i++) {
            g.drawImage(flash.getFrames().get(i), flash.getX(), flash.getY(), null);
            try {
                Thread.sleep(100);
            } catch (InterruptedException l) {
                Thread.currentThread().interrupt();
            }
            flash.getFrames().remove(flash.getFrames().get(i));
        }
    }
}