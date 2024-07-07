class Solution {
        public int mySqrt(int x) {

        if (x == 1) return 1;    
        int start = 1;
        int end = x;
        int ans = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid * mid == x) return mid;
            
            if ((long) mid * mid <= (long) x) {
                ans = mid;
                start = mid + 1;                
            } else {
                end = mid - 1;                
            }
        }

        return ans;
    }
}