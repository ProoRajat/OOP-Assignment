import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        System.out.println("--- Welcome to the ATM ---");

        Scanner sc = new Scanner(System.in);
        int accountBalance, withdrawalAmount;

        System.out.println("Enter account balance: ");
        accountBalance = sc.nextInt();

        System.out.println("Enter withdrawal amount: ");
        withdrawalAmount = sc.nextInt();

        if (withdrawalAmount%100 == 0) {
            if (accountBalance - withdrawalAmount >= 1000) {
                System.err.println("Operation Successful! Please collect your cash.");
                System.out.println("Remaining Balance: " + (accountBalance - withdrawalAmount));
            } else {
                System.err.println("Insufficient balance.");
            }
        } else {
            System.err.println("Withdrawal amount must be in multiples of 100.");
        }

        System.out.println("--- Thank you for using the ATM ---");
        sc.close();
    }
}
