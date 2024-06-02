import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Button implements MouseListener {
    private BufferedImage image;
    private int x;
    private int y;
    public Button(String png, int x, int y) {
        try {
            image = ImageIO.read(new File(png));
        } catch (IOException e) {

        }
        this.x = x;
        this.y = y;
    }
    public BufferedImage getImage() {
        return image;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public Rectangle buttonRectangle() {
        Rectangle b = new Rectangle(x, y, getImage().getWidth(), getImage().getHeight());
        return b;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("omg it works?!");
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
