package org.example;

import java.util.Stack;

public class CheckValidParanthesis {
    public static void main(String[] args) {
        String input = "{[()]}";
        boolean isValid = checkValidParentheses(input);
        System.out.println("Is the input valid? " + isValid);
    }

    public static boolean checkValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // If it's an opening bracket, push onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            // If it's a closing bracket
            else if (c == ')' || c == '}' || c == ']') {
                // Check if stack is empty or top of stack doesn't match
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), c)) {
                    return false;
                }
            }
        }
        // Stack should be empty if all brackets are matched
        return stack.isEmpty();
    }

    // Helper method to check matching pairs
    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }
}
