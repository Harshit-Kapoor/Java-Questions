class Solution {
        public static int findUnsortedSubarray(int[] nums) {

        int[] copyNums = nums.clone();

        Arrays.sort(copyNums);

        int st = -1;
        int en = -1;

        int n = nums.length;

        for (int i = 0; i < n; i++) {

            if (nums[i] != copyNums[i]) {

                if (st == -1) {
                    st = i;
                    en = i;
                } else {
                    en = i;
                }

            }

        }

        int ans = en - st + 1;

        return ans == 1 ? 0 : ans;

    }
}