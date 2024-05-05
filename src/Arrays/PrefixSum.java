package Arrays;
import java.util.*;

public class PrefixSum {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4};

        runningSum2(nums);
    }

    public static void runningSum(int[] nums) {

        int[] preSum = new int[nums.length];

        for(int i=0; i<nums.length; i++) {
            if(i == 0) {
                preSum[i] = nums[0];
            } else {
                preSum[i] = nums[i] + preSum[i-1];
            }
        }

        System.out.println(Arrays.toString(preSum));

    }

    public static void runningSum2(int[] nums) {

        int[] preSum = new int[nums.length];

        for(int i=0; i<nums.length; i++) {

            preSum[i] = i == 0 ?  nums[0] : nums[i] + preSum[i-1];

        }

        System.out.println(Arrays.toString(preSum));

    }


    public static void runningSum1(int[] nums) {

        int[] preSum = new int[nums.length];
        int sum = 0;

        for(int i=0; i<nums.length; i++) {
            sum = sum + nums[i];
            preSum[i] = sum;
        }

        System.out.println(Arrays.toString(preSum));

    }


}




/*

    https://leetcode.com/problems/running-sum-of-1d-array/

    Input: nums = [1,2,3,4]
    Output: [1,3,6,10]
    Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

 */