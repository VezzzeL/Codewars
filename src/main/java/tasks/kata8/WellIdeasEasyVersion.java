package tasks.kata8;

import java.util.Arrays;

//For every good kata idea there seem to be quite a few bad ones!
//In this kata you need to check the provided array (x) for good ideas 'good' and bad ideas 'bad'. If there are one or
// two good ideas, return 'Publish!', if there are more than 2 return 'I smell a series!'. If there are no good ideas, as is often the case, return 'Fail!'.
public class WellIdeasEasyVersion {
    public static String well(String[] x) {
        int countGood = (int) Arrays.stream(x).filter(s -> s.equals("good")).count();
        return countGood <= 0 ? "Fail!" : countGood <= 2 ? "Publish" : "I smell a series!";
    }
}
