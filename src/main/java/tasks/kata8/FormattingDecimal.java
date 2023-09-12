package tasks.kata8;

//Each number should be formatted that it is rounded to two decimal places. You don't need to check whether the input
// is a valid number because only valid numbers are used in the tests.
public class FormattingDecimal {
    public static double TwoDecimalPlaces(double number) {
        return Double.parseDouble(String.format("%.2f", number));
    }
}
