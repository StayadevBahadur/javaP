package TimeComplexcity;

import java.util.HashSet;

public class FindTheDupliInArray {
    // public static int findDuplicate(int[] arr) {
    //     int n = arr.length;
    //     int sum = 0;
        
    //     // Calculate sum of all elements
    //     for (int num : arr) {
    //         sum += num;
    //     }
        
    //     // Calculate expected sum without duplicate
    //     int expectedSum = (n - 1) * (n - 2) / 2;
        
    //     // The difference between actual sum and expected sum will be the duplicate number
    //     return sum - expectedSum;
    // }

    // public static void main(String[] args) {
    //     int[] arr = {0, 1, 3, 2, 2};
    //     System.out.println(findDuplicate(arr)); // Output: 2
    // }

    // Another Way of dooning it 
      public static int findDuplicate(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        
        for (int num : arr) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }
        
        return -1; // No duplicate found (this line can be adjusted as per requirement)
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 3, 2, 2};
        System.out.println(findDuplicate(arr)); // Output: 2
    }
    
}
