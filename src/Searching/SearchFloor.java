package Searching;
import java.util.*;

public class SearchFloor {

    public static int Floor(int[] arr, int k){
        int lo = 0;
        int hi = arr.length - 1;
        int ans = Integer.MIN_VALUE;

        while(lo <= hi){
            int m = (lo+hi)/2;

            if(arr[m] == k){
                return k;
            }else if(arr[m] < k){
                ans = arr[m];
                lo = m + 1;
            }else{
                hi = m-1;
            }
        }

        return ans;
    }


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        System.out.print(Floor(arr, k));

    }
}


/*
    Given a sorted array of n integers and a number k, Return floor(k).

    Floor is maximum integer just less than or = to k

    Input
     9
    -4 3 4 7 10 11 12 15 19
     5

*/