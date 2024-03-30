package HashMaps;

import java.util.HashMap;

public class LongestSubarrayWithSumEqualsToK {

    public static void main(String[] args) {

        int[] arr = {3, 9, -2, 4, 1, -7, 2, 6, -5, 8, -3, -7, 6, 2, 1};

        HashMap<Integer, Integer> hm = new HashMap<>();
        int maxLen = Integer.MIN_VALUE;

        int i = -1;
        int k = 5;
        int sum = 0;

        hm.put(sum, i);

        while (i < arr.length - 1) {
            i++;
            sum = sum + arr[i];

            if (hm.containsKey(sum - k) == false) {
                hm.put(sum, i);
            } else {
                int len = i - hm.get(sum - k);
                maxLen = Math.max(len, maxLen);
            }
        }

        System.out.println(maxLen);

    }

}