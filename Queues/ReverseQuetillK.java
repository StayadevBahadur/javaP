package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQuetillK {

	public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
        solve(input, k);
        int s = input.size() - k;
        while( s-- > 0){
            int x = input.poll();
            input.add(x);
        }
        return input;
    }
   
      static void solve(Queue<Integer> q, int k){
        if(k == 0) return;
        int e = q.poll();
        solve(q, k - 1);
        q.add(e);
       
    }
    public static void main(String[] args) {
        Queue<Integer> tempQueue = new LinkedList<>();
                tempQueue.add(10);
                tempQueue.add(20);
                tempQueue.add(30);
                tempQueue.add(40);
                tempQueue.add(50);
                tempQueue.add(60);
                tempQueue.add(70);
                // tempQueue.add(80);
                // tempQueue.add(90);
                // tempQueue.add(100);
            Queue<Integer> tempQueue2 =   reverseKElements(tempQueue,6);

        // }
        for (int i = 1; i <= 9; i++) {
            System.out.print(tempQueue2.poll()+" ") ;
        }
    }


}
