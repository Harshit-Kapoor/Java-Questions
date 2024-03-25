package HashMaps;

import java.util.HashMap;
import java.util.HashSet;

public class MinimumWindowSubstring {

    public static void main(String[] args) {

        String s = "bbacacdcbbcaadcdca";

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }

        int i = -1;
        int j = -1;
        int len = s.length();

        HashMap<Character, Integer> map = new HashMap<>();

        while (true) {
            boolean f1 = false;
            boolean f2 = false;


            // acquire till its invalid (ie map.size < set.size)
            while (i < s.length() - 1 && map.size() < set.size()) {
                i++;
                char ch = s.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
                f1 = true;
            }

            // collect and release

            while (j < i && map.size() == set.size()) {
                int potentialLen = i - j;
                if (potentialLen < len) {
                    len = potentialLen;
                }

                j++;
                char ch = s.charAt(j);
                if (map.get(ch) == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch) - 1);
                }
                f2 = true;
            }

            if (f1 == false && f2 == false) {
                break;
            }

        }

        System.out.println(set);
        System.out.println(len);

    }

}


/*

    Q - Smallest substring of a string containing all unique characters of itself

    first find all unique characters like abcd using set

    first iterate acquire enough character in hashmap ie abcd ie 4 ie hm.size should be 4

    then use acquire and release, whenever 4 hits checks size is less than ans or not

*/
