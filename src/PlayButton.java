import javax.imageio.ImageIO;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PlayButton extends Button {
    private BufferedImage image; // button image
    public PlayButton(String png, int x, int y) {
        super(png, x, y);
        try {
            image = ImageIO.read(new File(png));
        } catch (IOException e) {

        }
    }
    public BufferedImage getImage() {
        return image;
    }
}
