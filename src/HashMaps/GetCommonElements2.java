package HashMaps;

import java.util.HashMap;

public class GetCommonElements2 {

    public static void main(String[] args) {

        int[] arr1 = {1, 1, 2, 2, 2, 3, 5};
        int[] arr2 = {1, 1, 1, 2, 2, 4, 5};     // op - 1, 1, 2, 2, 5

        HashMap<Integer, Integer> hm1 = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr1.length; i++) {
            hm1.put(arr1[i], hm1.getOrDefault(arr1[i], 0) + 1);
        }

        System.out.println(hm1);

        for (int k : arr2) {
            if (hm1.containsKey(k)) {
                if (hm1.get(k) > 0) {
                    System.out.println(k);
                    hm1.put(k, hm1.get(k) - 1);
                }
            }
        }

    }
}
