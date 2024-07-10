class Solution {
    public int findMin(int[] nums) {
        
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        int min = Integer.MAX_VALUE;
            
            
        while (start <= end) {
            
            int mid = (start + end) / 2;
            
            // check which part is sorted, it may or may not have min val, so we are taking min from it and removng it
            
            if (nums[start] <= nums[mid]) {
                min = Math.min(min, nums[start]);                
                start = mid + 1;                
            } else {
                
                // right part is sorted , take its min and remove that
                min = Math.min(min, nums[mid]);                
                end = mid - 1;                
            }
            
        }
        
            
        return min;        
        
    }
}