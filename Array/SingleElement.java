import java.util.HashSet;
import java.util.Set;

public class SingleElement {
    /**
     * 
     * @param nums
     * @return My logic to find the single element from given array nums.
     */
    static int findSingle(int[] nums) {
        if (nums.length == 0)
            return 0;
        else if (nums.length == 1)
            return nums[0];

        int res = nums[0];
        Set<Integer> set = new HashSet<>();
        set.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            res += nums[i];
            set.add(nums[i]);
        }
        int temp = set.stream().reduce(0, (ans, val) -> ans + val);
        res = 2 * temp - res;

        return res;

    }

    /**
     * LeetCode logic to find single element. Using Exclusive OR ^ operator.
     */
    static int leetCodeLogic(int[] nums) {
        if (nums.length == 0)
            return 0;
        int res = 0;
        for (int val : nums)
            res ^= val;

        return res;
    }

    public static void main(String[] args) {
        System.out.println("Test case 1 :: " + (findSingle(new int[] { 4, 1, 2, 1, 2 }) == 4));
        System.out.println("Test case 2 :: " + (findSingle(new int[] { 1, 2, 2, 1, 5 }) == 5));
        System.out.println("Test case 3 :: " + (findSingle(new int[] {}) == 0));

        // Leetcode TestCode
        System.out.println("Test case 1 :: " + (leetCodeLogic(new int[] { 4, 1, 2, 1, 2 }) == 4));
        System.out.println("Test case 2 :: " + (leetCodeLogic(new int[] { 1, 2, 2, 1, 5 }) == 5));
        System.out.println("Test case 3 :: " + (leetCodeLogic(new int[] {}) == 0));

    }
}
