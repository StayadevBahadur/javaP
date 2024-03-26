package Stack;

public class CustomException extends Exception {
   
    public CustomException() {
        super("Stack is empty");
    }

    // Constructor with a custom message
    public CustomException(String message) {
        super(message);
    }
   

 
}

