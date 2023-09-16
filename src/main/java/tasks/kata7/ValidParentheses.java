package tasks.kata7;

import java.util.Stack;

//Write a function that takes a string of parentheses, and determines if the order of the parentheses is valid.
//The function should return true if the string is valid, and false if it's invalid.
public class ValidParentheses {
    public static boolean validParentheses(String parenStr) {
        Stack<Character> stack = new Stack<>();
        for (char c : parenStr.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            }
            if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
