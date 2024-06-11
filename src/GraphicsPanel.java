import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class GraphicsPanel extends JPanel implements KeyListener, MouseListener, ActionListener {
    private Player bobette;
    private ArrayList popUps;
    private Timer transClock;
    private int time;
    private Transition flash;
    private MenuBackground menuBkgd;
    private NamePopUp name;
    private PlayButton play;
    private GameBackground gameBkgd;
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
    private int tally;
    public GraphicsPanel() {
        bobette = new Player(); // manages points and rating of user
        popUps = new ArrayList<>(); // list of visual assets
        flash = new Transition(0, 0); // white flash
        display = new Animation(); // contains all mini animations

        /* starting menu */
        menuBkgd = new MenuBackground("src/MenuBackgroundImage.png"); // background
        name = new NamePopUp("src/NamePopUpImage.png", 70, -50); // ui with game name
        play = new PlayButton("src/PlayButtonImage.png", 160, 500); // play button ui

        /* game play */
        gameBkgd = new GameBackground();
        board = new ScenarioBoard(); // ui box containing scenarios & options
        a = new AButton(240, 145); // option a
        b = new BButton(240, 210); // option b
        c = new CButton(240, 275); // option c
        d = new DButton(240, 340); // option d

        /* adds objects with still images */
        popUps.add(menuBkgd);
        popUps.add(name);
        popUps.add(play);
        popUps.add(gameBkgd);
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
        tally = 1; // question number tracker

        /* necessary graphics code */
        time = 0;
        transClock = new Timer(10, this); // this Timer will call the actionPerformed interface method every 1000ms = 1 second
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
                    transClock.start();
                    for (int j = 0; j < 4; j++) {
                        if (time >= j) {
                            flash.setFrame(j);
                            g.drawImage(flash.getCurrentFrame(), flash.getX(), flash.getY(), null);
                        }
                    }
                    if (time >= 4) {
                        start = true;
                        transition = false;
                    }
                }
            } else if (start) {
                /* game play */
                if (!animation && tally < 5) {
                    if (popUps.get(i) == gameBkgd && tally == 1) {
                        gameBkgd.setBackground(0);
                        g.drawImage(gameBkgd.getBackground(), gameBkgd.getX(), gameBkgd.getY(), null); // background
                    } else if (popUps.get(i) == gameBkgd && tally == 2) {
                        gameBkgd.setBackground(1);
                        g.drawImage(gameBkgd.getBackground(), gameBkgd.getX(), gameBkgd.getY(), null); // background
                    } else if (popUps.get(i) == gameBkgd && tally == 3) {
                        gameBkgd.setBackground(2);
                        g.drawImage(gameBkgd.getBackground(), gameBkgd.getX(), gameBkgd.getY(), null); // background
                    } else if (popUps.get(i) == gameBkgd && tally == 4) {
                        gameBkgd.setBackground(3);
                        g.drawImage(gameBkgd.getBackground(), gameBkgd.getX(), gameBkgd.getY(), null); // background
                    }

                    if (popUps.get(i) == board && tally == 1) {
                        board.setBoard(0);
                        g.drawImage(board.getBoard(), board.getX(), board.getY(), null); // background
                    } else if (popUps.get(i) == board && tally == 2) {
                        board.setBoard(1);
                        g.drawImage(board.getBoard(), board.getX(), board.getY(), null); // background
                    } else if (popUps.get(i) == board && tally == 3) {
                        board.setBoard(2);
                        g.drawImage(board.getBoard(), board.getX(), board.getY(), null); // background
                    } else if (popUps.get(i) == board && tally == 4) {
                        board.setBoard(3);
                        g.drawImage(board.getBoard(), board.getX(), board.getY(), null); // background
                    }

                    if (popUps.get(i) == a && tally == 1) {
                        a.setImage(0);
                        g.drawImage(a.getImage(), a.getX(), a.getY(), null); // a
                    } else if (popUps.get(i) == a && tally == 2) {
                        a.setImage(1);
                        g.drawImage(a.getImage(), a.getX(), a.getY(), null); // a
                    } else if (popUps.get(i) == a && tally == 3) {
                        a.setImage(2);
                        g.drawImage(a.getImage(), a.getX(), a.getY(), null); // a
                    } else if (popUps.get(i) == a && tally == 4) {
                        a.setImage(3);
                        g.drawImage(a.getImage(), a.getX(), a.getY(), null); // a
                    }

                    if (popUps.get(i) == b && tally == 1) {
                        b.setImage(0);
                        g.drawImage(b.getImage(), b.getX(), b.getY(), null); // b
                    } else if (popUps.get(i) == b && tally == 2) {
                        b.setImage(1);
                        g.drawImage(b.getImage(), b.getX(), b.getY(), null); // b
                    } else if (popUps.get(i) == b && tally == 3) {
                        b.setImage(2);
                        g.drawImage(b.getImage(), b.getX(), b.getY(), null); // b
                    } else if (popUps.get(i) == b && tally == 4) {
                        b.setImage(3);
                        g.drawImage(b.getImage(), b.getX(), b.getY(), null); // b
                    }

                    if (popUps.get(i) == c && tally == 1) {
                        c.setImage(0);
                        g.drawImage(c.getImage(), c.getX(), c.getY(), null); // c
                    } else if (popUps.get(i) == c && tally == 2) {
                        c.setImage(1);
                        g.drawImage(c.getImage(), c.getX(), c.getY(), null); // c
                    } else if (popUps.get(i) == c && tally == 3) {
                        c.setImage(2);
                        g.drawImage(c.getImage(), c.getX(), c.getY(), null); // c
                    } else if (popUps.get(i) == c && tally == 4) {
                        c.setImage(3);
                        g.drawImage(c.getImage(), c.getX(), c.getY(), null); // c
                    }

                    if (popUps.get(i) == d && tally == 1) {
                        c.setImage(0);
                        g.drawImage(d.getImage(), d.getX(), d.getY(), null); // d
                    } else if (popUps.get(i) == d && tally == 2) {
                        c.setImage(1);
                        g.drawImage(d.getImage(), d.getX(), d.getY(), null); // d
                    } else if (popUps.get(i) == d && tally == 3) {
                        c.setImage(2);
                        g.drawImage(d.getImage(), d.getX(), d.getY(), null); // d
                    } else if (popUps.get(i) == d && tally == 4) {
                        c.setImage(3);
                        g.drawImage(d.getImage(), d.getX(), d.getY(), null); // d
                    }
                } else if (animation) {
                    if (tally == 1) { // scenario 1
                        if (optionA) {
                            bobette.subtract();
                            optionA = false;
                        } else if (optionB) {

                            optionB = false;
                        } else if (optionC) {
                            bobette.subtract();
                            optionC = false;
                        } else if (optionD) {
                            bobette.subtractMore();
                            transClock.start();
                            for (int j = 0; j < display.getOneD().size(); j++) {
                                if (time >= j) {
                                    display.setFrame(display.getOneD(), j);
                                    g.drawImage(display.getCurrentFrame(), display.getX(), display.getY(), null);
                                }
                            }
                            if (time > display.getOneD().size()) {
                                optionD = false;
                            }
                        }
                        animation = false;
                    }
                    if (tally == 2) { // scenario 2
                        if (optionA) {
                            optionA = false;
                        } else if (optionB) {
                            bobette.subtract();

                            optionB = false;
                        } else if (optionC) {
                            bobette.subtractMore();
                            transClock.start();
                            for (int j = 0; j < display.getTwoC().size(); j++) {
                                if (time >= j) {
                                    display.setFrame(display.getTwoC(), j);
                                    g.drawImage(display.getCurrentFrame(), display.getX(), display.getY(), null);
                                }
                            }
                            if (time > display.getTwoC().size()) {
                                optionC = false;
                            }
                        } else if (optionD) {
                            bobette.subtract();
                            optionD = false;
                        }
                        animation = false;
                    }
                    if (tally == 3) { // scenario 3
                        if (optionA) {
                            bobette.subtract();
                            optionA = false;
                        } else if (optionB) {
                            bobette.subtractMore();

                            optionB = false;
                        } else if (optionC) {
                            optionC = false;
                        } else if (optionD) {
                            bobette.subtract();
                            transClock.start();
                            for (int j = 0; j < display.getThreeD().size(); j++) {
                                if (time >= j) {
                                    display.setFrame(display.getThreeD(), j);
                                    g.drawImage(display.getCurrentFrame(), display.getX(), display.getY(), null);
                                }
                            }
                            if (time > display.getThreeD().size()) {
                                optionD = false;
                            }
                        }
                        animation = false;
                    }
                    if (tally == 4) { // scenario 4
                        if (optionA) {
                            bobette.subtractMore();
                            transClock.start();
                            for (int j = 0; j < display.getFourA().size(); j++) {
                                if (time >= j) {
                                    display.setFrame(display.getFourA(), j);
                                    g.drawImage(display.getCurrentFrame(), display.getX(), display.getY(), null);
                                }
                            }
                            if (time > display.getFourA().size()) {
                                optionA = false;
                            }
                        } else if (optionB) {
                            bobette.subtract();

                            optionB = false;
                        } else if (optionC) {
                            bobette.subtract();
                            optionC = false;
                        } else if (optionD) {
                            optionD = false;
                        }
                        animation = false;
                    }
                    if (tally >= 5) { // end results
                        if (bobette.getPoints() == 0) {
                            bobette.setFlag(0);
                            g.drawImage(bobette.getFlag(), 0, 0, null);
                        } else if (bobette.getPoints() < 0 && bobette.getPoints() > -6) {
                            bobette.setFlag(1);
                            g.drawImage(bobette.getFlag(), 0, 0, null);
                        } else if (bobette.getPoints() < -5 && bobette.getPoints() > -11) {
                            bobette.setFlag(2);
                            g.drawImage(bobette.getFlag(), 0, 0, null);
                        }
                    }
                }
            }
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof Timer) {
            time++;
        }
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
            if (a.buttonRectangle().contains(clicked) && (a.getImageString().equals("src/AButton1.png") || a.getImageString().equals("src/AButton2.png") || a.getImageString().equals("src/AButton3.png") || a.getImageString().equals("src/AButton4.png"))) {
                tally++;
                animation = true;
                optionA = true;
            } else if (b.buttonRectangle().contains(clicked) && (b.getImageString().equals("src/BButton1.png") || b.getImageString().equals("src/BButton2.png") || b.getImageString().equals("src/BButton3.png") || b.getImageString().equals("src/BButton4.png"))) {
                tally++;
                animation = true;
                optionB = true;
            } else if (c.buttonRectangle().contains(clicked) && (c.getImageString().equals("src/CButton1.png") || c.getImageString().equals("src/CButton2.png") || c.getImageString().equals("src/CButton3.png") || c.getImageString().equals("src/CButton4.png"))) {
                tally++;
                animation = true;
                optionC = true;
            } else if (d.buttonRectangle().contains(clicked) && (d.getImageString().equals("src/DButton1.png") || d.getImageString().equals("src/DButton2.png") || d.getImageString().equals("src/DButton3.png") || d.getImageString().equals("src/DButton4.png"))) {
                tally++;
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
}