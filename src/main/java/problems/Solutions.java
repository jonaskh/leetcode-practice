package problems;

import java.util.Arrays;

public class Solutions {

    public static void main(String[] args) {
        RomanToInt romanToInt = new RomanToInt();
        TwoSum twoSums = new TwoSum();

        int[] first = {2,7,11,15};
        int[] second = {3,2,4};
        int[] third = {3,3};

        int[] firstResult = twoSums.twoSum(first, 9);
        int[] secondResult = twoSums.twoSum(second,6);
        int[] thirdResult = twoSums.twoSum(third,6);

        System.out.println(Arrays.toString(firstResult));
        System.out.println(Arrays.toString(secondResult));
        System.out.println(Arrays.toString(thirdResult));

//        System.out.println(romanToInt.romanToInt("XV"));
    }
}
