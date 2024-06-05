import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BButton extends Button {
    private BufferedImage temp;
    private String currentImage;
    private String[] options; // list of strings of pngs
    public BButton(int x, int y) {
        super("src/BButtonImage.png", x, y);
        options = new String[6];
        options[0] = "src/BButtonImage.png";
        options[1] = "src/BButtonImage.png";
        options[2] = "src/BButtonImage.png";
        options[3] = "src/BButtonImage.png";
        options[4] = "src/BButtonImage.png";
        options[5] = "src/BButtonImage.png";
        currentImage = options[0];
    }
    public BufferedImage getImage() {
        try {
            temp = ImageIO.read(new File(currentImage));
        } catch (IOException e) {

        }
        return temp;
    }

}
