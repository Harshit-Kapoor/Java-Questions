class Solution {
    public int searchInsert(int[] arr, int target) {
        
        // need to find lower bound in this
            
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int ans = n;
        
        while (start <= end) {
            
            int mid = (start + end) / 2;
            
            if (arr[mid] >= target) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
                        
        }
            
            
        return ans;
        
    }
}