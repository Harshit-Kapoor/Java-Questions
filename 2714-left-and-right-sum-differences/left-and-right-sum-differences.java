class Solution {
        public static int[] leftRightDifference(int[] nums) {

        int n = nums.length;

        int[] prefix = new int[nums.length];

        int[] suffix = new int[nums.length];

        for(int i=1; i<nums.length; i++) {
            prefix[i] = (i == 1) ? nums[i-1] : nums[i-1] + prefix[i-1];
        }

        prefix[0] = 0;

        for(int i=n-2; i>=0; i--) {
            suffix[i] = (i == n-2) ? nums[i+1] : nums[i+1] + suffix[i+1];
        }

        suffix[n-1] = 0;

        System.out.println(Arrays.toString(prefix));
        System.out.println(Arrays.toString(suffix));

        for(int i=0; i<nums.length; i++) {

            nums[i] = Math.abs(prefix[i] - suffix[i]);

        }

        return nums;
    }

}