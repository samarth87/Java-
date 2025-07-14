import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        boolean condition1 = num1 > 0;
        boolean condition2 = num2 > 0;

        System.out.println("Both numbers are positive (condition1 && condition2): " + (condition1 && condition2));
        System.out.println("At least one number is positive (condition1 || condition2): " + (condition1 || condition2));
        System.out.println("First number is NOT positive (!condition1): " + (!condition1));
    }
}
