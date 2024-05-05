package Arrays;

public class MaxConsecutiveOnes {

    public static void main(String[] args) {

        int arr[] = {1, 1, 0, 1, 1, 1};

        int finalAnswer = 0;
        int n = arr.length;

        for (int l = 0; l < n; ++l) {
            int no_of_zeroes = 0;
            for (int r = l; r < n; ++r) {
                if (arr[r] == 0) {
                    no_of_zeroes++;
                }

                if (no_of_zeroes == 0) {
                    finalAnswer = Math.max(finalAnswer, r - l + 1);
                }
            }
        }

        System.out.println(finalAnswer);
    }
}


/*
    https://leetcode.com/problems/max-consecutive-ones/

    Given a binary array nums, return the maximum number of consecutive 1's in the array.
    Example 1:
    Input: num = [1,1,0,1,1,1]
    Output: 3
    Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.

 */