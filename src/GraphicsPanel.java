import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class GraphicsPanel extends JPanel implements KeyListener, MouseListener, ActionListener {
    private boolean[] pressedKeys;
    private ArrayList popUps;
    private MenuBackground background;
    private NamePopUp title;
    private PlayButton start;
    private boolean play;
    private AButton a;
    private BButton b;
    private CButton c;
    private DButton d;
    public GraphicsPanel() {
        popUps = new ArrayList<>();
        background = new MenuBackground("src/MenuBackgroundImage.jpg");
        title = new NamePopUp("src/NamePopUpImage.png", -60, -75);
        start = new PlayButton("src/PlayButtonImage.png", -30, 300);
        play = false;
        a = new AButton(-30, 0);
        b = new BButton(-30, 30);
        c = new CButton(-30, 60);
        d = new DButton(-30, 90);
        pressedKeys = new boolean[128];
        addKeyListener(this);
        addMouseListener(this);
        setFocusable(false);
        requestFocusInWindow();
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (play == false) {
            g.drawImage(background.getBackground(), background.getX(), background.getY(), null);
            g.drawImage(title.getImage(), title.getX(), title.getY(), null);
            g.drawImage(start.getImage(), start.getX(), start.getY(), null);
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
        if (play == false && (x > 150 && x < 420 && y > 380 && y < 475)) {
            System.out.println(x + ", " + y);
            play = true;
            System.out.println(play);
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
