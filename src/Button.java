import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Button {
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
    public void clicked() {

    }
}
