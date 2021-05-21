public class RotateRight {
    /*
     * Method to rotate array clockwise i.e Right rotate using Juggling method.
     */
    static void rotate(int[] nums, int k) {
        int len = nums.length;
        k %= len; // Removing overlapping rotation if any.
        int gcd = gCD(k, len);
        for (int i = gcd - 1; i >= 0; i--) {
            int temp = nums[i];
            int j = i;
            int index = 0;
            while (true) {
                index = j - k;
                if (index < 0)
                    index += len;
                if (index == i)
                    break;
                nums[j] = nums[index];
                j = index;
            }
            nums[j] = temp;
        }
    }

    /*
     * Method to find the GCD value of two numbers.
     */
    static int gCD(int a, int b) {
        if (b == 0)
            return a;

        return gCD(b, a % b);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        rotate(arr, 3);
        System.out.println("Test case 1 passed :: " + (arr[0] == 4 && arr[5] == 3));
        int arr2[] = { 10, 20, 30, 40, 50, 60 };
        rotate(arr2, 4);
        System.out.println("Test case 2 passed :: " + (arr2[0] == 30 && arr2[5] == 20));
    }
}
