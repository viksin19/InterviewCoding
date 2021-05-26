import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InterSectionOfTwoArrays {
    static int[] interSection(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0)
            return new int[] {};

        List<Integer> list = new ArrayList<>();
        if (nums1.length <= nums2.length) {
            int i = 0, j = 0;
            int[] temp = new int[nums2.length];
            Arrays.fill(temp, 0);
            while (i < nums1.length && j < nums2.length) {
                if (nums1[i] == nums2[j] && temp[j] == 0) {
                    list.add(nums1[i]);
                    i++;
                    temp[j] = 1;
                    j = 0;
                } else {
                    if (i < nums1.length && j == nums2.length - 1) {
                        i++;
                        j = 0;
                    } else
                        j++;
                }
            }
        } else {
            int i = 0, j = 0;
            int[] temp = new int[nums1.length];
            Arrays.fill(temp, 0);
            while (i < nums2.length && j < nums1.length)
                if (nums1[j] == nums2[i] && temp[j] == 0) {
                    list.add(nums1[j]);
                    i++;
                    temp[j] = 1;
                    j = 0;

                } else {
                    if (i < nums2.length && j == nums1.length - 1) {
                        i++;
                        j = 0;
                    } else
                        j++;
                }
        }
        int[] res = new int[list.size()];
        for (int k = 0; k < list.size(); k++)
            res[k] = list.get(k);
        return res;
    }

    // Logic to find intersection of two array using HashMap.
    static int[] interSectionLeetCode(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0)
            return new int[] {};
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        // Adding it to the map.
        for (int val : nums1)
            map.put(val, map.getOrDefault(val, 0) + 1);

        for (int val1 : nums2) {
            if (map.containsKey(val1) && map.get(val1) != 0) {
                map.put(val1, map.get(val1) - 1);
                list.add(val1);
            }
        }
        int res[] = new int[list.size()];
        for (int k = 0; k < list.size(); k++)
            res[k] = list.get(k);
        return res;
    }

    public static void main(String[] args) {

        int[] result = interSectionLeetCode(new int[] { 1, 2 }, new int[] { 2, 3, 1 });
        for (int val : result)
            System.out.print(val + ", ");
    }
}
