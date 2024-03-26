package Stack;

public class StackUsinArray {
    private int data[];
    private int top;// index of the topmost element

    public StackUsinArray() {
        data = new int[10];
        top = -1;
    }

    public StackUsinArray(int capacity) {
        data = new int[capacity];
        top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);

    }

    public int Size() {
        return top + 1;
    }

    public int top() throws CustomException {
        if (Size() == 0) {
            throw new CustomException("Stack is empty. Cannot retrieve top element.");
        }
        return data[top];
    }

    public void push(int element) throws CustomException {
        if (Size() == data.length) {
            throw new CustomException("Stack is full. Cannot push element.");
        }
        top++;
        data[top] = element;
    }

    public int pop() throws CustomException {
        if (Size() == 0) {
            throw new CustomException("Stack is Empty. Cannot pop element.");
        }
        int temp = data[top];
        top--;
        return temp;
    }
}
