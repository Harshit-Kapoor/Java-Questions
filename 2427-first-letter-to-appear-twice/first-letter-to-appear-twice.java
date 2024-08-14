class Solution {
    public char repeatedCharacter(String s) {
        
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        char[] ch = s.toCharArray();
        
        for(char c : s.toCharArray()) {
            
            if (map.containsKey(c)) {
              return c;                
            } else {
                map.put(c, 1);
            }            
        }
        
        return 'a';
        
    }
}