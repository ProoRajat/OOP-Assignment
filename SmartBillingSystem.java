import java.util.Scanner;

class SmartBillingSystem {
    public static void main(String[] args) {
        System.out.println("Welcome to Smart Billing System (not smart btw)");
        System.out.println("---x---x---");

        Scanner sc = new Scanner(System.in);
        
        int amount = 0;
        float bill = 0, price;

        // Get user INPUT
        System.out.print("How many iteams you purchased: ");
        for (int i = sc.nextInt(); i > 0; i--) {
            System.out.print("\nIteam: " + i + "\nAmount: ");
            amount = sc.nextInt();
            System.out.print("Price: ");
            price = sc.nextFloat();
            bill += amount*price;
        }

        // Apply discount
        if (bill >= 5000) {
            bill -= bill*0.1;
            System.out.println("\n\nDiscount: 10%");
        } else if (bill >= 2000) {
            bill -= bill*0.05;
            System.out.println("\n\nDiscount: 5%");
        }

        // Apply GST
        bill += bill*0.18;
        System.out.println("GST: 18%");

        // display bill
        System.out.println("Final Bill: " + bill);
        System.out.println("---x---x---\nHope you had a great shoping experience");

        sc.close();
    }
}