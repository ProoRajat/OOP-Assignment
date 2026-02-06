import java.util.Scanner;

public class CountSetBits {
    static int countBits(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Number of set bits: " + countBits(n));
        
        sc.close();
    }
}
