import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		System.out.print("Enter second number: ");
		int b = sc.nextInt();

		int start = Math.min(a, b);
		int end = Math.max(a, b);

		if (end < 2) {
			System.out.println("No prime numbers in the given range.");
			sc.close();
			return;
		}

		boolean found = false;
		for (int n = Math.max(2, start); n <= end; n++) {
			if (isPrime(n)) {
				System.out.println(n);
				found = true;
			}
		}

		if (!found) {
			System.out.println("No prime numbers in the given range.");
		}

		sc.close();
	}

	private static boolean isPrime(int n) {
		if (n <= 1) return false;
		if (n == 2) return true;
		if (n % 2 == 0) return false;
		int r = (int) Math.sqrt(n);
		for (int i = 3; i <= r; i += 2) {
			if (n % i == 0) return false;
		}
		return true;
	}
}
