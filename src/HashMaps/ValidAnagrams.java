package HashMaps;

import java.util.HashMap;

public class ValidAnagrams {

    public static void main(String[] args) {

        String s1 = "abbcaad";

        String s2 = "babacda";

        if (s1.length() != s2.length()) {
            System.out.println("Not an anagram");
        }

        HashMap<Character,Integer> map = new HashMap<>();

        for (int i=0; i<s1.length(); i++) {
            char ch = s1.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i=0; i<s2.length(); i++) {
            char ch = s2.charAt(i);
            if (map.containsKey(ch) == false) {
                System.out.println("Not Anagram");
                break;
            }
            if (map.get(ch) == 1) {
                map.remove(ch);
            } else if (map.get(ch) > 1) {
                map.put(ch, map.get(ch) - 1);
            }
        }

        if (map.size() == 0) {
            System.out.println("Anagram");
        }

    }
}
