package tasks.kata7;
//In this Kata, you will be given a lower case string and your task will be to remove k characters from that string
// using the following rule:
//- first remove all letter 'a', followed by letter 'b', then 'c', etc...
//- remove the leftmost character first.

public class SimpleLetterRemoval {
    public static String solve(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        for (char c = 'a'; c <= 'z'; c++) {
            while (k > 0 && sb.indexOf(String.valueOf(c)) != -1) {
                int index = sb.indexOf(String.valueOf(c));
                sb.deleteCharAt(index);
                k--;
            }
            if (k <= 0) {
                break;
            }
        }
        return sb.toString();
    }
}
