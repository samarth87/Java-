package Arrays;
import java.util.*;

/// One D Arrays ///
//public class Arrays {
//    public static void main(String[] args) {
//        int[] arr= {1, 2, 3, 4, 5};
//        System.out.print("Elements of the array:");
//        for (int num : arr) {
//            System.out.print(num);
//        }
//    }
//}

/// 2D Arrays ///
public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();
        int[][] array = new int[rows][cols];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("The 2D array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}