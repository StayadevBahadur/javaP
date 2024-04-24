package Hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class Remove {
    public static ArrayList<Integer> removeDuplicates(int a[]){
        ArrayList<Integer> output = new ArrayList<>();
        HashMap<Integer, Boolean> map = new HashMap<>();

        for( int i = 0 ; i<a.length ; i++){
            if (map.containsKey(a[i])) {
                continue;
            }
            output.add(a[i]);
            map.put(a[i],true);
        }
        return output;
    }
    public static void main(String[] args) {
        int a[] = {1,2,5,3,7,8,9,4,3,4,1,5,6,9};
        ArrayList<Integer> removed = removeDuplicates(a);
        for (Integer integer : removed) {
            System.out.print(integer+" ");
        }
    }
}
