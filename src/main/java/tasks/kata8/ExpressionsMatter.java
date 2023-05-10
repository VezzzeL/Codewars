package tasks.kata8;

//With the numbers are 1, 2 and 3 , here are some ways of placing signs and brackets:
//The numbers are always positive.
//The numbers are in the range (1 ≤ a,b,c≤ 10).
//You can use the same operation more than once.
//It's not necessary to place all the signs and brackets.
//Repetition in numbers may occur .
//You cannot swap the operands. For instance, in the given example you cannot get expression (1 + 3) * 2 = 8.
public class ExpressionsMatter {
    public static int expressionsMatter(int a, int b, int c) {
        int max = a + b > a * b ? a + b : a * b;
        max = max + c > max * c ? max + c : max * c;
        int max1 = b + c > b * c ? b + c : b * c;
        max1 = max1 + a > max1 * a ? max1 + a : max1 * a;
        return max > max1 ? max : max1;
    }
}
