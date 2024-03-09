package HashMaps;

import java.util.HashMap;

public class HighestFrequencyCharacter {

    public static void main(String[] args) {

        String s = "abracadabrahwydisbcnabbaacc";

        HashMap<Character, Integer> fhm = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            if (fhm.containsKey(s.charAt(i))) {
                fhm.put(s.charAt(i), fhm.get(s.charAt(i)) + 1);
            } else {
                fhm.put(s.charAt(i), 1);
            }
        }

        char mfc = s.charAt(0);

        for (char k : fhm.keySet()) {
            if (fhm.get(k) > fhm.get(mfc)) {
                mfc = k;
            }
        }

        System.out.println(mfc);

    }

}
