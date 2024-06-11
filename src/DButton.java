import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class DButton extends Button {
    private BufferedImage temp;
    private String currentImage;
    private String[] options; // list of strings of pngs
    public DButton(int x, int y) {
        super("src/DButton1.png", x, y);
        options = new String[6];
        options[0] = "src/DButton1.png";
        options[1] = "src/DButton2.png";
        options[2] = "src/DButton3.png";
        options[3] = "src/DButton4.png";
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
