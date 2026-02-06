import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Which number do you want to investigate :) : ");
        int num = sc.nextInt();

        int reverse = 0;
        int sum = 0;
        int digitCount = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            sum += digit;
            digitCount++;
            num /= 10;
        }

        System.out.println("Reversed number: " + reverse);
        System.out.println("Sum of digits: " + sum);
        System.out.println("Number of digits: " + digitCount);

        sc.close();
    }
}
