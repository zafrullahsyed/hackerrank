package com.itszaif.leetcode;

import java.util.Stack;

public class ValidParantheses {
    public static void main(String[] args) {
        // String s = "(){}[]";
        String s = "]";
        boolean valid = isValid(s);
        System.out.println(valid);
    }

    static boolean isValid(String givenString) {
        Stack<Character> characterStack = new Stack<>();

        // Convert the given string to character array
        char[] charArray = givenString.toCharArray();
        for (char c : charArray) {
            if (c == '(' || c == '{' || c == '[') {
                characterStack.push(c); // Whatever we get we just add to the stack
            } else {
                // This if (characterStack.isEmpty()) is required because, in the above if condition we are pushing (, {, [ in the stack.
                // if the input is given as ], this does not match the above if condition and else is executed.
                // There would be a stack exception when we are pop null at line 28
                if (characterStack.isEmpty()) {
                    return false;
                }
                char pop = characterStack.pop();
                if (c == ')' && pop != '(' || c == '}' && pop != '{' || c == ']' && pop != '[') {
                    return false;
                }
            }
        }
        // In the given problem, there should always be a set e.b "(" should have ")"
        // if in the given input, we have only "(" as string, then the else block is not run
        // By this condition, we can check if there is a pair or not.
        return characterStack.isEmpty();
    }
}
