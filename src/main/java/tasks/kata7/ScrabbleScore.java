package tasks.kata7;

//Write a program that, given a word, computes the scrabble score for that word.
//"cabbage" should be scored as worth 14 points:
//3 points for C
//1 point for A, twice
//3 points for B, twice
//2 points for G
//1 point for E
public class ScrabbleScore {
    public static int scrabbleScore(String word) {
        if (word == null || word.length() == 0) return 0;
        int count = 0;
        for (char c : word.toUpperCase().toCharArray()) {
            switch (c) {
                case 'A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T' -> count += 1;
                case 'D', 'G' -> count += 2;
                case 'B', 'C', 'M', 'P' -> count += 3;
                case 'F', 'H', 'V', 'W', 'Y' -> count += 4;
                case 'K' -> count += 5;
                case 'J', 'X' -> count += 8;
                case 'Q', 'Z' -> count += 10;
                default -> {}
            }
        }
        return count;
    }
}
