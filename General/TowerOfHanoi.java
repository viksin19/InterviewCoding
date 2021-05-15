public class TowerOfHanoi {
    static void toh(int n, char a, char b, char c) {
        if (n == 1) {
            System.out.println("Disk 1 moved from " + a + " to " + c);
            return;
        }
        toh(n - 1, a, c, b);
        System.out.println("Disk " + n + " moved from " + a + " to " + c);
        toh(n - 1, b, a, c);
    }

    public static void main(String[] args) {
        toh(3, 'A', 'B', 'C');
    }
}
