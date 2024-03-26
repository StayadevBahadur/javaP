package Stack;

public class Node <T>{
    // Node is the single value and address of the sencond value .
    T data;
    Node<T> next;
    Node(T data){
            this.data=data;
            next=null;      
    }
}