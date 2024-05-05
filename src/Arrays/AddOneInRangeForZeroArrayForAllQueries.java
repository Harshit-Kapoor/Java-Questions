package Arrays;

import java.util.Scanner;

public class AddOneInRangeForZeroArrayForAllQueries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();

        int[] arr = {0, 0, 0, 0, 0, 0, 0, 0, 0};

        for (int i = 0; i < Q; ++i) {

            int l = sc.nextInt();
            int r = sc.nextInt();

            // put 1 at l and -1 at r+1 index so that at prefix sum time r+1 ke aage wale gets nullified
            arr[l] = arr[l] + 1;

            if (r + 1 < N) {
                arr[r+1] = arr[r+1] - 1;
            }
        }

        // convert the same array in the prefix sum array

        for (int i=1; i<N; i++) {
            arr[i] = arr[i] + arr[i-1];
        }

        for (int num : arr) {
            System.out.println(num + " ");
        }


    }

}


/*

    Given Queries as left and right (3,6) (3,6) (1,5) (2,8)
    and a all zero element array of size 9

    Add 1 to the elements in the range given for all queries in O(n)

    LC - Range Addition

 */