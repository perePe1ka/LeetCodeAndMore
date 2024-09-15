package org.example.LeetCode;

import java.util.Stack;

class SolutionLeetCode_ValidParentheses_20 {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch: s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);

            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char delCh = stack.pop();
                if ((ch == ')' && delCh != '(') || (ch == '}' && delCh != '{') || (ch == ']' && delCh != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}