package tasks.kata8;

public class RockPaperScissors {
    public static String rps(String p1, String p2) {
        if (p1.equals(p2)) {
            return "Draw!";
        } else if ((p1.equals("scissors") && p2.equals("paper")) ||
                (p1.equals("paper") && p2.equals("rock")) ||
                (p1.equals("rock") && p2.equals("scissors"))) {
            return "Player 1 won!";
        } else {
            return "Player 2 won!";
        }
    }
}
