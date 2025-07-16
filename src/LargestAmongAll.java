import java.util.*;

// 2 Numbers ///
// public class LargestAmongAll {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter first number: ");
//        int a = sc.nextInt();
//        System.out.print("Enter second number: ");
//        int b = sc.nextInt();
//        int largest = Math.max(a, b);
//        System.out.println("The largest number is: " + largest);
//    }
//}


// 3 Numbers ///
// public class LargestAmongAll {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter first number (a): ");
//        int a = scanner.nextInt();
//        System.out.print("Enter second number (b): ");
//        int b = scanner.nextInt();
//        System.out.print("Enter third number (c): ");
//        int c = scanner.nextInt();
//
//        int largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
//
//        System.out.println("The largest number is: " + largest);
//    }
//}



/// 4 Number ///
public class LargestAmongAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        System.out.print("Enter fourth number: ");
        int d = sc.nextInt();
        sc.close();

        int largest = (a > b) ? ((a > c) ? (Math.max(a, d)) : (Math.max(c, d))) :
                ((b > c) ? (Math.max(b, d)) : (Math.max(c, d)));

        System.out.println("The largest number is: " + largest);
    }

}