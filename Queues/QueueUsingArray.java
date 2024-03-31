package Queues;

import Stack.CustomException;

public class QueueUsingArray {
    private int data[];
    private int front;// Index at which front is store
    private int rear;// Index at which rear element is store
    private int size;

    public QueueUsingArray() {
        data = new int[10];
        front = -1;
        rear = -1;
        size = 0;

    }

    public QueueUsingArray(int capacity) {
        data = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;

    }

    int size() {
        return size;
    }

    boolean isEmpty() throws CustomException2 {
        return size == 0;
    }

    int front() throws CustomException2 {
        if (size() == 0) {
            throw new CustomException2("Queue is empty. Cannot retrieve front element.");
        }
        return data[front];
    }

    void enqueue(int element) throws CustomException2 {
        try {
            if (size == 0) {
                front = 0;
            }
             size++;
             rear++;
             if (rear == data.length) {
                rear = 0;   
             }
             data[rear] = element;
        } catch (Exception e) {
            if (size() == 0) {
                throw new CustomException2("Queue is full. Cannot add front element.");
            }
        }
        
        
    }

    int dequeue() throws CustomException2{
        if (isEmpty()) {
            throw new CustomException2("Queue is empty. Cannot retrieve front element.");
        }
        int temp = data[front];
        front++;
        if (front == data.length) {
           front = 0; 
        }
        size--;  
        if (size==0) {
            front=-1;
            rear=-1;
        }
        return temp;
    }
}