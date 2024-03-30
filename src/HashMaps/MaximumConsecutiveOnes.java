package HashMaps;

public class MaximumConsecutiveOnes {

    public static void main(String[] args) {

        int[] arr = {1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1};

        int ans = 0;
        int j = -1;
        int k = 2;
        int countOfZero = 0;

        for (int i = 0; i<arr.length; i++) {

            if (arr[i] == 0) {
                countOfZero++;
            }

            while (countOfZero > k) {            // becomes invalid bcz 0's are > than k so npow release
                j++;
                if (arr[j] == 0) {
                    countOfZero--;
                }
            }

            // at the moment window has k 0's, so can calculate ans

            int len = i - j;
            if (len>ans) {
                ans = len;
            }
        }

        System.out.println(ans);

    }
}

/*
    Length of longest subarrays with all 1 where k flipping of 0's is allowed
*/
