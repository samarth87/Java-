import java.util.*;
//INPUT FROM USER//

public class UserInputCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        int sum = x + y;
        int difference = x - y;
        int product = x * y;
        int division = x / y;

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);
        System.out.println("Division: " + division);
    }
}