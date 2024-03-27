package Stack;
import java.util.Stack;

public class StackCollection {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int arr[] ={12 , 23, 35, 56, 67};
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
        
    }
}
