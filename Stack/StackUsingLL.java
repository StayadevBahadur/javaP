package Stack;

public class StackUsingLL <T>{
   private Node<T> head;   
   int size;
   
   public StackUsingLL() {
    head = null;
    size = 0;
}

/*----------------- Public Functions of Stack -----------------*/
public void push(T element) {
    Node <T> newNode = new Node<T>(element);
    newNode.next = head;
    head = newNode;
    size++;
}

public int getSize() { 
    return size;
    
}

public boolean isEmpty() {
    return head == null;
}



public T pop() {
    T tNode = null;
        if (head!= null) {
            tNode = head.data;
            head = head.next;
            size--;
            
        }
        return tNode;
   
}

public T top() {
   return head.data;
}

}
