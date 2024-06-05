public class Player {
    private int points;
    private String rating;
    public Player() {
        points = 0;
        rating = "N/A";
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
