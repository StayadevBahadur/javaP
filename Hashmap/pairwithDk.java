package Hashmap;
import java.util.*;

public class pairwithDk {
    public static int countPairsWithDifferenceK(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k < 0) {
            return 0;
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int count = 0;
        if (k == 0) {
            for (int num : frequencyMap.keySet()) {
                int frequency = frequencyMap.get(num);
                if (frequency > 1) {
                    count += (frequency * (frequency - 1)) / 2; // Combination formula to count pairs
                }
            }
        } else {
            for (int num : frequencyMap.keySet()) {
                if (frequencyMap.containsKey(num + k)) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {4, 4, 4, 4};
        int k = 0;
        int pairsCount = countPairsWithDifferenceK(arr, k);
        System.out.println("Pairs count with difference " + k + ": " + pairsCount);
    }
}
