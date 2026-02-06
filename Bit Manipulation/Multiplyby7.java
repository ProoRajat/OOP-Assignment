import java.util.Scanner;

public class Multiplyby7 {
    
}
class MultiplyBySeven {
    static int multiply(int x) {
        return (x << 3) - x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Result: " + multiply(num));

        sc.close();
    }
}
