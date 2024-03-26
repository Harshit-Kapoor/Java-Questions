package HashMaps;

import java.util.HashMap;

public class FindAllAnagramsInString {

    public static boolean compare(HashMap<Character, Integer> smap, HashMap<Character, Integer> pmap) {
        for (Character ch : smap.keySet()) {
            if (pmap.getOrDefault(ch, 0) !=  smap.get(ch)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String source = "cbaebabacd";
        String pattern = "abc";

        HashMap<Character,Integer> smap = new HashMap<>();
        HashMap<Character,Integer> pmap = new HashMap<>();

        for(int i=0; i<pattern.length(); i++) {
            char ch = pattern.charAt(i);
            pmap.put(ch, pmap.getOrDefault(ch, 0) + 1);
        }

        for(int i=0; i<pattern.length(); i++) {
            char ch = source.charAt(i);
            smap.put(ch, smap.getOrDefault(ch, 0) + 1);
        }

        int i = pattern.length();
        int j = 0;
        int count = 0;

        while (i < source.length()) {

            if(compare(smap, pmap) == true) {
                count++;
            }

            // acquire i th char
            char acquireChar = source.charAt(i);
            smap.put(acquireChar, smap.getOrDefault(acquireChar, 0) + 1);

            // release j th char
            char releaseChar = source.charAt(j);
            if (smap.get(releaseChar) == 1) {
                smap.remove(releaseChar);
            } else {
                smap.put(releaseChar, smap.get(releaseChar) - 1);
            }

            i++;
            j++;

        }

        if(compare(smap, pmap) == true) {
            count++;
        }

        System.out.println(count);

    }

}

/*

    Find count and starting point of anangram

    Create frequency hashmap of both source and pattern string

    create fhm of source till pattern length

    then acquire and release and check one by one
*/


