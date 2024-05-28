import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class InfoButton extends Button {
    private BufferedImage image; // button image
    private BufferedImage instructions; // info pop up
    public InfoButton(String png, String info, int x, int y) {
        super(png, x, y);
        try {
            image = ImageIO.read(new File(png));
        } catch (IOException e) {

        }
        try {
            instructions = ImageIO.read(new File(info));
        } catch (IOException e) {

        }
    }
    public BufferedImage getImage() {
        return image;
    }
    public BufferedImage getInfo() {
        return instructions;
    }
    public void clicked() {

    }
}
