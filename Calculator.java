import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("--- Welcome to the Calculator ---");

        Scanner sc = new Scanner(System.in);
        int num1, num2, choice;

        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Addition: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Subtraction: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Multiplication: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Division: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case 5:
                if (num2 != 0) {
                    System.out.println("Modulus: " + (num1 % num2));
                } else {
                    System.out.println("Error: Modulus by zero is not allowed.");
                }
            default:
                System.out.println("Invalid choice.");
                break;
        }

        System.out.println("--- Thank you for using the Calculator ---");
        sc.close();
    }
}
