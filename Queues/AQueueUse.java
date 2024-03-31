package Queues;

public class AQueueUse {
    public static void main(String[] args) throws CustomException2 {
        QueueUsingArray que = new QueueUsingArray();
        for (int i = 0; i <= 9; i++) {
            que.enqueue(i);
        }
        for(int j = 0;j<= 9 ;j++){
            System.out.print(que.dequeue() + " ");
        }
     
    }

}
