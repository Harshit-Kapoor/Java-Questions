class Solution {
        public static int numberOfSubarrays(int[] nums, int k) {

        int countOdd = 0;

        int start = 0;
        int end = 0;

        int maxLength = Integer.MIN_VALUE;

        int count = 0;
        int resultCount = 0;

        for (int i = end; i < nums.length; i++) {

            if (nums[i] % 2 == 1) {
                countOdd++;
                count = 0;
            }

            while (countOdd == k) {
                count++;
                if (nums[start] % 2 == 1) {
                    countOdd--;
                }
                start++;
            }

            resultCount += count;

        }

        return resultCount;

    }

}