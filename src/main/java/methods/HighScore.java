package methods;

public class HighScore {

  public static int calculateHighScorePosition(int score) {
    int position = 4;
    if (score >= 1000) {
      position = 1;
    } else if (score >= 500) {
      position = 2;
    } else if (score >= 100) {
      position = 3;
    }
    return position;
  }

  public static void displayHighScorePosition(String name, int position) {
    System.out.println(name + " managed to get into position " + position + " on the high score table.");
  }
}
