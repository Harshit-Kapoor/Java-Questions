class Solution {
    public int maximumDifference(int[] nums) {
        
        int ans = -1, minTillNow = nums[0];
        
        for(int j=1; j<nums.length; j++) {
            
            if (nums[j] > minTillNow) {
                ans = Math.max(ans, nums[j] - minTillNow);
            }
            
            minTillNow = Math.min(minTillNow, nums[j]);
            
        }
        
        return ans;
        
    }
}