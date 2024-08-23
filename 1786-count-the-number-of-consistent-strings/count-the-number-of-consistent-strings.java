class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        int ans = 0, count = 0;
        
        for(String s : words) {
            
            String word = s;
            count = 0;
            
            for(int i=0; i<word.length(); i++) {
                
                char c = word.charAt(i);
                
                if (allowed.contains(c+"") == false) {
                    break;
                }
                
                count++;
                
            }
            
            if (count == word.length()) {
                ans++;
            }
            
                        
        }
        
        return ans;
        
        
    }
}