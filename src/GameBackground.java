import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class GameBackground {
    private ArrayList<String> bkgdList;
    private BufferedImage background;
    private int x;
    private int y;

    public GameBackground() {
        bkgdList = new ArrayList<>();
        bkgdList.add("src/GameBackground1.png");
        bkgdList.add("src/GameBackground2.png");
        bkgdList.add("src/GameBackground3.png");
        bkgdList.add("src/GameBackground4.png");
        try {
            background = ImageIO.read(new File(bkgdList.get(0)));
        } catch (IOException e) {

        }
        this.x = 0;
        this.y = 0;
    }
    public BufferedImage getBackground() {
        return background;
    }
    public void setBackground(int i) {
        try {
            background = ImageIO.read(new File(bkgdList.get(i)));
        } catch (IOException e) {

        }
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}
