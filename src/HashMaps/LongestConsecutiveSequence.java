package HashMaps;

import java.util.HashMap;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {

        int[] arr = {10, 5, 9, 1, 11, 8, 6, 15, 3, 12, 2};

/*      find length of longest consecutive sequence = 5
        5, 6 = 2
        1, 2, 3 = 3
        8, 9 ,10, 11, 12 = 5
        15 = 1
*/

        // first consider all are starting point
        HashMap<Integer, Boolean> hm = new HashMap<Integer, Boolean>();

        for (int e : arr) {
            hm.put(e, true);
        }

        // check which are starting by checking if arr[i] - 1 is present in hashmap or not
        for (int e : arr) {
            if (hm.containsKey(e - 1)) {
                hm.put(e, false);
            }
        }

        int maxLen = Integer.MIN_VALUE;
        int maxStart = Integer.MIN_VALUE;

        for (int k : hm.keySet()) {
            if (hm.get(k) == true) {
                int tempLen = 1;
                int tempStart = k;
                while (hm.containsKey(tempStart + tempLen)) {
                    tempLen++;
                }

                if (tempLen > maxLen) {
                    maxLen = tempLen;
                    maxStart = tempStart;
                }

            }
        }

        System.out.println("maxStart " + maxStart);
        System.out.println("maxLen " + maxLen);

        for (int i=0; i<maxLen; i++) {
            System.out.println(maxStart + i);
        }

    }

}
