class Solution {
    public boolean search(int[] arr, int target) {
        
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        
        while (start <= end) {
            
            int mid = (start + end) / 2;
            
            if (arr[mid] == target) return true;
            
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                start = start + 1;
                end = end - 1;
                continue;
            }
            
            // to check which part is sorted
            
            // if left part if sorted 
            
            if (arr[start] <= arr[mid]) {
                
                // target is present in left part which is sorted then remove right part
                if (arr[start] <= target  && target <= arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
                
            } 
            
            // if right part is sorted
            
            else {
                
                // target is present in right part which is sorted then remove left part                
                if (arr[mid] <= target && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
                
            }
        }
        
        return false;
        
    }
}