package HashMaps;

import java.util.HashMap;

public class LongestSubstringWithKUniqueCharacter {

    public static void main(String[] args) {
        String str = "aabcbcdbca";
        int k = 2;
        int ans = 0;
        int i = -1;
        int j = -1;

        HashMap<Character, Integer> map = new HashMap<>();

        while (true) {
            boolean f1 = false;
            boolean f2 = false;

            while (i < str.length() - 1) {
                i++;
                char ch = str.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0) + 1);

                if (map.size() < k) {
                    continue;
                } else if (map.size() == k) {
                    int len = i - j;
                    if (len > ans) {
                        ans = len;
                    }
                } else {
                    break;
                }
                f1 = true;
            }

            while (j < i) {
                j++;
                char ch = str.charAt(j);
                if (map.get(ch) == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch) - 1);
                }

                if (map.size() > k) {
                    continue;
                } else if (map.size() == k) {
                    int len = i - j;
                    if (len > ans) {
                        ans = len;
                    }
                    break;
                } else if (map.size() < k) {
                    // this case will never come
                }
                f2 = true;
            }

            if (f1 == false && f2 == false) {
                break;
            }
        }

        System.out.println(ans);
    }
}


/*
    Q - Find longest substring with k unique characters

    Iterate string and add elements in freq hashmap till its size is == k, we got pot ans (unique char) till invalid

    Now release till its become valid again ie size == k, we got pot ans
*/


