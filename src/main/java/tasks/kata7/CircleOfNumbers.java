package tasks.kata7;

//Consider integer numbers from 0 to n - 1 written down along the circle in such a way that the distance between
// any two neighbouring numbers is equal (note that 0 and n - 1 are neighbouring, too).
//Given n and firstNumber/first_number/first-number, find the number which is written in the radially opposite
// position to firstNumber.
public class CircleOfNumbers {
    public static int circleOfNumbers(int n, int firstNumber) {
        return n % 2 == 0 ? (firstNumber + n / 2) % n : (firstNumber + n / 2) % n;
    }
}
