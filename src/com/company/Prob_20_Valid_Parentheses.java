package com.company;

import java.util.Stack;

public class Prob_20_Valid_Parentheses {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean bo=solution.isValid("(((((([][])))))){}");
        System.out.println(bo);
    }

    static class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            for (char each : s.toCharArray()) {
                if (each == '(') stack.push(')');
                else if (each == '{') stack.push('}');
                else if (each == '[') stack.push(']');
                else if (stack.isEmpty() || stack.pop() != each)
                    return false;
            }
            return stack.isEmpty();
        }
    }
}