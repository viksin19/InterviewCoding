public class GCD {
    static int gcd(int a, int b) {
        if (b == 0)
            return a;

        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println("GCD of 5, 10 is :: " + gcd(5, 10));
        System.out.println("GCD of 6, 8 is :: " + gcd(6, 8));
        System.out.println("GCD of 228, 788 is :: " + gcd(228, 788));
    }
}
