package tasks.kata8;

//Complete the function which converts a binary number (given as a string) to a decimal number.
public class BinaryToDecimal {
    public static int binToDecimal(String inp) {
        int dec = 0;
        int pow = 0;
        for (int i = inp.length() - 1; i >= 0; i--) {
            char bit = inp.charAt(i);
            if (bit == '1') {
                dec += Math.pow(2, pow);
            }
            pow++;
        }
        return dec;
    }
}
