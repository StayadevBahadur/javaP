package Hashmap;
import java.util.HashMap;
import java.util.Set;

public class MapUse {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("abc", 3);
        map.put("acd", 4);

        System.out.println(map.size());

        if (map.containsKey("abc")) {
            System.out.println("abc");
        }

        if (map.containsKey("aaa")) {
            System.out.println("aaa");
        }

        int b = map.get("abc");
        System.out.println(b);

        int v = 0;
        if (map.containsKey("acd")) {
            v = map.get("acd");
        }
       
        System.out.println(v);


    //    int s =  map.remove("acd");
    //    System.out.println(s);
     
       int d = 0;
       if (map.containsKey("acd")) {
           v = map.get("acd");
       }
       System.out.println(d);


       Set<String> keys = map.keySet();
       for(String key : keys){
        System.out.println(map.get(key));
       }
    }

}
