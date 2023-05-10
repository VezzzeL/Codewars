package tasks.kata7;

import java.util.*;

//Your task is to remove all consecutive duplicate words from a string, leaving only first words entries. For example:
//
//"alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"
//--> "alpha beta gamma delta alpha beta gamma delta"
//Words will be separated by a single space. There will be no leading or trailing spaces in the string.
// An empty string (0 words) is a valid input.
public class RemoveConsecutiveDuplicateWords {
    public static String removeConsecutiveDuplicates(String s) {
        LinkedList<String> strs = new LinkedList<String>();
        strs.addAll(Arrays.stream(s.split(" ")).toList());
        StringBuilder sb = new StringBuilder();
        String temp = "";
        for (String str : strs) {
            if (!str.equals(temp)) {
                sb.append(str + " ");
                temp = str;
            }
        }
        return sb.toString().trim();
    }
}
