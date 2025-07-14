import java.util.Scanner;

public class NumberSameOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int number = sc.nextInt();
        if (number < 100 || number > 999) {
            System.out.println("Please enter a valid 3-digit number.");
            return;
        }
        int digit1 = number / 100;
        int digit2 = (number / 10) % 10;
        int digit3 = number % 10;
        System.out.println("Digits: " + digit1 + ", " + digit2 + ", " + digit3);

        if (digit1 == digit2 && digit2 == digit3) {
            System.out.println("All digits are the same.");
        } else if (digit1 == digit2 || digit2 == digit3 || digit1 == digit3) {
            System.out.println("Two digits are the same.");
        } else {
            System.out.println("All digits are different.");
        }
    }
}
