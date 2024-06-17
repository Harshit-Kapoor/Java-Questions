class Solution {
        public void nextPermutation(int[] nums) {
        int i = nums.length - 2;

        // Find first index i from right s.t.
        // nums[i + 1]  > nums[i]
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            // Find j s.t. nums[j] is
            // just larger than nums[i]
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        // Make nums[i+1...]
        // equal to the smallest
        // possible permutation by reversing
        reverse(nums, i + 1);
    }

    private void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}