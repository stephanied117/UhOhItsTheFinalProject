import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ScenarioBoard {
    private BufferedImage board;
    private int x;
    private int y;

    public ScenarioBoard(String png) {
        try {
            board = ImageIO.read(new File(png));
        } catch (IOException e) {

        }
        this.x = -330;
        this.y = 145;
    }

    public BufferedImage getBoard() {
        return board;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
