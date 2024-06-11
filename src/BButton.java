import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BButton extends Button {
    private BufferedImage temp;
    private String currentImage;
    private String[] options; // list of strings of pngs
    public BButton(int x, int y) {
        super("src/BButton1.png", x, y);
        options = new String[6];
        options[0] = "src/BButton1.png";
        options[1] = "src/BButton2.png";
        options[2] = "src/BButton3.png";
        options[3] = "src/BButton4.png";
        currentImage = options[0];
    }
    public BufferedImage getImage() {
        try {
            temp = ImageIO.read(new File(currentImage));
        } catch (IOException e) {

        }
        return temp;
    }
    public void setImage(int i) {
        currentImage = options[i];
    }
}
