package Recursion;

public class factorial {
    public static int fac(int n){
        if(n==0){
            return 1;
        }
        int smallAns = fac(n-1);
        return n*smallAns;
        
        
    }
    public static void main(String[] args) {
        int n = 4;
        int ans = fac(n);
        System.out.println(ans);
    }
}
