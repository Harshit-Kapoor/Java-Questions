package HashMaps;

import java.util.HashMap;

public class LongestSubstringWithAtMostKUniqueCharacter {

    public static void main(String[] args) {

        String str = "ddacbbaccdedacebb";
        int ans = 0;
        int i = -1;
        int j = -1;
        int k = 3;

        HashMap<Character, Integer> map = new HashMap<>();

        while (true) {
            boolean f1 = false;
            boolean f2 = false;

            while (i < str.length() - 1) {
                f1 = true;
                i++;
                char ch = str.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
                if (map.size() <= k) {
                    int len = i - j;
                    if (len > ans) {
                        ans = len;
                    }
                } else {
                    break;
                }
            }

            while (j < i) {
                f2 = true;
                j++;
                char ch = str.charAt(j);
                if (map.get(ch) == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch) - 1);
                }

                if (map.size() > k) {
                    continue;
                } else {
                    int len = i - j;
                    if (len > ans) {
                        ans = len;
                    }
                    break;
                }
            }

            if (f1 == false && f2 == false) {
                break;
            }
        }

        System.out.println(ans);

    }
}
