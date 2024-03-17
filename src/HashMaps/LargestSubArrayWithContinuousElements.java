package HashMaps;

import java.util.HashSet;

public class LargestSubArrayWithContinuousElements {

    public static void main(String[] args) {

        int[] arr = {9, 2, 7, 5, 6, 23, 24, 22, 23, 19, 17, 16, 18, 39, 0};

        int ans = 0;
        int len = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int max = arr[i];
            int min = arr[i];

            HashSet<Integer> checkDuplicates = new HashSet<>();
            checkDuplicates.add(arr[i]);

            for (int j = i + 1; j < arr.length; j++) {
                if (checkDuplicates.contains(arr[j])) {
                    break;
                }
                checkDuplicates.add(arr[i]);
                max = Math.max(arr[j], max);
                min = Math.min(arr[j], min);

                if (max - min == j - i) {
                    len = j - i + 1;
                    if (len > ans) {
                        ans = len;
                    }
                }
            }
        }
        
        System.out.println(ans);
    }
}

/*

    Trick to find continuous elements in array

    consider 9,8,7 -> check max - min = j - 1

    process, iterate with double loop

    i array take max and min, for j loop take from i+1 till end and check the above formula, if satisfies then its continuous

*/

