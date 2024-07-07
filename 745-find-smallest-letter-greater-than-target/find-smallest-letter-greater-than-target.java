class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        // looks like we need to find upper bound
        
        if (target == 'z') return letters[0];
        
        char ans = letters[0];
        
        int n = letters.length;
        int start = 0;
        int end = n-1;
        
        while (start <= end) {
            
            int mid = (start + end) / 2;
            
            if (letters[mid] > target) {
                ans = letters[mid];
                end = mid - 1;
            } else {
                start = mid + 1;
            }            
            
        }
            
        return ans;
        
    }
}