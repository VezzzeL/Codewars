package tasks.kata7;

//Using n as a parameter in the function pattern, where n>0, complete the codes to get the pattern
// (take the help of examples):
//Note: There is no newline in the end (after the pattern ends)
//pattern(3) should return "1\n1*2\n1**3", e.g. the following
public class NumberStarLadder {
    public static String pattern(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(i);
            if (i != n) {
                sb.append("\n").append(1);
                for (int j = 1; j <= i; j++) {
                    sb.append("*");
                }
            }
        }
        return sb.toString();
    }
}
