class Solution {
    public int search(int[] arr, int target) {
        
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        
        while (start <= end) {
            
            int mid = (start + end) / 2;

            // if mid points to the target
            if (arr[mid] == target) return mid;

            // if left part is sorted
            if (arr[start] <= arr[mid]) {
                if (arr[start] <= target && target <= arr[mid]) {
                    // element exists
                    end = mid - 1;
                } else {
                    // element does not exist
                    start = mid + 1;
                }
            } else { // if right part is sorted
                if (arr[mid] <= target && target <= arr[end]) {
                    // element exists
                    start = mid + 1;
                } else {
                    // element does not exist
                    end = mid - 1;
                }
            }
        }
        return -1;
       
    }
}