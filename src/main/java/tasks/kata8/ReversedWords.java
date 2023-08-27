package tasks.kata8;

import java.util.Arrays;

//Complete the solution so that it reverses all of the words within the string passed in.
//Words are separated by exactly one space and there are no leading or trailing spaces.
public class ReversedWords {
    public static String reverseWords(String str){
         return Arrays.stream(str.split(" "))
                 .reduce((w1, w2) -> w2 + " "+w1).orElse("");
    }
}
