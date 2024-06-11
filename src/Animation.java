import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Animation {
    private BufferedImage currentFrame;
    private ArrayList<String> oneD;
    private ArrayList<String> twoC;
    private ArrayList<String> threeD;
    private ArrayList<String> fourA;
    private int x;
    private int y;

    public Animation() {
        oneD = new ArrayList<>();
        oneD.add("src/oneD1.png");
        oneD.add("src/oneD2.png");
        oneD.add("src/oneD3.png");
        oneD.add("src/oneD4.png");
        oneD.add("src/oneD5.png");
        oneD.add("src/oneD6.png");
        oneD.add("src/oneD7.png");
        oneD.add("src/oneD8.png");
        twoC = new ArrayList<>();
        twoC.add("src/twoC1.png");
        twoC.add("src/twoC2.png");
        twoC.add("src/twoC3.png");
        twoC.add("src/twoC4.png");
        twoC.add("src/twoC5.png");
        threeD = new ArrayList<>();
        threeD.add("src/threeD1.png");
        threeD.add("src/threeD2.png");
        threeD.add("src/threeD3.png");
        threeD.add("src/threeD4.png");
        threeD.add("src/threeD5.png");
        threeD.add("src/threeD6.png");
        threeD.add("src/threeD7.png");
        fourA = new ArrayList<>();
        fourA.add("src/fourA1.png");
        fourA.add("src/fourA2.png");
        fourA.add("src/fourA3.png");
        fourA.add("src/fourA4.png");
        fourA.add("src/fourA5.png");
        fourA.add("src/fourA6.png");
        fourA.add("src/fourA7.png");
        x = 0;
        y = 0;
    }
    public ArrayList<String> getOneD() {
        return oneD;
    }
    public ArrayList<String> getTwoC() {
        return twoC;
    }
    public ArrayList<String> getThreeD() {
        return threeD;
    }
    public ArrayList<String> getFourA() {
        return fourA;
    }
    public void setFrame(ArrayList<String> list, int i) {
        try {
            currentFrame = ImageIO.read(new File(list.get(i)));
        } catch (IOException e) {

        }
    }
    public BufferedImage getCurrentFrame() {
        return currentFrame;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}
