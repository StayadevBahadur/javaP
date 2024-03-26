package Stack;

public class StackLLUse {
    public static void main(String[] args) throws CustomException {
        StackUsingLL<Integer> stackLL = new StackUsingLL<>();
        for(int i = 1 ; i <=  5 ;i++){
            stackLL.push(i);
        }

        // while (stackLL.isEmpty() != true) {
        //    System.out.print(stackLL.pop() + " "); 
        // }
        
        System.out.println();
        System.out.println(stackLL.getSize());



        }
}
