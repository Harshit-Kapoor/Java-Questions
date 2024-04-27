package Searching;

import java.util.*;

public class FindSingleElementInArray {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println(singleNonDuplicate(arr));
    }

    public static int singleNonDuplicate(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums[0] != nums[1]) {                                   // if 0 and 1st index in not equal, return 0 index , eg 3 4 4 6 6 8 8
            return nums[0];
        }
        if (nums[nums.length - 1] != nums[nums.length - 2]) {        // if last 2 index are not equal return last   , eg  2 2 6 6 8 8 9
            return nums[nums.length - 1];
        }
        int left = 2;
        int right = nums.length - 3;

        while (left < right) {
            int middle = (left + right) / 2;

            if (nums[middle - 1] != nums[middle] && nums[middle] != nums[middle + 1]) {           // mid is not equal to left element and right element
                return nums[middle];
            }

            if (nums[middle] == nums[middle - 1]) {                 // make sure mid is always on first occurance
                middle--;
            }
            if (middle % 2 == 0) {
                left = middle + 2;
            } else {
                right = middle - 1;
            }
        }

        return nums[left];

    }

}

/*
        https://leetcode.com/problems/single-element-in-a-sorted-array/description/
        You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

        Input: nums = [3,3,7,7,10,11,11]
        Output: 10

*/