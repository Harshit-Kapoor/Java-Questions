package Arrays;

public class MaxSumSubArrayOfSizeK {

    public static void main(String[] args) {

        int[] arr = {10, 12, 21, 43, 55, 22, 1, 6, 33, 24};

        int n = arr.length, k = 3, currSum = 0;
        int finalAns = 0;

        for (int i = 0; i < k; i++) {
            currSum = currSum + arr[i];
        }

        for (int start=1, end=k; end < n; start++, end++) {
            currSum -= arr[start-1];
            currSum += arr[end];

            finalAns = Math.max(finalAns, currSum);
        }

        System.out.println(finalAns);

    }

}


/*

    Given an array of integers Arr of size N and a number K. Return the maximum sum of a subarray of size K.

    NOTE*: A subarray is a contiguous part of any given array.

    Example 1:

    Input:
    N = 4, K = 2
    Arr = [100, 200, 300, 400]
    Output:
    700
    Explanation:
    Arr3  + Arr4 =700,
    which is maximum.

 */