package tasks.kata7;

import java.util.function.IntUnaryOperator;

//Create a function add(n)/Add(n) which returns a function that always adds n to any number
//Note for Java: the return type and methods have not been provided to make it a bit more challenging.
public class FunctionalAddition {
    public static IntUnaryOperator add(int n) {
        return x -> x + n;
    }
}
