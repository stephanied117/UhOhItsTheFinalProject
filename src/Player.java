import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Player {
    private int points;
    private ArrayList<String> flags;
    private BufferedImage flag;
    public Player() {
        points = 0;
        flags = new ArrayList<>();
        flags.add("src/GFlag.png");
        flags.add("src/YFlag.png");
        flags.add("src/RFlag.png");
    }
    public void subtract() {
        points--;
    }
    public void subtractMore() {
        points -= 2;
    }
    public int getPoints() {
        return points;
    }
    public BufferedImage getFlag() {
        return flag;
    }
    public void setFlag(int i) {
        try {
            flag = ImageIO.read(new File(flags.get(i)));
        } catch (IOException e) {

        }
    }
}
