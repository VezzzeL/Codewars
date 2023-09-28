package tasks.kata7;
//A 6-sided die is rolled a number of times and the results are plotted as a character-based histogram.
//6|##### 5
//5|
//4|# 1
//3|########## 10
//2|### 3
//1|####### 7
//You will be passed the dice value frequencies, and your task is to write the code to return a string representing
// a histogram, so that when it is printed it has the same format as the example.
public class HistogramH1 {
    public static String histogram(final int results[]) {
        StringBuilder sb = new StringBuilder();
        for (int face = 6; face >= 1; face--) {
            sb.append(face).append("|");
            int count = results[face - 1];
            for (int i = 0; i < count; i++) {
                sb.append('#');
            }
            if (count > 0) {
                sb.append(" ").append(count);
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
