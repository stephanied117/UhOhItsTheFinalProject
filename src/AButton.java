import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class AButton extends Button {
    private BufferedImage image; // button image
    private String currentImage;
    private String[] options; // list of strings of pngs
    public AButton(int x, int y) {
        super("", x, y);
        options = new String[6];
        options[0] = "src/AButtonImage.png";
        options[1] = "src/AButtonImage.png";
        options[2] = "src/AButtonImage.png";
        options[3] = "src/AButtonImage.png";
        options[4] = "src/AButtonImage.png";
        options[5] = "src/AButtonImage.png";
        try {
            image = ImageIO.read(new File(options[0]));
        } catch (IOException e) {

        }
        currentImage = options[0];
    }
}
