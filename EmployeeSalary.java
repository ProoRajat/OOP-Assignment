import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String []args) {
        System.out.println("--- Welcome to the Eployee Salary Calculator ---");

        Scanner sc = new Scanner(System.in);

        int basicSalary;
        float netSalary = 0;
        
        System.out.println("Enter the basic salary: ");
        basicSalary = sc.nextInt();
        
        if (basicSalary >= 30000) {
            netSalary = basicSalary + (0.20f * basicSalary) + (0.15f * basicSalary);
        } else {
            netSalary = basicSalary + (0.10f * basicSalary) + (0.08f * basicSalary);
        }

        // deduct PF
        netSalary -= (0.12f * basicSalary);

        System.out.println("Net Salary: " + netSalary);

        System.out.println("--- Thank you for using the Employee Salary Calculator ---");
        System.out.println("--- Hope your salary will increase before next time you will use our program again :) ---");

        sc.close();
    }
}