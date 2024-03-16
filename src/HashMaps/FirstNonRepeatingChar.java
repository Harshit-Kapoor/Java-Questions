package HashMaps;

import java.util.HashMap;

public class FirstNonRepeatingChar {

    public static void main(String[] args) {

        String s = "abbcaddecfab";

        char[] charArray = s.toCharArray();

        HashMap<Character, Integer> fhm = new HashMap<>();

        for (char c : charArray) {
            fhm.put(c, fhm.getOrDefault(c, 0) + 1);
        }

        for (char c : charArray) {
            if (fhm.get(c) == 1) {
                System.out.println(c);
                break;
            }
        }

    }
}
