import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        String username = "admin";
        String password = "password123";

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String inputUsername = sc.nextLine();

        System.out.print("Enter password: ");
        String inputPassword = sc.nextLine();

        int i;
        for (i = 0; i < 2; i++) {
            if (inputUsername.equalsIgnoreCase(username) && inputPassword.equals(password)) {
                System.out.println("Login successful! Welcome, " + username + "!");
                sc.close();
                return;
            } else {
                System.out.println("Login failed! Invalid username or password.");
            }

            System.out.print("\nEnter username: ");
            inputUsername = sc.nextLine();

            System.out.print("Enter password: ");
            inputPassword = sc.nextLine();
        }

        if (inputUsername.equalsIgnoreCase(username) && inputPassword.equals(password)) {
            System.out.println("Login successful! Welcome, " + username + "!");
        } else {
            System.out.println("Too many failed attempts! ACCOUNT LOCKED!");
            System.out.println("Please contact the administrator to unlock your account.");
        }

        sc.close();
    }
}
