class Solution {
    public int longestPalindrome(String s) {
     
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        
        int result = 0, oddFreqNumCount = 0;
        
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        for (int v : map.values()) {
            
            if (v % 2 == 0) {
                result += v;
            } else {
                oddFreqNumCount++;
                result += (v - 1);
            }
            
        }
        
        if (oddFreqNumCount > 0) {
            result++;
        }
        
        return result;        
    
    }
}