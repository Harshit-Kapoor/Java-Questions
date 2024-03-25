package HashMaps;

import java.util.HashMap;

public class CountSubstringWithNoRepeatingCharacter {

    public static void main(String[] args) {

        String str = "aabcbcdbca";

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

                if (map.get(ch) == 2) {
                    break;
                } else {
                    ans += i - j;
                }
                f1 = true;
            }

            while (j < i) {
                j++;
                char ch = str.charAt(j);
                map.put(ch, map.get(ch) - 1);

                if (map.get(ch) == 1) {
                    ans = ans + (i - j);
                    break;
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
    Q - Find count of substring with no repeating character

    iterate the string and add intp freq hmap and check if freq is > 1 the acquiring is done, if valid add count then move to release

    when repitition comes, break and release

    release till becomes valid again, add count

*/

