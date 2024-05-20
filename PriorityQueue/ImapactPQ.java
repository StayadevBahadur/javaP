package PriorityQueue;

public class ImapactPQ {

    public static int removeMinVirtualHeap(int arr[], int size){
        int temp = arr[0];
        arr[size-1] = temp;
        size --;
        int index = 0;
        int leftIndex  = 2 * index +1;
        int rightIndex = 2 * index + 2;

        while (leftIndex < size) {
            int minIndex = index;
            if (arr[leftIndex]<arr[minIndex]) {
                minIndex = leftIndex;
            }
            if (rightIndex < size && arr[rightIndex]<arr[minIndex]) {
                minIndex = rightIndex;
            }
            if (minIndex != index) {
                
                int temp1 = arr[index];
                arr[index] = arr[minIndex];
                arr[minIndex] = temp1;

                index = minIndex;
                leftIndex = 2 * index +1;
                rightIndex = 2 * index + 2;
            }else{
                break;
            }
        }
        return temp;
    }

    public static void insertVritualHeap(int arr[], int i){
        int childIndex = i;
        int parentIndex = (childIndex-1)/2;

        while (childIndex>0) {
            if (arr[childIndex] < arr[parentIndex]) {

                int temp = arr[childIndex];
                arr[childIndex] = arr[parentIndex];
                arr[parentIndex] = temp;
                childIndex = parentIndex;
                parentIndex = (childIndex -1)/2;
                
            }else{
                return;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] ={1,4,5,8,9};
        for (int i = 0; i < arr.length; i++) {
            insertVritualHeap(arr,i);
        }
        for (int i = 0; i < arr.length; i++) {
           arr[arr.length - 1 -i] = removeMinVirtualHeap(arr, arr.length - i);
        }
    }
}
