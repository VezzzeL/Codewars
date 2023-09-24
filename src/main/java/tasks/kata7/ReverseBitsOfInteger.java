package tasks.kata7;

//Write a function that reverses the bits in an integer.
//For example, the number 417 is 110100001 in binary. Reversing the binary is 100001011 which is 267.
//You can assume that the number is not negative.
public class ReverseBitsOfInteger {
    public static int reverseBits(int n) {
        return Integer.parseInt(new StringBuilder(Integer.toBinaryString(n)).reverse().toString(), 2);
    }
}
