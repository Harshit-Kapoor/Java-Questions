package HashMaps;

import java.util.HashMap;

public class LongestSubArrayWithZeroSum {

    public static void main(String[] args) {

        int[] arr = {2, 8, -3, -5, 2, -4, 6, 1, 2, 1, -3, 4};

        HashMap<Integer, Integer> hm = new HashMap<>();
        int maxLen = Integer.MIN_VALUE;

        int i = -1;
        int sum = 0;

        hm.put(sum, i);

        while (i < arr.length-1) {
            i++;
            sum = sum + arr[i];

            if (hm.containsKey(sum) == false) {
                hm.put(sum, i);
            } else {
                int len = i - hm.get(sum);
                maxLen = Math.max(len, maxLen);
            }
        }

        System.out.println(maxLen);

    }

}

/*

        Q - Get length of subarray with 0 sum

        create a hashmap of sum and index

        sum is prefix sum, keep on adding and storing its index

        if sum at any element was already present earlier in hashmap, then current index  prev index is length reqd

*/
