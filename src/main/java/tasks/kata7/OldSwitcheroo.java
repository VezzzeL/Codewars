package tasks.kata7;

//Write a function
//vowel2Index(String s)
//that takes in a string and replaces all the vowels [a,e,i,o,u] with their respective positions within that string.
//E.g:
//Kata.Vowel2Index("this is my string") == "th3s 6s my str15ng"
//Kata.Vowel2Index("Codewars is the best site in the world") == "C2d4w6rs 10s th15 b18st s23t25 27n th32 w35rld"
//Your function should be case insensitive to the vowels.
public class OldSwitcheroo {
    public static String vowel2Index(String s) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if ("aeiouAEIOU".contains(String.valueOf(s.charAt(i)))) {
                res.append(i + 1);
            } else {
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
}
