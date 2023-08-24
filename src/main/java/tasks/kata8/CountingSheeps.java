package tasks.kata8;

import java.util.Arrays;

//Consider an array/list of sheep where some sheep may be missing from their place.
// We need a function that counts the number of sheep present in the array (true means present).
public class CountingSheeps {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;
        for (Boolean isSheep : arrayOfSheeps) {
            if (isSheep != null && isSheep) {
                count++;
            }
        }
        return count;
    }
}
