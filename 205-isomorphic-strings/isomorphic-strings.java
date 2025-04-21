class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character, Character> map = new HashMap<>();

        for (int i=0; i<s.length(); i++) {

            char originalCharacter = s.charAt(i);
            char replacedCharacter = t.charAt(i);            

            if (!map.containsKey(originalCharacter)) {
                if (!map.containsValue(replacedCharacter)) {
                    map.put(originalCharacter, replacedCharacter);
                } else {
                    return false;
                }
            } else {
                char temp = map.get(originalCharacter);
                if (temp != replacedCharacter) {
                    return false;
                }
            }


        }

        return true;

        
    }
}