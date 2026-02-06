import java.util.Scanner;

public class EvenOdd {
    static void check(int n) {
        System.out.println((n & 1) == 0 ? "Even" : "Odd");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        check(n);

        sc.close();
    }
}
