package tasks.kata7;

//The vowel substrings in the word codewarriors are o,e,a,io. The longest of these has a length of 2.
// Given a lowercase string that has alphabetic characters only (both vowels and consonants) and no spaces,
// return the length of the longest vowel substring. Vowels are any of aeiou.

public class LongestVowelChain {
    public static int solve(String s) {
        int max = 0, temp = 0;
        for (char c : s.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) >= 0) {
                temp++;
                max = Math.max(max, temp);
            } else {
                temp = 0;
            }
        }
        return max;
    }
}
