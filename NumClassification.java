import java.util.Scanner;

class NumMath {
    int num;

    NumMath(int num) {
        this.num = num;
    }

    void checkPositiveNegativeZero() {
        if (num > 0) {
            System.out.println("The number is positive.");
        } else if (num < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }

    void checkEvenOdd() {
        if (num % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }

    void checkDivisiblity() {
        if (num % 5 == 0 && num % 7 == 0) {
            System.out.println("The number is divisible by both 5 and 7.");
        } else if (num % 5 == 0) {
            System.out.println("The number is divisible by 5.");
        } else if (num % 7 == 0) {
            System.out.println("The number is divisible by 7.");
        } else {
            System.out.println("The number is not divisible by either 5 or 7.");
        }
    }
}

public class NumClassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Enter a number: ");
        num = sc.nextInt();
        NumMath numMath = new NumMath(num);
        numMath.checkPositiveNegativeZero();
        numMath.checkEvenOdd();
        numMath.checkDivisiblity();

        sc.close();
    }
}
