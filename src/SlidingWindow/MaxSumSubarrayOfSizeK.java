package SlidingWindow;

public class MaxSumSubarrayOfSizeK {

    public static void main(String[] args) {

        int[] arr = {3, 2, 4, 5, 1, 1, 1, 1, 1, 3, 3};

        int k = 3;
        int i = 0;
        int j = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;

        while (j < arr.length) {
            sum = sum + arr[j];
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                max = Integer.max(sum, max);
                sum = sum - arr[i];
                i++;
                j++;
            }
        }

        System.out.println(max);
    }
}


