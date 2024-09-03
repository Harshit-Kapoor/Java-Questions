class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String[] arr = s.split(" ");
        
        if (pattern.length() != arr.length) {
            return false;
        }
        
        Map<Character, String> map = new HashMap<Character, String>();
                
        for (int i=0; i<pattern.length(); i++) {
            
            char c = pattern.charAt(i);
            String str = arr[i];
            
            if (!map.containsKey(c)) {
                if (!map.containsValue(str)) {
                    map.put(c, str);
                } else {
                    return false;
                }
            } else {
                if (!map.get(c).equals(str)) {
                    return false;
                }
            }
            
        }
        
        return true;        
        
    }
}