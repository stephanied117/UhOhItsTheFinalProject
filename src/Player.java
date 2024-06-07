public class Player {
    private int points;
    public Player() {
        points = 0;
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
}
