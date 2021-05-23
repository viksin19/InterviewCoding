import java.util.Arrays;
import java.util.stream.Collector;

public class DuplicateCheck {
    static boolean checkDuplicated(int[] nums) {

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++)
            if (nums[i] == nums[i + 1])
                return true;

        return false;
    }

    public static void main(String[] args) {

        System.out.println("Test case 1 :: " + (checkDuplicated(new int[] { 1, 2, 3, 4, 5 }) == false));
        System.out.println("Test case 1 :: " + (checkDuplicated(new int[] { 1, 2, 4, 4, 5 }) == true));
        System.out.println("Test case 1 :: " + (checkDuplicated(new int[] {}) == false));
    }
}
