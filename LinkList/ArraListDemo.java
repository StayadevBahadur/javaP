package LinkList;

import java.util.ArrayList;

public class ArraListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> List1 = new ArrayList<>();
        System.out.println(List1.size());
        List1.add(13);
        List1.add(34);
        List1.add(90);
        List1.add(89);
        System.out.println(List1.size());
        System.out.println(List1.get(0));// for accesing the element at the given index
    }
}
