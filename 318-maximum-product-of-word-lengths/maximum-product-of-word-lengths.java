class Solution {
    
    public static boolean checkUniqueness(String s1, String s2) {
        
        int[] arr1 = new int[26];
        
        for (char c : s1.toCharArray()) {
            arr1[c - 'a']++;
        }
        
       for (char c : s2.toCharArray()) {
            if (arr1[c - 'a'] > 0) {
                return false;
            }
        }
        
        return true;
        
    }
    
    public int maxProduct(String[] words) {
        
        int max = 0;
        
        for (int i=0; i<words.length - 1; i++) {
            
            for (int j=i+1; j<words.length; j++) {
                
                if (checkUniqueness(words[i], words[j])) {
                    
                    max = Math.max(max, words[i].length() * words[j].length());
                    
                }
                
            }
            
        }
        
        return max;
        
    }
}