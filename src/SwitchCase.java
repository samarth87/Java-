import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee level (1-4): ");
        int level = sc.nextInt();

        double basicSalary = 0;
        double hraPercentage = 0;
        double totalSalary = 0;

        switch (level) {
            case 1:
                basicSalary = 50000;
                hraPercentage = 30;
                break;
            case 2:
                basicSalary = 40000;
                hraPercentage = 25;
                break;
            case 3:
                basicSalary = 30000;
                hraPercentage = 20;
                break;
            case 4:
                basicSalary = 20000;
                hraPercentage = 15;
                break;
            default:
                System.out.println("Invalid level entered. Please enter a level between 1 and 4.");
                return;
        }
        double hraAmount = (hraPercentage / 100) * basicSalary;
        totalSalary = basicSalary + hraAmount;

        System.out.println("Basic Salary: ₹" + basicSalary);
        System.out.println("HRA (" + hraPercentage + "%): ₹" + hraAmount);
        System.out.println("Total Salary: ₹" + totalSalary);
    }
}
