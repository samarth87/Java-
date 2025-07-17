import java.util.Scanner;

//public class PrimeNumber {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num = sc.nextInt();
//        boolean isPrime = true;
//        if (num <= 1) {
//            isPrime = false;
//        } else {
//            for (int i = 2; i <= Math.sqrt(num); i++) {
//                if (num % i == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//        }
//        if (isPrime)
//            System.out.println(num + " is a prime number.");
//        else
//            System.out.println(num + " is not a prime number.");
//    }
//}



/// print all prime no.s from 1 to 100 using nested for loops ///
public class PrimeNumber {
    public static void main(String[] args) {
    System.out.println("Prime numbers from 1 to 100:");
    for (int num = 2; num <= 100; num++) {
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.print(num + " ");
        }
    }
}
}