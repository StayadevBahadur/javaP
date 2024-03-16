package Recursion;

import java.util.Scanner;

public class PowerOf {
    public static int power(int x, int n){
        if (n == 0) {
            return 1;
        }
        // Recursively calculate x^(n/2)
        int temp = power(x, n / 2);
        // If n is even
        if (n % 2 == 0) {
            return temp * temp;
        }
        // If n is odd
        else {
            return x * temp * temp;
        }
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

		int x = s.nextInt();
		int n = s.nextInt();
		s.close();
		System.out.println(PowerOf.power(x, n));
	
    }
    
}
