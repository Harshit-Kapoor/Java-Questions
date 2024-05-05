package Arrays;

public class MaxConsecutiveOnesWithFlippingK {

    public static int longestOnes(int[] nums, int k) {

        int numOfZeroes = 0, ans = 0, l = 0;

        for(int r=0; r < nums.length; r++) {

            if (nums[r] == 0) {
                numOfZeroes++;
            }

            // to make the window valid again remove elements from left and if removed element is 0 reduce the count

            while (k < numOfZeroes) {
                if (nums[l] == 0) {
                    numOfZeroes--;
                }
                l++;
            }

            ans = Math.max(ans, r - l + 1);
        }

        return ans;

    }

    public static void main(String[] args) {

        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;

        System.out.println(longestOnes(nums, k));;
    }

}





/*

    1004. Max Consecutive Ones III
    https://leetcode.com/problems/max-consecutive-ones-iii/
    Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

    Example 1:

    Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
    Output: 6
    Explanation: [1,1,1,0,0,1,1,1,1,1,1]

 */
