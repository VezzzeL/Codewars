package tasks.kata7;

//No Story
//No Description
//Only by Thinking and Testing
//Look at result of testcase, guess the code!
public class ThinkingTestingTrueFalse {
    public static int testTrueFalse(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
}
