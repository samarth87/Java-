import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int input = sc.nextInt();  // Read integer input
        System.out.println("You entered: " + input);
    }
}