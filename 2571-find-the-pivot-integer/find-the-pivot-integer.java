class Solution {
    public static int pivotInteger(int n) {
        int[] left = new int[n];

        for (int i = 0; i < n; i++) {
            left[i] = i + 1;
        }

        System.out.println(Arrays.toString(left));

        for (int i = 1; i < n; i++) {
            left[i] += left[i - 1];
        }

        System.out.println(Arrays.toString(left));

        int[] right = new int[n];

        for (int i = 0; i < n; i++) {
            right[i] = i + 1;
        }

        System.out.println(Arrays.toString(right));
        
        for (int i = n - 2; i >= 0; i--) {
            right[i] += right[i + 1];
        }

        System.out.println(Arrays.toString(right));

        for (int i = 0; i < n; i++) {
            if (left[i] == right[i]) {
                return i + 1;
            }
        }

        return -1;
    }

}