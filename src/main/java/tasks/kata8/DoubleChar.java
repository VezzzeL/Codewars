package tasks.kata8;

import java.util.Arrays;
import java.util.stream.Collectors;

//Given a string, you have to return a string in which each character (case-sensitive) is repeated once.
public class DoubleChar {
    public static String doubleChar(String s){
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            sb.append(c).append(c);
        }
        return sb.toString();
    }
}
