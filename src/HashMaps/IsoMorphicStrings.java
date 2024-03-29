package HashMaps;

import java.util.HashMap;

public class IsoMorphicStrings {

    public static void main(String[] args) {

        String s1 = "abacba";
        String s2 = "xyxzyx";

        if (s1.length() != s2.length()) {
            System.out.println("Not isomorphic");
            return;
        }

        HashMap<Character, Character> map1 = new HashMap<>();          // to map str1 with str2 char
        HashMap<Character, Boolean> map2 = new HashMap<>();            // to check if str2 char is present for use or not

        for (int i=0; i<s1.length(); i++) {

            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);

            if (map1.containsKey(ch1) == true) {                        // if map1 already has that character, so its already mapped with some s2 char
                if (map1.get(ch1) != ch2) {                             // if ch1 is not mapped with ch2 then return false
                    System.out.println("Not isomorphic");
                    return;
                }
            } else {                                                    // if ch1 of s1 is not mapped with ch2 of s2, then we can map
                if (map2.containsKey(ch2) == true) {                    // before mapping check ch2 of s2 should be unused, if used then return false
                    System.out.println("Not isomorphic");
                    return;
                } else {
                    map1.put(ch1, ch2);                                 // now can map if ch2 is not present in map2
                    map2.put(ch2, true);
                }
            }
        }

        System.out.println("Isomorphic");

    }

}
