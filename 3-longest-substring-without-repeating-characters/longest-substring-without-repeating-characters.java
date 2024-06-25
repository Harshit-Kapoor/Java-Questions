class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int i = 0;
        int j = 0;
        int max = 0;
        int n = s.length();
        char[] ch = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        while (j < n) {

            map.put(ch[j], map.getOrDefault(ch[j], 0) + 1);

            if (map.size() > j - i + 1) {          // this condition will never hit as unique char in window cant be > size
                j++;
            } else if (map.size() == j - i + 1) {
                max = Math.max(max, j - i + 1);
                j++;
            } else if (map.size() < j - i + 1) {            // here we are reducing and iterating i when its < j-i+1 (since if map has 2 size a->1, b->2, and j-i+1 is 3, so theres a duplicate in window so needs to be removed by iterate=ing i)
                while (map.size() < j - i + 1) {
                    map.put(ch[i], map.getOrDefault(ch[i], 0) - 1);
                    if (map.get(ch[i]) == 0) {
                        map.remove(ch[i]);
                    }
                    i++;
                }
                j++;
            }
        }
        
        return max;
        
    }
}