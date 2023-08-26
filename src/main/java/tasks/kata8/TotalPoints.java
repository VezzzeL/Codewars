package tasks.kata8;

import java.util.Arrays;

//Our football team has finished the championship.
//Our team's match results are recorded in a collection of strings
// . Each match is represented by a string in the format "x:y", where x is our team's
// score and y is our opponents score.
//For example: ["3:1", "2:2", "0:1", ...]
//Points are awarded for each match as follows:
//if x > y: 3 points (win)
//if x < y: 0 points (loss)
//if x = y: 1 point (tie)
//We need to write a function that takes this collection and returns the number of points our team (x) got in
// the championship by the rules given above.
//Notes:
//our team always plays 10 matches in the championship
//0 <= x <= 4
//0 <= y <= 4
public class TotalPoints {
    public static int points(String[] games) {
        return Arrays.stream(games).mapToInt(match -> {
                    String[] scores = match.split(":");
                    int x = Integer.parseInt(scores[0]);
                    int y = Integer.parseInt(scores[1]);
                    return x > y ? 3 : x == y ? 1 : 0;
                }).sum();
    }

    public static void main(String[] args) {
        System.out.println(points(new String[]{"1:1","2:2","3:3","4:4","2:2","3:3","4:4","3:3","4:4","4:4"}));
    }
}
