package Basics;

import java.util.HashMap;

public class StringCompression {

    public static void main(String[] args) {

        String str = "aaabbccccddefff";

        HashMap<Character, Integer> fm = new HashMap<Character, Integer>();

        for (int i=0; i<str.length(); i++) {
            if (fm.containsKey(str.charAt(i))) {
                fm.put(str.charAt(i), fm.get(str.charAt(i)) + 1);
            } else {
                fm.put(str.charAt(i), 1);
            }
        }

        for (char k: fm.keySet()) {
            System.out.print(k + "" + fm.get(k));
        }

    }

}
