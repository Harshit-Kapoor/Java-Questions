class Solution {
    public int lengthOfLastWord(String s) {
        
        String[] arr = s.trim().split(" ");        
                
        return s.trim().split(" ")[arr.length - 1].length();
        
    }
}