public class Swap {
    public static void main(String[] args) {
        int a = 1, b = 2;

        a ^= b;
        b ^= a;
        a ^= b;

        System.out.println("a=" + a + ", b=" + b); // a=2, b=1
    }
}

