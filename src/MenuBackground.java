import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MenuBackground {
    private BufferedImage background;
    public MenuBackground(String pngName) {
        try {
            background = ImageIO.read(new File(pngName));
        } catch (IOException e) {

        }
    }
    public void move() {

    }
}
