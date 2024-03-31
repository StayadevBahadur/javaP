package Queues;

public class CustomException2 extends Exception {
     
   
        public CustomException2() {
            super("Stack is empty");
        }
    
        // Constructor with a custom message
        public CustomException2(String message) {
            super(message);
        }
       
    
     
    
}
