package tasks.kata7;

import java.math.BigInteger;

//Your task is to find the maximum number of queens that can be put on the board so that there would be one single
// unbeaten square (ie. threatened by no queen on the board).
//The Queen can move any distance vertically, horizontally and diagonally.
public class FindingQueensOnBoard {
    public static BigInteger queens(BigInteger n) {
        return n.compareTo(BigInteger.TWO) <= 0 ? BigInteger.ZERO :
                n.subtract(BigInteger.ONE).multiply(n.subtract(BigInteger.TWO));
    }
}
