class Solution {
    public static int pivotIndex(int[] nums) {

        int n = nums.length;

        int ans = -1;

        int[] prefix = new int[n];
        int[] suffix = new int[n];

        if (n == 1) {
            return 0;
        }
        
        for (int i = 0; i < n; i++) {
            prefix[i] = (i == 0) ? nums[i] : nums[i] + prefix[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            suffix[i] = (i == n - 1) ? nums[n - 1] : nums[i] + suffix[i + 1];
        }

        System.out.println(Arrays.toString(prefix));
        System.out.println(Arrays.toString(suffix));

        if (0 == suffix[1]) {
            return 0;
        }
        
        for (int i = 1; i < n - 1; i++) {
            int leftSum = prefix[i - 1];
            int rightSum = suffix[i + 1];
            if (leftSum == rightSum) {
                return i;
            }
        }

        if (prefix[n - 2] == 0) {
            return n - 1;
        }

        return -1;

    }}