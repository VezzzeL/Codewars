package tasks.kata8;

//In some scripting languages like PHP, there exists a logical operator (e.g. &&, ||, and, or, etc.) called the
// "Exclusive Or" (hence the name of this Kata). The exclusive or evaluates two booleans. It then returns true if
// exactly one of the two expressions are true, false otherwise.
public class ExclusiveXor {
    public static boolean xor(boolean a, boolean b) {
        return a ^ b;
    }
}
