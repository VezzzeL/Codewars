package tasks.kata8;

import java.util.List;

//Fix the bug in Filtering method
//The method is supposed to remove even numbers from the list and return a list that contains the odd numbers.
//However, there is a bug in the method that needs to be resolved.
public class FilteringBug {
    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers) {
        return listOfNumbers.stream().filter(n -> n % 2 != 0).toList();
    }
}
