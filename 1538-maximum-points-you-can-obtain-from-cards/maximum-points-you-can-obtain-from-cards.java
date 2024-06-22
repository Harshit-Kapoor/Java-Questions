class Solution {
    public int maxScore(int[] arr, int k) {
        
        
        int lsum = 0;
        int rsum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        // first take all from left
        
        for(int i=0; i<k; i++) {
            lsum = lsum + arr[i];
        }
        
        maxSum = lsum;
        
        int rightIndex = arr.length-1;
        
        // remove values from lsum and simulntaneously add right values
        
        for(int i=k-1; i>=0; i--) {
            
            lsum = lsum - arr[i];
            rsum = rsum + arr[rightIndex];
            rightIndex--;
                
            maxSum = Math.max(maxSum, lsum+rsum);
            
        }
        
        return maxSum;
        
        
    }
}


