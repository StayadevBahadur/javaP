package Stack;

public class StackUsinArray {
   private int data[];
   private int top;
    public StackUsinArray(){
        data = new int[10];
        top = -1;
    }
    public StackUsinArray(int capacity){
        data = new int[capacity];
        top = -1;
    }
}
