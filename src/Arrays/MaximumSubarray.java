package Arrays;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {

        // Kadane's Algo

        int currSum = 0, finalAns = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++) {

            currSum += nums[i];

            finalAns = Math.max(currSum, finalAns);

            if(currSum < 0) {
                currSum = 0;
            }
        }

        return finalAns;

    }
}


/*

    https://leetcode.com/problems/maximum-subarray/
    Given an integer array nums, find the subarray with the largest sum, and return its sum.

    Example 1:
    Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    Output: 6
    Explanation: The subarray [4,-1,2,1] has the largest sum 6.

 */