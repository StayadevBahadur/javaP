package Arryas;

import java.util.Scanner;
public class ArrangeTheArrayInOddNeven {
	public static void populate(int arr[],int x) {
   
        int oddIndex = 0;
        int evenIndex = x - 1;
        for (int i = 1; i <= x; i++) {
            if (i % 2 == 1) {
            	
                arr[oddIndex] = i;
                oddIndex++;
            } else {
                arr[evenIndex] = i;
                evenIndex--;
            }
        }
	}

	    public static void main(String[] args) {
	    	   Scanner sr = new Scanner(System.in);
	           int t = sr.nextInt();
	           while(t > 0) 
	           {
	               int n = sr.nextInt();
	               int arr[]= new int[n];
	               
	               populate(arr, n);
	               for(int i=0;i<n;i++)
	               {
	                   System.out.print(arr[i]+" ");
	               }
	               System.out.println();
	               t -= 1;
	           }
			   sr.close();
	        // Array is now populated according to the pattern
	        // You can perform further operations with the array if needed
	    }
	}

