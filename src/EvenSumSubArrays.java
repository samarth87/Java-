import java.util.*;

public class EvenSumSubArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int count = countEvenSumSubarraysStartingWithOdd(arr);
        System.out.println("Number of subarrays: " + count);
    }
    public static int countEvenSumSubarraysStartingWithOdd(int[] arr) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                int sum = 0;
                for (int j = i; j < n; j++) {
                    sum += arr[j];
                    if (sum % 2 == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}

