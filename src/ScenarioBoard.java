import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ScenarioBoard {
    private ArrayList<String> boardList;
    private BufferedImage board;
    private int x;
    private int y;

    public ScenarioBoard() {
        boardList = new ArrayList<>();
        boardList.add("src/ScenarioBoard1.png");
        boardList.add("src/ScenarioBoard2.png");
        boardList.add("src/ScenarioBoard3.png");
        boardList.add("src/ScenarioBoard4.png");
        try {
            board = ImageIO.read(new File(boardList.get(0)));
        } catch (IOException e) {

        }
        this.x = -325;
        this.y = 170;
    }
    public BufferedImage getBoard() {
        return board;
    }
    public void setBoard(int i) {
        try {
            board = ImageIO.read(new File(boardList.get(i)));
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
