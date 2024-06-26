class Solution {

    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int[] arr = new int[101];
        int totalNagetive = 0;
        int[] result = new int[nums.length - k + 1];
        int index = 0;
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] < 0)
                totalNagetive++;
            arr[nums[right] + 50]++;
            while (right - left + 1 > k) {
                arr[nums[left] + 50]--;
                if (nums[left] < 0)
                    totalNagetive--;
                left++;
            }
            if (right - left + 1 == k) {
                if (x <= totalNagetive)
                    result[index] = findXSmallest(arr, x);
                index++;
            }
        }
        return result;
    }
    
    public int findXSmallest(int[] arr, int x) {
        for (int i = 0; i < 50; i++) {
            x -= arr[i];
            if (x <= 0) {
                return i - 50;
            }
        }
        return 0;
    }
    
/*    public static int[] getSubarrayBeauty(int[] arr, int k, int x) {

      NOT ALL TC PASSING
        int n = arr.length;
        int[] ans = new int[n - k + 1];
        int ansIndex = 0;
        int i = 0;
        int j = 0;
        List<Integer> lst = new ArrayList<Integer>();

        while (j < n) {

            if (arr[j] < 0) {
                lst.add(arr[j]);
            }

            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {

                List<Integer> copy = new ArrayList<Integer>();

                if (!lst.isEmpty()) {
                    copy.addAll(lst);
                    Collections.sort(copy);
                    ans[ansIndex++] = copy.get(x - 1);

                    if (arr[i] == lst.get(0)) {
                        lst.remove(0);
                    }
                    copy.clear();
                } else {
                    ans[ansIndex++] = 0;
                }

                i++;
                j++;


            }
        }

        return ans;

    }
*/
}