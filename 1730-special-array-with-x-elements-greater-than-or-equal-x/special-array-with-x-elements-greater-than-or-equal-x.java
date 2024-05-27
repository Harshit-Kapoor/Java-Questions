class Solution {
    public int specialArray(int[] nums) {
        
        
        for(int i=1; i<=nums.length; i++) {
            
            int ans = 0;
            
            for(int j=0; j<nums.length; j++) {
                
                if(nums[j] >= i) {
                    ans++;
                }
                
                
            }
            
            if(ans == i) {
                return i;
            }
            
            
        }
        
        return -1;
        
    }
}