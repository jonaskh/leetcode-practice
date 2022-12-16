package problems;

import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = {0,0};

        int i = 0;
        int k = 0;

        //while loop that runs through first index and then checks all other index, if no match
        //do same with second index and so on.
        while (i < nums.length - 1) {
            while (k < nums.length - 1) {
                if (nums[i] + nums[nums.length - 1 - k] == target) {
                    result[0] = i;
                    result[1] = nums.length - k - 1;

                    return result;
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
