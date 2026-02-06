import java.util.Scanner;

public class PowerofTwo {
    static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println(n + " is " + (isPowerOfTwo(n) ? "" : "not ") + "a power of two.");

        sc.close();
    }
}
