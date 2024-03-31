package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueReverse {
    public static void reverseQueue(Queue<Integer> input) {
        if (input.isEmpty()) {
                return;
                }

         int frontElement = input.poll();

         reverseQueue(input);

          input.add(frontElement);
}

    public static void main(String[] args) {
        Queue<Integer> tempQueue = new LinkedList<>();
        for (int i = 4; i <= 9; i++) {
            tempQueue.add(i);
        }

        // for(int j = 0;j<= 9 ;j++){
        reverseQueue(tempQueue);

        // }
        for (int i = 4; i <= 9; i++) {
            System.out.print(tempQueue.poll());
        }
    }

}
