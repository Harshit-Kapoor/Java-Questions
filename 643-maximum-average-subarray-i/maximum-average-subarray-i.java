class Solution {
        
    public static double findMaxAverage(int[] nums, int k) {

        int[] prefixSum = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            prefixSum[i] = (i == 0) ? nums[i] : nums[i] + prefixSum[i - 1];
        }

        System.out.println(Arrays.toString(prefixSum));

        double maxAvg = (double) prefixSum[k - 1] / k;

        for (int start = 1; start <= nums.length - k; start++) {

            int end = start + k - 1;

            int sum = prefixSum[end] - prefixSum[start - 1];

            double avg = (double) sum / k;

            maxAvg = Math.max(maxAvg, avg);

            avg = 0;

        }

        return maxAvg;
    }
}