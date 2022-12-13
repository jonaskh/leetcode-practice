package problems;

import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = {0,0};
        boolean found = false;

        if (nums.length < 2) {
            return null;
            }

        int i = 0;
        int k = 0;

        while (i < nums.length - 1 && !found) {
            while (k < nums.length - 1 && !found) {
                if (nums[i] + nums[nums.length - 1 - k] == target) {
                    result[0] = i;
                    result[1] = nums.length - k - 1;

                    found = true;
                } else {
                    k++;
                }
            }
            i++;
            k = 0;
        }
        return result;
    }
}
