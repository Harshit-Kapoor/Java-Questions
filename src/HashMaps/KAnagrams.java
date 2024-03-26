package HashMaps;

import java.util.HashMap;

public class KAnagrams {

    public static void main(String[] args) {

        String str1 = "ababaddccc";   //  a3 b2 c3 d2

        String str2 = "bcbecabacd";   //  a2 b3 c3 d1 e1

        int k = 3;

        if (str1.length() != str2.length()) {
            System.out.println("false");
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            if (map.getOrDefault(ch, 0) > 0) {               // if char is not present then put 0 otherwise if freq > 0, reduce by 1
                map.put(ch, map.get(ch) - 1);
            }
        }

        int ans = 0;

        for (char c : map.keySet()) {
            ans += map.get(c);
        }

        if (ans > k) {
            System.out.println(ans + " false");
        } else if (ans <= k) {
            System.out.println(ans + " true");
        }

    }

}


/*
    if i replace upto k characters of a string then it becomes anagram with another string

    create freq hashmap of first str

    iterate over second string and reduce the frequency from the same map

    if sum of values of all keys left is less than k then its valid
*/
