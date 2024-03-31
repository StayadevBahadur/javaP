package Stack;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
    public static int[] calculateStockSpan(int[] prices) {
        int n = prices.length;
        int[] spans = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            
            // Pop elements from the stack as long as the price at the top of the stack is less than or equal to prices[i]
            while (!stack.isEmpty() && prices[stack.peek()] < prices[i]) {
                stack.pop();
            }
            
            // If the stack is empty, the current day's span is i + 1 (number of days so far)
            // Otherwise, the current day's span is i - stack.peek()
            spans[i] = stack.isEmpty() ? i + 1 : i - stack.peek();

            // Push the current day's index onto the stack
            stack.push(i);
                
           
        }

        return spans;
    }

    public static void main(String[] args) {
        int[] prices = {10, 10 , 10, 10 };
        int[] spans = calculateStockSpan(prices);
        System.out.println("Stock spans: " + Arrays.toString(spans));
    }
}
