package problems;

import java.util.Arrays;

public class Palindrome {

    public boolean isPalindrome(int x) {

        char[] array = Integer.toString(x).toCharArray(); //lambda converts the int to a char array

        //stop recursion when only one char left.
        if (array.length < 2) {
            return true;
        }

        if (array.length == 2) {
            return array[0] == array[1];
        }

        //recursion that cuts first and last element of array and runs method again
        if (array[0] == array[array.length - 1]) {
            //converts back to int, minus the first and last element
            String s = new String(array);
            isPalindrome(Integer.parseInt(s.substring(1, array.length - 1)));
        } else {
            return false;
        }
        return true;
    }
}
