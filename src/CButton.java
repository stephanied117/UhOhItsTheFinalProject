import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CButton extends Button {
    private BufferedImage image; // button image
    private String currentImage;
    private String[] options; // list of strings of pngs
    public CButton(int x, int y) {
        super("", x, y);
        options = new String[6];
        options[0] = "src/CButtonImage.png";
        options[1] = "src/CButtonImage.png";
        options[2] = "src/CButtonImage.png";
        options[3] = "src/CButtonImage.png";
        options[4] = "src/CButtonImage.png";
        options[5] = "src/CButtonImage.png";
        try {
            image = ImageIO.read(new File(options[0]));
        } catch (IOException e) {

        }
        currentImage = options[0];
    }
}
