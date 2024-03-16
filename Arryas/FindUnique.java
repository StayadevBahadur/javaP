package Arryas;

public class FindUnique {
    
	public static int  findUniqueNumber(int[] arr) {
        int uniqueCount = 0; 
        int uniqueNumber = -1; // Default value if there is no unique number
        int n = arr.length;

        // Count the occurrences of each number in the array
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            // If a number occurs only once, increment uniqueCount and store the unique number
            if (count == 1) {
                uniqueCount++;
                uniqueNumber = arr[i];
            }
        }
		return uniqueNumber;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1 , 4 ,1 , 6 ,7 ,6,7};
		int a = findUniqueNumber(arr);
		System.out.print(a);

	}
    
}
