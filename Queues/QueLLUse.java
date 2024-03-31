package Queues;

public class QueLLUse {
    public static void main(String[] args) {
         QueueUsingLL<Integer> queue = new QueueUsingLL<>();
         for(int i = 2 ; i<=9 ; i++){
            queue.enqueue(i);
         }
         for(int j = 0 ; j<= 9 ;j++){
            System.out.print(queue.dequeue()+ " ");
         }
    }
}
