public class FindCountOfPrime {
    static int countPrimeNumber(int n) {
        if (n <= 2)
            return 0;
        if (n == 3)
            return 1;

        int count = 2;
        // Necessary but not suffiecient condition wrong logic.
        for (int i = 4; i < n; i++) {
            if (i % 6 == 1 || i % 6 == 5)
                count++;
        }

        return count;
    }

    // Better way to check count of prime < N;
    static int countPrimeNumberLeet(int n) {
        if (n <= 2)
            return 0;
        boolean[] isPrimeArray = new boolean[n];
        for (int i = 0; i < n; i++)
            isPrimeArray[i] = true;

        for (int j = 2; j * j < n; j++) {
            if (!isPrimeArray[j])
                continue;
            for (int k = j * j; k < n; k += j)
                isPrimeArray[k] = false;
        }

        int count = 0;
        for (boolean isprime : isPrimeArray)
            if (isprime)
                count++;
        return count;

    }

    public static void main(String[] args) {
        System.out.println("Test case 1 :: " + (countPrimeNumber(10000) == 3334));
        System.out.println("Test case 2 :: " + (countPrimeNumber(8) == 4));
        System.out.println("Test case 3 :: " + (countPrimeNumber(6) == 3));
    }
}
