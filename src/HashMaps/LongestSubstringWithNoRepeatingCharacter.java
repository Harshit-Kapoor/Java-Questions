package HashMaps;

import java.util.HashMap;

public class LongestSubstringWithNoRepeatingCharacter {

    public static void main(String[] args) {

        String s = "abbacbcdbadbdbbddcb";

        int i = -1;
        int j = -1;
        int ans = 0;

        HashMap<Character,Integer> map = new HashMap<>();

        while(true) {

            boolean f1 = false;
            boolean f2 = false;

            // acquire till valid
            while(i < s.length()-1){
                i++;
                char ch = s.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0) + 1);

                if (map.get(ch) == 2) {
                    break;
                } else {
                    int len = i - j;
                    if (len > ans) {
                        ans = len;
                    }
                }
                f1 = true;
            }

            // Release till valid again

            while (j < i) {
                j++;
                char c = s.charAt(j);
                map.put(c, map.get(c) - 1);

                if (map.get(c) == 1) {            // we check with one and not that remove scenario because we can remove 1 to 0 but still ch with freq 2 might be there
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
    Q - Find longest substring with no repeating character

    iterate the string and add intp freq hmap and check if freq is > 1 the acquiring is done then move to release

    release till becomes valid again

*/

