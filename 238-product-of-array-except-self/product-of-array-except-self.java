class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        int[] prefixProduct = new int[nums.length];
        int[] suffixProduct = new int[nums.length];

        for (int i=0; i<n; i++) {
            prefixProduct[i] = (i == 0) ? nums[i] : nums[i] * prefixProduct[i-1];
        }

        for (int i=n-1; i>=0; i--) {
            suffixProduct[i] = (i == n-1) ? nums[n-1] : nums[i] * suffixProduct[i+1];
        } 

        ans[0] = suffixProduct[1];
        ans[n-1] = prefixProduct[n-2];

        for (int i=1; i<n-1; i++) {
            ans[i] = prefixProduct[i-1] * suffixProduct[i+1];
        }

        return ans;

    }
}