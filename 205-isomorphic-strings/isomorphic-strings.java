class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        
        for (int i=0; i<s.length(); i++) {
            
            char currentChar = s.charAt(i);
            char replacedChar = t.charAt(i);
            
            if (!map.containsKey(currentChar)) {
                if (!map.containsValue(replacedChar)) {
                    map.put(currentChar, replacedChar);
                } else {
                    return false;
                }
            } else {
                if (map.get(currentChar) != replacedChar) {
                    return false;
                }
            }
            
        }
        
        return true;
        
    }
}