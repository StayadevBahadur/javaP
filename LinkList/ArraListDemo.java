package LinkList;

import java.util.ArrayList;

public class ArraListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> List1 = new ArrayList<>();
   
        List1.add(13);
        List1.add(34);// you can add value with index also 
        List1.add(90);
        List1.add(89);
        // System.out.println(List1.size());
        // System.out.println(List1.get(0));// for accesing the element at the given index
        for (int i = 0; i < List1.size(); i++) {
            System.out.print(List1.get(i) + " ");
        }
        System.out.println();
        //For removing the element at the given index   
        // List1.remove(index);

        // For changing the value of the specific index 
        List1.set(1, 121);
        for (Integer integer : List1) {
            System.out.print(integer + " ");
        }
        ArrayList<String> list = new ArrayList<String>() ;
            list.add( "apple" );
            list.add( "banana" );
            list.add( "carrot" );
            list.add( 0, "mango" );
            System.out.println(list.get(0));

    }
 

   
}
