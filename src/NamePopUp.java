import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class NamePopUp {
    private int x;
    private int y;
    private static final int move = 1;
    private BufferedImage image; // button image
    public NamePopUp(String png, int x, int y) {
        this.x = x;
        this.y = y;
        try {
            image = ImageIO.read(new File(png));
        } catch (IOException e) {

        }
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
    public void hoverUp() {
        y -= move;
    }
    public void hoverDown() {
        y += move;
    }
}
