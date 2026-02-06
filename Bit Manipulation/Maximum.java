import java.util.Scanner;

public class Maximum {
    static int max(int a, int b) {
        int diff = a - b;
        int k = (diff >> 31) & 1;  // 1 if negative
        return a - k * diff;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Maximum: " + max(num1, num2));
        
        sc.close();
    }
}
