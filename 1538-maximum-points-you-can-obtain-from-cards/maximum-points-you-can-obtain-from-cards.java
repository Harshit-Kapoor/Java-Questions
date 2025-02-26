class Solution {
    public int maxScore(int[] arr, int k) {

        int leftSum = 0;

        for (int i = 0; i<k; i++) {
            leftSum += arr[i];
        }

        int maxSum = leftSum;

        for (int i=0; i<k; i++) {

            leftSum -= arr[k - 1 - i];
            leftSum += arr[arr.length - 1 - i];

            maxSum = Math.max(maxSum, leftSum);

        }

        return maxSum;
        

        
        
    }
}


