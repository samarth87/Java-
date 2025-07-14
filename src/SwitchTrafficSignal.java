import java.util.Scanner;

public class SwitchTrafficSignal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a traffic light color (Red, Green, Yellow): ");
        String color = scanner.nextLine();
        switch (color) {
            case "red":
                System.out.println("Stop");
                break;
            case "green":
                System.out.println("Go");
                break;
            case "yellow":
                System.out.println("Wait");
                break;
            default:
                System.out.println("Invalid input. Please enter Red, Green, or Yellow.");
        }
    }
}
