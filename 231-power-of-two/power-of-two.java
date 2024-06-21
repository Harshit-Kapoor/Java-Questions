class Solution {
    
    public boolean checkpower(int n) {
    
        if (n==1) return true;

        if (n % 2 != 0) return false;

        return checkpower(n / 2);

    }
    
    public boolean isPowerOfTwo(int n) {
        
        if (n <= 0) {
          return false;  
        } 
        
        return checkpower(n);

    }
}