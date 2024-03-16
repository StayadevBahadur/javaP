package Recursion;

import java.util.Scanner;

public class PrintNumbers {

	public static void print(int n){
        if(n>0){
		    print(n - 1);
            // Print the current number
            System.out.print(n + " ");
        }
    }
    public static void main(String[] args) {
        	Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        s.close();
		PrintNumbers.print(n);
    }
}
