package tasks.kata7;

//Create a function that checks if the first argument n is divisible by all other arguments
// (return true if no other arguments)
public class IsNDivisibleBy {
    public static boolean isDivisible(int... numbers) {
        for (int i : numbers) {
            if (numbers[0] % i != 0) return false;
        }
        return true;
    }
}
