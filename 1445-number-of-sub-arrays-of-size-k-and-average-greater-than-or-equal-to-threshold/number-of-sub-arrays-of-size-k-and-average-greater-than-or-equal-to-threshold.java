class Solution {
        public static int numOfSubarrays(int[] arr, int k, int threshold) {

        int count = 0;
        int n = arr.length;
        int i = 0;
        int j = 0;
        int sum = 0;

        while (j < n) {

            sum += arr[j];

            if (j - i + 1 < k) {
                j++;
            }

            else if (j - i + 1 == k) {

                double avg = sum / (double) k;
                if (avg >= threshold) {
                    System.out.println("i = " + i + " j = " + j);
                    count++;
                }

                sum -= arr[i];

                i++;
                j++;
            }


        }

        return count;

    }

}