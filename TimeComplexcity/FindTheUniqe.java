package TimeComplexcity;
// import java.util.HashMap;
// import java.util.Map;

public class FindTheUniqe {
    // public static int findUnique(int[] arr) {
    //     // Create a HashMap to store the frequency of each number
    //     Map<Integer, Integer> frequencyMap = new HashMap<>();
        
    //     // Count the frequency of each number in the array
    //     for (int num : arr) {
    //         frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
    //     }
        
    //     // Find the number with a frequency of 1 (unique number)
    //     for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
    //         if (entry.getValue() == 1) {
    //             return entry.getKey();
    //         }
    //     }
        
    //     // If no unique number found, return -1 or throw an exception as per requirement
    //     return -1; // Alternatively, you can throw an exception here
    // }

    // public static void main(String[] args) {
    //     int[] arr = {1, 2, 3, 4, 2, 3, 1, 5, 4};
    //     System.out.println(findUnique(arr)); // Output: 5
    // }

    public static int findUnique(int[] arr) {
        int unique = 0;

        // XOR all elements in the array
        for (int num : arr) {
            unique ^= num;
        }

        return unique;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 3, 1, 5, 4};
        System.out.println(findUnique(arr)); // Output: 5
    }
}
