import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Animation {
    private BufferedImage currentFrame;
    private String currentImage;
    private ArrayList allAnimations;
    private ArrayList<String> oneA;
    private ArrayList<String> oneB;
    private ArrayList<String> oneC;
    private ArrayList<String> oneD;
    private ArrayList<String> twoA;
    private ArrayList<String> twoB;
    private ArrayList<String> twoC;
    private ArrayList<String> twoD;
    private ArrayList<String> threeA;
    private ArrayList<String> threeB;
    private ArrayList<String> threeC;
    private ArrayList<String> threeD;
    private ArrayList<String> fourA;
    private ArrayList<String> fourB;
    private ArrayList<String> fourC;
    private ArrayList<String> fourD;

    public Animation() {
        currentImage = "";
        allAnimations = new ArrayList<>();
        allAnimations.add(oneA);
        allAnimations.add(twoA);
        allAnimations.add(threeA);
        allAnimations.add(fourA);
        allAnimations.add(oneB);
        allAnimations.add(twoB);
        allAnimations.add(threeB);
        allAnimations.add(fourB);
        allAnimations.add(oneC);
        allAnimations.add(twoC);
        allAnimations.add(threeC);
        allAnimations.add(fourC);
        allAnimations.add(oneD);
        allAnimations.add(twoD);
        allAnimations.add(threeD);
        allAnimations.add(fourD);
    }
    public BufferedImage getAniFrame() {
        try {
            currentFrame = ImageIO.read(new File(currentImage));
        } catch (IOException e) {

        }
        return currentFrame;
    }
}
