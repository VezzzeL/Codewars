package tasks.kata8;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//NOTE! This kata can be more difficult than regular 8-kyu katas (lets say 7 or 6 kyu)
//Complete the function which get an input number n such that n >= 10 and n < 10000, then:
//Sum all the digits of n.
//Subtract the sum from n, and it is your new n.
//If the new n is in the list below return the associated fruit, otherwise return back to task 1.
//Example
//n = 325
//sum = 3+2+5 = 10
//n = 325-10 = 315 (not in the list)
//sum = 3+1+5 = 9
//n = 315-9 = 306 (not in the list)
//sum = 3+0+6 = 9
//n =306-9 = 297 (not in the list)
//...until you find the first n in the list below.
//There is no preloaded code to help you. This is not about coding skills; think before you code
public class NeverVisitA {
    public static String subtractSum(int n) {
        n = getN(n);
        while ((n < 1 || n > 100)) {
            n = getN(n);
        }
        String[] fruits = new String[]{"kiwi", "pear", "kiwi", "banana", "melon",
                "banana", "melon", "pineapple", "apple", "pineapple",
                "cucumber", "pineapple", "cucumber", "orange", "grape",
                "orange", "grape", "apple", "grape", "cherry",
                "pear", "cherry", "pear", "kiwi", "banana",
                "kiwi", "apple", "melon", "banana", "melon",
                "pineapple", "melon", "pineapple", "cucumber", "orange",
                "apple", "orange", "grape", "orange", "grape",
                "cherry", "pear", "cherry", "pear", "apple",
                "pear", "kiwi", "banana", "kiwi", "banana",
                "melon", "pineapple", "melon", "apple", "cucumber",
                "pineapple", "cucumber", "orange", "cucumber", "orange",
                "grape", "cherry", "apple", "cherry", "pear",
                "cherry", "pear", "kiwi", "pear", "kiwi",
                "banana", "apple", "banana", "melon", "pineapple",
                "melon", "pineapple", "cucumber", "pineapple", "cucumber",
                "apple", "grape", "orange", "grape", "cherry",
                "grape", "cherry", "pear", "cherry", "apple",
                "kiwi", "banana", "kiwi", "banana", "melon",
                "banana", "melon", "pineapple", "apple", "pineapple"};
        Map<Integer, String> fruitMap = IntStream.rangeClosed(1, 100)
                .boxed()
                .collect(Collectors.toMap(
                        i -> i,
                        i -> fruits[i - 1]
                ));
        return fruitMap.get(n);
    }

    static int getN(int n) {
        return n - String.valueOf(n)
                .chars()
                .map(Character::getNumericValue)
                .sum();
    }
}
