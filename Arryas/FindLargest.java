package Arryas;

import java.util.Scanner;

public class FindLargest {
    public static int Findlargest(int input[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < input.length; i++) {
            if (input[i] > max) {
                max = input[i];
            }

        }
        return max;
    }

    public static int[] takeInput() {
        System.out.print("enter the size of array : ");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int input[] = new int[size];

        for (int i = 0; i < size; i++) {
            input[i] = s.nextInt();
        }
        return input;

    }

    public static void Print(int input[]) {
        int size = input.length;
        for (int i = 0; i < size; i++) {
            System.out.print(input[i] + " ");
        }
    }

    public static void main(String[] args) {
       
        int arr[] = takeInput();
        Print(arr);
        System.out.println();
        int Largest = Findlargest(arr);
        System.out.println(Largest);
        // TODO Auto-generated method stub

    }

}
