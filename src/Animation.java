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
    private int x;
    private int y;

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
        /*
        oneA.add("");
        twoA.add("");
        threeA.add("");
        fourA.add("");
        oneB.add("");
        twoB.add("");
        threeB.add("");
        fourB.add("");
        oneC.add("");
        twoC.add("");
        threeC.add("");
        fourC.add("");
        oneD.add("");
        twoD.add("");
        threeD.add("");
        fourD.add("");

         */
        x = 0;
        y = 0;
    }
    public ArrayList<String> getOneA() {
        return oneA;
    }
    public ArrayList<String> getTwoA() {
        return twoA;
    }
    public ArrayList<String> getThreeA() {
        return threeA;
    }
    public ArrayList<String> getFourA() {
        return fourA;
    }
    public ArrayList<String> getOneB() {
        return oneB;
    }
    public ArrayList<String> getTwoB() {
        return twoA;
    }
    public ArrayList<String> getThreeB() {
        return threeA;
    }
    public ArrayList<String> getFourB() {
        return fourA;
    }
    public ArrayList<String> getOneC() {
        return oneB;
    }
    public ArrayList<String> getTwoC() {
        return twoA;
    }
    public ArrayList<String> getThreeC() {
        return threeA;
    }
    public ArrayList<String> getFourC() {
        return fourA;
    }
    public ArrayList<String> getOneD() {
        return oneB;
    }
    public ArrayList<String> getTwoD() {
        return twoA;
    }
    public ArrayList<String> getThreeD() {
        return threeA;
    }
    public ArrayList<String> getFourD() {
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
