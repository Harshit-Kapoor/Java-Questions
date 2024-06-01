class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int minLength = Integer.MAX_VALUE;
        
        for(int i=0; i<strs.length; i++) {
            
            int len = strs[i].length();
            
            minLength = Math.min(minLength, len);
            
        }
        
        int ans = 0;
        
        for(int i=0; i<minLength; i++) {

            char charToCheck = strs[0].charAt(i);
            int count  = 0;
            
            for(int j=0; j<strs.length; j++) {
                
                char c = strs[j].charAt(i);
                
                if (c == charToCheck) {
                    count++;
                } 
                
            }
            
            if (count == strs.length) {
                ans++;
            } else {
                    break;
            }
            
        }
        
        String ansString  = "";
        
        for(int i=0; i<ans; i++) {
            ansString += strs[0].charAt(i);
        }
        
        return ansString;
        
    }
}