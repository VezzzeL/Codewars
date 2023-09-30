package tasks.kata7;

import java.util.Arrays;
import java.util.stream.IntStream;

//No Description
//Only by Thinking and Testing
//Look at result of testcase, guess the code!
public class ThinkingTestingUniqNotUniq {
    public static int[] testit(int[] a, int[] b) {
        IntStream aStr = Arrays.stream(a).distinct();
        IntStream bStr = Arrays.stream(b).distinct();
        return IntStream.concat(aStr, bStr).sorted().toArray();
    }
}
