class Solution {
    public static int[] merge2Sorted(int left[], int right[]) {
        int n1 = left.length, n2 = right.length;
        int i = 0, j = 0;

        int ans[] = new int[n1 + n2];
        int k = 0;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                ans[k] = left[i];
                i++;
            } else {
                ans[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            ans[k] = left[i];
            i++;
            k++;
        }

        while (j < n2) {
            ans[k] = right[j];
            j++;
            k++;
        }

        return ans;
    }

    public static int[] sortArray(int[] nums) {
        int n = nums.length;

        if (n == 1)
            return nums;

        int left[] = Arrays.copyOfRange(nums, 0, n / 2); // -> [0, n/2)
        int right[] = Arrays.copyOfRange(nums, n / 2, n); // -> [n/2, n)

        left = sortArray(left); // recursive call to sort the left half
        right = sortArray(right); // recursive call to sort the right half

        return merge2Sorted(left, right);
    }
}