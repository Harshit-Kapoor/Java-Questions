package Arrays;

import java.util.Arrays;

public class MaxElementApartfromNum {

    public static void main(String[] args) {

        int[] arr = {2, 1, 3, 5, 4, 5, 7, 6};
        int[] queries = {2, 4, 6, 0, 3};

        int N = arr.length;
        int[] prefix = new int[N];
        int[] suffix = new int[N];

        // prefix array

        for (int i = 0; i < N; i++) {
            prefix[i] = i == 0 ? arr[i] : Math.max(arr[i], prefix[i - 1]);
        }

        System.out.println(Arrays.toString(prefix));

        // suffix array

        for (int i = N - 1; i >= 0; i--) {
            suffix[i] = i == N - 1 ? arr[N - 1] : Math.max(arr[i], suffix[i + 1]);
        }

        System.out.println(Arrays.toString(suffix));

        for (int id : queries) {

            int ans = 0;

            if (id == 0) {
                ans = suffix[1];
            } else if (id == N - 1) {
                ans = prefix[N - 2];
            } else {
                ans = Math.max(prefix[id - 1], suffix[id + 1]);
            }

            System.out.println(ans);

        }

    }

}


