import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Transition {
    private ArrayList<String> frameStrings;
    private ArrayList<BufferedImage> frames;
    private BufferedImage currentFrame;
    private int x;
    private int y;
    public Transition(int x, int y) {
        frameStrings = new ArrayList<>();
        frameStrings.add("src/Transition1.png");
        frameStrings.add("src/Transition2.png");
        frameStrings.add("src/Transition3.png");
        frameStrings.add("src/Transition4.png");
        frameStrings.add("src/Transition5.png");
        frames = new ArrayList<>();
        for (int i = 0; i < frameStrings.size(); i++) {
            try {
                currentFrame = ImageIO.read(new File(frameStrings.get(i)));
            } catch (IOException e) {

            }
            frames.add(currentFrame);

        }
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public BufferedImage getCurrentFrame() {
        return currentFrame;
    }
    public ArrayList<BufferedImage> getFrames() {
        return frames;
    }
    public void setFrame(int i) {
        try {
            currentFrame = ImageIO.read(new File(frameStrings.get(i)));
        } catch (IOException e) {

        }
    }
}
