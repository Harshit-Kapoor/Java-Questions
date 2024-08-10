class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int count = 0;
        int maxCount = Integer.MIN_VALUE;
        
        for(int i=0; i<nums.length; i++) {
            
            if (nums[i] == 1) {
                count++;
            } else {                
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
            
        }
        
        maxCount = Math.max(maxCount, count);
        
        return maxCount;
        
    }
    
    public int findMaxConsecutiveOnes1(int[] arr) {
        
        int finalAnswer = 0;
        int n = arr.length;

        for (int l = 0; l < n; ++l) {
            
            int no_of_zeroes = 0;
            
            for (int r = l; r < n; ++r) {
                if (arr[r] == 0) {
                    no_of_zeroes++;
                }

                if (no_of_zeroes == 0) {
                    finalAnswer = Math.max(finalAnswer, r - l + 1);
                }
            }
        }

        return finalAnswer;

        
    }
}