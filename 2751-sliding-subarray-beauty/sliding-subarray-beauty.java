class Solution {
    public static int[] getSubarrayBeauty(int[] nums, int k, int x) {
        TreeMap<Integer, Integer> freqMap = new TreeMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (j < nums.length) {
            if (nums[j] < 0) {
                freqMap.put(nums[j], freqMap.getOrDefault(nums[j], 0) + 1);
            }

            if (j - i + 1 == k) {
                int beauty = getKthSmallestNegative(freqMap, x);
                result.add(beauty);
                if (nums[i] < 0) {
                    int count = freqMap.get(nums[i]);
                    if (count == 1) {
                        freqMap.remove(nums[i]);
                    } else {
                        freqMap.put(nums[i], count - 1);
                    }
                }
                i++;
            }
            j++;
        }

        // Convert ArrayList to array
        int[] res = new int[result.size()];
        for (int idx = 0; idx < result.size(); idx++) {
            res[idx] = result.get(idx);
        }

        return res;
    }

    private static int getKthSmallestNegative(TreeMap<Integer, Integer> freqMap, int x) {
        if (freqMap.isEmpty()) {
            return 0; // If there are no negative numbers, return 0
        }

        int count = 0;
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            count += entry.getValue();
            if (count >= x) {
                return entry.getKey(); // Return the xth smallest negative number
            }
        }
        return 0; // If there are fewer than x negative numbers, return 0
    }

}