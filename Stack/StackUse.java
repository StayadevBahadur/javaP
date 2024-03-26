package Stack;

public class StackUse {
    public static void main(String[] args) throws CustomException {
        StackUsinArray stack = new StackUsinArray();
        for(int i = 1 ; i <=  5;i++){
            stack.push(i);
        }

        // while (!stack.isEmpty()) {
        //    System.out.print(stack.pop() + " "); 
        // }

        System.out.println(stack.Size());
        try {
            int topElement = stack.top();
            System.out.println("Top element of the stack: " + topElement);
        } catch (CustomException e) {
            System.out.println("Caught StackEmptyException: " + e.getMessage());
        }
        try {
            int popedElement = stack.pop();
            System.out.println("poped element of the stack: " + popedElement);
        } catch (CustomException e) {
            System.out.println("Caught StackEmptyException: " + e.getMessage());
        }
      
    }
}
