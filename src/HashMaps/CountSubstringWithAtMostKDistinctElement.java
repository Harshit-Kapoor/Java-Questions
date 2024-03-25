package HashMaps;

import java.util.HashMap;

public class CountSubstringWithAtMostKDistinctElement {

    public static void main(String[] args) {

        String str = "aabcbcdbca";

        int ans = 0;
        int k = 2;
        int i = -1;
        int j = -1;

        HashMap<Character, Integer> map = new HashMap<>();

        while (true) {

            while (i < str.length() - 1) {
                i++;
                char ch = str.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0) + 1);

                if (map.size() <= k) {
                    ans += i - j;
                } else {
                    break;
                }
            }

            if (i == str.length() - 1 && map.size() == k) {
                break;
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
                } else {
                    ans += i - j;
                    break;
                }
            }
        }

        System.out.println(ans);

    }
}

// ?v=shsYUyF7pEs&list=PL-Jc9J83PIiEp9DKNiaQyjuDeg3XSoVMR&index=18