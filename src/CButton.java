import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CButton extends Button {
    private BufferedImage image; // button image
    private String currentImage;
    private String[] options; // list of strings of pngs
    public CButton(int x, int y) {
        super(null, x, y);
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

    public void clicked() {
        if (currentImage.equals(options[0])) {

        } else if (currentImage.equals(options[1])) {

        } else if (currentImage.equals(options[2])) {

        } else if (currentImage.equals(options[3])) {

        } else if (currentImage.equals(options[4])) {

        } else if (currentImage.equals(options[5])) {

        }
    }
}
