package tasks.kata7;
//today we will be evaluating an expression like this:
//(there are an infinite number of radicals)
//for a given value x
//arguments passed in will be 1 or greater
public class InfinitelyNestedRadicals {
    public static double evaluateFunction(int x) {
        double res = 1.0, epsilon = 1e-10;
        while (true) {
            if (Math.abs(Math.sqrt(res + x) - res) < epsilon) {
                break;
            }
            res = Math.sqrt(res + x);
        }
        return res;
    }
}
