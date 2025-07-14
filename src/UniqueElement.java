import java.util.*;

public class UniqueElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers (all appear twice except one):");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int unique = 0;
        for (int num : arr) {
            unique ^= num;
        }
        System.out.println("The unique element is: " + unique);
    }
}
    