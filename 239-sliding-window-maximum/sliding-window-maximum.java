class Solution {
    public static int[] maxSlidingWindow(int[] arr, int k) {

        int j = 0, i = 0, arrayIndex = 0;
        int[] ans = new int[arr.length - k + 1];
        List<Integer> l = new ArrayList<>();

        while (j < arr.length) {

            while (l.size() != 0 && l.get(l.size() - 1) < arr[j]) {                                // calculation - ek list bana lenge, and list mein sirf kaam ke elemets ayenge, means arr[j] se pehle jo bhi smaller hai wo remove krdo because those would never be used, and if when we remove arr[j] to j ke right side waale elements mein hi next max hoga
                l.remove(l.size() - 1);
            }
            l.add(arr[j]);

            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                ans[arrayIndex] = l.get(0);
                arrayIndex++;
                if (arr[i] == l.get(0)) l.remove(0);
                i++;
                j++;

            }
        }
        return ans;


    }
}