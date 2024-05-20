package PriorityQueue;
import java.util.ArrayList;

public class priority_Queue {
    // On the bases of multiple factor we will decide the priority of the element 
    // heap is nothing but a complete binry tree
    // complete binary tree means nodes at it level's should be completed except last level
    // insertion should be left to right

    ArrayList<Integer> heap;

    public priority_Queue(){
        heap = new ArrayList<>();
    }

    boolean isEmpty(){
        return heap.size() == 0;
    }

    int size(){
        return heap.size();
    }

    int getMin(){
        if (isEmpty()) {
            return -1;
        }
        return heap.get(0);
    }

    void insert(int element){
        heap.add(element);
        int childIndex = heap.size() -1;
        int parentIndex = (childIndex-1)/2;

        while (childIndex>0) {
            
            if (heap.get(childIndex)<heap.get(parentIndex)) {
                int temp = heap.get(childIndex);
                heap.set(childIndex, heap.get(parentIndex));
                heap.set(parentIndex,temp);
                childIndex = parentIndex;
                parentIndex= (childIndex-1)/2;
            }else{
                return;
            }
        }
    }
}
