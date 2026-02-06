import java.util.Scanner;

public class Subtraction {
    static int subtract(int a, int b) {
        return add(a, add(~b, 1));
    }

    static int add(int a, int b) {
        while (b != 0) {
            int carry = (a & b) << 1;
            a ^= b;
            b = carry;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Difference: " + subtract(num1, num2));
        sc.close();
    }
}
