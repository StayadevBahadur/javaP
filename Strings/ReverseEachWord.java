package Strings;

public class ReverseEachWord {
    public static String reverseWords(String str) {
        // Split the input string into words
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        // Iterate through each word
        for (String word : words) {
            // Reverse each word and append to the result
            result.append(reverseString(word)).append(" ");
        }

        // Remove trailing space and return the result
        return result.toString().trim();
    }

    // Method to reverse a string
    private static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
    public static void main(String[] args) {
        String input = "Hello World";
        String reversedWords = reverseWords(input);
        System.out.println("Original String: " + input);
        System.out.println("String with reversed words: " + reversedWords);
    }
    
}
