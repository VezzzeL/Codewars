package tasks.kata7;

//Create a function that returns the sum of the digits formed from the first and last digits, all the way to the
// center of the number.
public class ClosingInSum {
    public static int closingInSum(long n) {
        String numberStr = Long.toString(n);
        int left = 0, right = numberStr.length() - 1, sum = 0;

        while (left <= right) {
            int leftD = Character.getNumericValue(numberStr.charAt(left));
            int rightD = Character.getNumericValue(numberStr.charAt(right));
            if (leftD == 0 && rightD != 0) {
                sum += Math.abs(leftD - rightD);
            } else if (left == right) {
                sum += leftD;
            } else {
                sum += Integer.parseInt(numberStr.charAt(left) + Character.toString(numberStr.charAt(right)));
            }
            left++;
            right--;
        }
        return sum;
    }
}
