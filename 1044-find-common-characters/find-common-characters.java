class Solution {
    public List<String> commonChars(String[] words) {
        Map<Character, Integer> map = new HashMap<>();
        
		// count the frequency of each character for first word
        for (char ch : words[0].toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
		// loop through the rest of words and compare with the first word
        for (int i = 1; i < words.length; i++) {
			// count the frequency of character to do comparison
            Map<Character, Integer> tempMap = new HashMap<>();
            for (char ch : words[i].toCharArray()) {
                tempMap.put(ch, tempMap.getOrDefault(ch, 0) + 1);
            }
            
			// if the character in first word is not in other words, then make it 0
			// else we put the min frequency
            for (Character ch : map.keySet()){
                if (!tempMap.containsKey(ch)) {
                    map.put(ch, 0);
                } else {
                    map.put(ch, Math.min(map.get(ch), tempMap.get(ch)));
                }
            }
        }
        
		// last step is simply printing out the result
        List<String> result = new ArrayList<>();
        for (Character ch : map.keySet()) {
            int count = map.get(ch);
            while (count > 0) {
                result.add(String.valueOf(ch));
                count--;
            }
        }
        
        return result;
    }
}