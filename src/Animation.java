import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Animation {
    private BufferedImage currentFrame;
    private String currentImage;
    private ArrayList oneA;
    private ArrayList oneB;
    private ArrayList oneC;
    private ArrayList oneD;
    private ArrayList twoA;
    private ArrayList twoB;
    private ArrayList twoC;
    private ArrayList twoD;
    private ArrayList threeA;
    private ArrayList threeB;
    private ArrayList threeC;
    private ArrayList threeD;
    private ArrayList fourA;
    private ArrayList fourB;
    private ArrayList fourC;
    private ArrayList fourD;

    public Animation() {
        currentImage = "";

    }
    public BufferedImage getAniFrame() {
        try {
            currentFrame = ImageIO.read(new File(currentImage));
        } catch (IOException e) {

        }
        return currentFrame;
    }
}
