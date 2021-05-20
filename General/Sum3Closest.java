import java.util.Arrays;

import javax.lang.model.util.ElementScanner6;

public class Sum3Closest {

    static int closestSum(int[] A, int N, int X) {
        int closest = Integer.MAX_VALUE;
        Arrays.sort(A);
        for (int i = 0; i < N; i++) {
            int left = i + 1, right = N - 1;
            while (left < right) {
                int currentSum = A[i] + A[left] + A[right];
                if (Math.abs(X - currentSum) < Math.abs(X - closest))
                    closest = currentSum;

                if (X < currentSum)
                    right--;
                else if (X > currentSum)
                    left++;
                else
                    return X;
            }
        }
        return closest;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, -5, -6 };
        System.out.println("Closest to X=5 is :: " + closestSum(arr, 5, 5));
        System.out.println("Closest to X=4 is :: " + closestSum(arr, 5, 4));
        System.out.println("Closest to X=1 is :: " + closestSum(arr, 5, 1));

    }
}
