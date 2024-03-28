package Stack;

import java.util.Stack;

public class BalenceParentheses {
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char c : expression.toCharArray()) {
            if (c == '(') {
                stack.push(c); // Push opening brackets onto the stack
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false; // If stack is empty or top is not an opening bracket, it's unbalanced
                }
            }
        }

        return stack.isEmpty(); // Stack should be empty if all brackets are balanced
    }
    
    public static void main(String[] args) {
       System.out.println( isBalanced("((()))"));
      
    }

}
