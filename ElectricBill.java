import java.util.Scanner;

public class ElectricBill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter units consumed: ");
		double units = 0;
		
        units = sc.nextDouble();
		
		if (units < 0) {
			System.out.println("Units cannot be negative.");
			sc.close();
			return;
		}

		double energyCharge = 0;

		if (units <= 100) {
			energyCharge = units * 2;
		} else if (units <= 200) {
			energyCharge = 100 * 2 + (units - 100) * 3;
		} else {
			energyCharge = 100 * 2 + 100 * 3 + (units - 200) * 5;
		}

		double meterCharge = 150;
		double total = energyCharge + meterCharge;
        
		System.out.println("Total Amount Payable: " + total);

		sc.close();
	}
}
