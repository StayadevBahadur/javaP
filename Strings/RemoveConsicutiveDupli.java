package Strings;

public class RemoveConsicutiveDupli {
    public static String removeDuplicates(String str) {
    StringBuilder result = new StringBuilder();
    StringBuilder duplicates = new StringBuilder();

    for (int i = 0; i < str.length(); i++) {
        char currentChar = str.charAt(i);
        if (i == 0 || currentChar != str.charAt(i - 1)) {
            result.append(currentChar);
        } else {
            if (duplicates.indexOf(String.valueOf(currentChar)) == -1) {
                duplicates.append(currentChar);
            }
        }
    }

    return result.toString();
}

public static void main(String[] args) {
    String input = "aabbcdd";
    String duplicates = removeDuplicates(input);
    System.out.println("Original String: " + input);
    System.out.println("Duplicates: " + duplicates);

}
}

