public class Player {
    private int points;
    private String rating;
    private String buttonClicked;
    public Player() {
        points = 0;
        rating = "N/A";
        buttonClicked = "";
    }
    public void pointMath(String code) {
        buttonClicked = code;
        if(buttonClicked.equals("1a") || buttonClicked.equals("2c") || buttonClicked.equals("3b") || buttonClicked.equals("4a") || buttonClicked.equals("5d") || buttonClicked.equals("6c")) {
            points -= 2;
        } else if(buttonClicked.equals("1b") || buttonClicked.equals("2a") || buttonClicked.equals("3d") || buttonClicked.equals("4c") || buttonClicked.equals("5a") || buttonClicked.equals("6b")) {
            points = 0;
        } else if(buttonClicked.equals("1c") || buttonClicked.equals("2b") || buttonClicked.equals("3c") || buttonClicked.equals("4d") || buttonClicked.equals("5c") || buttonClicked.equals("6d")) {
            points--;
        } else if(buttonClicked.equals("1d") || buttonClicked.equals("2d") || buttonClicked.equals("3a") || buttonClicked.equals("4b") || buttonClicked.equals("5b") || buttonClicked.equals("6a")) {
            points--;
        }
    }
}
