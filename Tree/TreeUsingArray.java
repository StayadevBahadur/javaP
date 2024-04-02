package Tree;

import java.util.ArrayList;

public class TreeUsingArray <T>{
    public T data;
    public ArrayList<TreeUsingArray<T>> children;

    public TreeUsingArray(T data){
        this.data = data;
        children = new ArrayList<>();
    }
}
