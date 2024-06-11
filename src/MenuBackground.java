import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MenuBackground {
    private BufferedImage background;
    private int x;
    private int y;

    public MenuBackground(String png) {
        try {
            background = ImageIO.read(new File(png));
        } catch (IOException e) {

        }

        this.x = 0;
        this.y = 0;
    }
    public BufferedImage getBackground() {
        return background;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}
