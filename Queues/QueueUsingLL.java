package Queues;

public class QueueUsingLL <T> {
    private Node<Integer> front;   
    private Node<Integer> rear;   
    int size;

    public QueueUsingLL(){
        front = null;
        rear = null;
        size = 0;
    }

    int size(){
        return size;
    }

   boolean isEmpty(){
    return size == 0;
   }

    public void enqueue(int data) {
        Node <Integer> newNode = new Node<>(data);
        if (rear == null) {
            rear = newNode;
            front=newNode;
        }else{
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }


    public int dequeue() {
        if (front == null) {
            return -1;
        }
        Integer data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return data;
    }


    public int front() {
        if (front == null) {
            return -1;
        }
        return front.data;
    }
}
