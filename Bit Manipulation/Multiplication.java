import java.util.Scanner;

public class Multiplication {
    static int multiply(int a, int b) {
        int result = 0;
        boolean negative = (a < 0) ^ (b < 0);

        a = Math.abs(a);
        b = Math.abs(b);

        while (b > 0) {
            if ((b & 1) == 1) {
                result = add(result, a);
            }
            a <<= 1;
            b >>= 1;
        }
        return negative ? -result : result;
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

        System.out.println("Product: " + multiply(num1, num2));
        sc.close();
    }
}

