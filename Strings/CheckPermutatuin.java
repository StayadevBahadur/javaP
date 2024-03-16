package Strings;
import java.util.Arrays;
public class CheckPermutatuin {
   

	public static boolean isPermutation(String str1, String str2) {
	
        // Check if the lengths of both strings are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to character arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted character arrays
        return Arrays.equals(charArray1, charArray2);
    
	}
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "lleoh";
        
        if (isPermutation(str1, str2)) {
            System.out.println("The strings '" + str1 + "' and '" + str2 + "' are permutations of each other.");
        } else {
            System.out.println("The strings '" + str1 + "' and '" + str2 + "' are not permutations of each other.");
        }
    }

}
    

