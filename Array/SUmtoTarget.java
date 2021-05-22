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

    /*
     * LeetCode submission for better time complexity. HashMap used to check if
     * remender is present in map. if present then we will return the result. if not
     * then we will add that element in Hashmap.
     */
    static int[] targert2Sum(int[] nums, int target) {

        if (nums.length <= 1)
            return new int[] { 0, 0 };

        Map<Integer, Integer> listMap = new HashMap<Integer, Integer>();
        for (int i = 0, j = nums.length - 1; i <= nums.length / 2; i++, j--) {

            int remender = target - nums[i];
            if (listMap.containsKey(remender))
                return (i > listMap.get(remender)) ? new int[] { listMap.get(remender), i }
                        : new int[] { i, listMap.get(remender) };

            listMap.put(nums[i], i);

            remender = target - nums[j];
            if (listMap.containsKey(remender))
                return (j > listMap.get(remender)) ? new int[] { listMap.get(remender), j }
                        : new int[] { j, listMap.get(remender) };

            listMap.put(nums[j], j);

        }
        return new int[] { 0, 0 };
    }

    public static void main(String[] args) {

        int[] arr = { 2, 1, 4, 7, 6, -2 };
        int[] res = targetSum(arr, 5);
        System.out.println("Index : " + res[0] + " : " + res[1]);
        int[] res2 = targert2Sum(arr, 5);
        System.out.println("Index : " + res2[0] + " : " + res2[1]);
    }
}
