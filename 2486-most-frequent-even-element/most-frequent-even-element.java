class Solution {
public static int mostFrequentEven(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int e : nums) {
            map.put(e, map.getOrDefault(e, 0) + 1);
        }

        int max = -1;

        for (int k : map.keySet()) {
            if (k % 2 == 0) {
                max = Math.max(max, map.get(k));
            }
        }

        int min = Integer.MAX_VALUE;

        for (int k : map.keySet()) {
            if (k % 2 == 0) {
                if (map.get(k) == max) {
                    min = Math.min(min, k);
                }
            }
        }

        if (max == -1) {
            return -1;
        }

        return min;

    }
}