import java.util.Scanner;

public class Quotient {
    static int divide(int dividend, int divisor) {
        int quotient = 0;
        int temp = 0;

        for (int i = 31; i >= 0; i--) {
            if (temp + (divisor << i) <= dividend) {
                temp += divisor << i;
                quotient |= 1 << i;
            }
        }
        return quotient;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter dividend: ");
        int dividend = sc.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();

        System.out.println("Quotient: " + divide(dividend, divisor));
        sc.close();
    }
}

