package tasks.kata7;

//Return the number (count) of vowels in the given string.
//We will consider a, e, i, o, u as vowels for this Kata (but not y).
//The input string will only consist of lower case letters and/or spaces.
public class VowelCount {
    public static int getCount(String str) {
        return str.replaceAll("[^aeiouAEIOU]", "").length();
    }
}
