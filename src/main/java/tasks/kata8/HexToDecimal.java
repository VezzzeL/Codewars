package tasks.kata8;
//Complete the function which converts hex number (given as a string) to a decimal number.
public class HexToDecimal {
    public static int hexToDec(final String hexString) {
        return Integer.parseInt(hexString.startsWith("0x") ? hexString.substring(2) : hexString, 16);
    }
}
