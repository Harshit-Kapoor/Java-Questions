package HashMaps;

import java.util.HashMap;

public class CountSubArraySumEqualsToK {

    public static void main(String[] args) {

        int[] arr = {3, 9, -2, 4, 1, -7, 2, 6, -5, 8, -3, -7, 6, 2, 1};
        int k = 5;

        HashMap<Integer, Integer> map = new HashMap<>();
        int i = -1; int sum = 0; int ans = 0;

        map.put(sum, 1);

        while (i < arr.length - 1) {
            i++;
            sum += arr[i];

            if (map.containsKey(sum - k) == false) {
                map.put(sum, 1);
            } else {
                ans += map.get(sum - k);
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }

//            if (map.containsKey(sum - k)) {
//                ans += map.get(sum - k);
//            }
//
//            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.out.println(ans);
    }
}
