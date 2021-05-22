import java.util.HashMap;
import java.util.Map;

public class SUmtoTarget {
    /*
     * My logic to find the index of elements. after adding which we will get
     * expected target value.
     */
    static int[] targetSum(int[] nums, int target) {
        int[] res = { 0, 0 };
        if (nums.length <= 1)
            return res;
        // looping and checking one by one.
        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {

        int[] arr = { 2, 1, 4, 7, 6, -2 };
        int[] res = targetSum(arr, 5);
        System.out.println("Index : " + res[0] + " : " + res[1]);
    }
}
