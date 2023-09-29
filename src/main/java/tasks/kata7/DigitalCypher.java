package tasks.kata7;

import java.util.Arrays;
import java.util.HashMap;

//Digital Cypher assigns to each letter of the alphabet unique number. For example:
// a  b  c  d  e  f  g  h  i  j  k  l  m
// 1  2  3  4  5  6  7  8  9 10 11 12 13
// n  o  p  q  r  s  t  u  v  w  x  y  z
//14 15 16 17 18 19 20 21 22 23 24 25 26
//Instead of letters in encrypted word we write the corresponding number, eg. The word scout:
// s  c  o  u  t
//19  3 15 21 20
//Then we add to each obtained digit consecutive digits from the key. For example. In case of key equal to 1939 :
public class DigitalCypher {
    public static int[] encode(String message, int key) {
        HashMap<Character, Integer> data = new HashMap<>();
        int[] res = new int[message.length()];
        int keyCounter = 0;
        int[] keys = Arrays.stream(String.valueOf(key).split("")).mapToInt(Integer::parseInt).toArray();

        for (char ch = 'a'; ch <= 'z'; ch++) {
            data.put(ch, ch - 'a' + 1);
        }
        for (int i = 0; i < res.length; i++) {
            res[i] = data.get(message.charAt(i)) + keys[keyCounter];
            keyCounter++;
            if (keyCounter > keys.length - 1) {
                keyCounter = 0;
            }
        }
        return res;
    }
}
