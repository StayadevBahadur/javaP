package Strings;

import java.util.Scanner;

public class RemoveAllChar {
    public static String removeCharacter(String str, char ch) {
        // Replace all occurrences of the specified character with an empty string
        return str.replaceAll(String.valueOf(ch), "");
    }
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Character to remove
        System.out.print("Enter the character to remove: ");
        char ch = scanner.next().charAt(0);

        // Call removeCharacter method and print the result
        String result = removeCharacter(input, ch);
        System.out.println("String after removing '" + ch + "': " + result);

        scanner.close();
    }
}
