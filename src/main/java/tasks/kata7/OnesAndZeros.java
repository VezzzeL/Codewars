package tasks.kata7;

import java.util.List;

//Given an array of ones and zeroes, convert the equivalent binary value to an integer.
//Eg: [0, 0, 0, 1] is treated as 0001 which is the binary representation of 1.
public class OnesAndZeros {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        return binary.stream().reduce(0, (result, bit) -> result * 2 + bit);
    }
}
