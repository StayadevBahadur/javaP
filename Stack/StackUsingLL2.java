package Stack;

public class StackUsingLL2 <T>{
    private Node<T> head;
    private int size;

   public StackUsingLL2(){
        head = null;
        size = 0;
    }

    int size(){
        return size;
    }

    boolean isEmpty(){
        return size() == 0;
    }

    T topElem() throws CustomException{

        if (size()==0) {
            throw new CustomException("Stack is empty. Cannot retrieve top element.");
        }
        return head.data;
    }

    void pushElem(T element){
        Node<T> newNode = new Node<T>(element);
        newNode.next = head;
        head = newNode;
        size++;
    }
}
