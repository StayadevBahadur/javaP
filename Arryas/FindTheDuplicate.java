package Arryas;

public class FindTheDuplicate {
    public static int  findDuplicate(int[] arr) {
        int uniqueCount = 0;
        int Dupli = -1; // Default value if there is no unique number
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
            if (count > 1) {
                uniqueCount++;
                Dupli = arr[i];
            }
        }
		return Dupli;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,4 ,5,6,8,8,7};
		int a = findDuplicate(arr);
		System.out.print(a);
	}
    
}
