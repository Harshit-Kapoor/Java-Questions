class Solution {
    
/*    // https://leetcode.com/problems/maximum-product-subarray/discuss/4978020/Maximum-product-subarray-oror-interesting-approach
    
        public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int temp = maxProduct;
            maxProduct = Math.max(nums[i], Math.max(nums[i] * maxProduct, nums[i] * minProduct));
            minProduct = Math.min(nums[i], Math.min(nums[i] * temp, nums[i] * minProduct));
            result = Math.max(result, maxProduct);
        }

        return result;
    } */
    
    
    public int maxProduct(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        
        long maxProduct = nums[0];
        long minProduct = nums[0];
        long result = nums[0];
        
        for (int i = 1; i < n; i++) {
            if (nums[i] < 0) {
                // Swap max and min products when encountering a negative number
                long temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }
            
            maxProduct = Math.max(nums[i], maxProduct * nums[i]);
            minProduct = Math.min(nums[i], minProduct * nums[i]);
            
            result = Math.max(result, maxProduct);
        }
        
        return (int) result;
    }
}