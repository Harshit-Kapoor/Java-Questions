package Arrays;

import java.util.Arrays;

public class PrefixMaxArray {

    public static void main(String[] args) {

        int[] arr = {2, 1, 3, 5, 4, 5, 7, 6};

        int[] ans = new int[arr.length];

        ans[0] = arr[0];

        for (int i=1; i<arr.length; i++) {
            ans[i] = Math.max(ans[i-1], arr[i]);
        }

        System.out.println(Arrays.toString(ans));

    }
}
