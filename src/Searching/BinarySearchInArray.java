package Searching;
import java.util.*;

public class BinarySearchInArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        int low = 0;
        int high = n-1;
        boolean ans = false;

        while(low <= high) {
            int mid = (low + high)/2;
            if(arr[mid] == k){
                ans = true;
                break;
            } else if(arr[mid] < k) {
                low = mid+1;
            } else if(arr[mid] > k) {
                high = mid-1;
            }
        }

        System.out.print(ans);

    }
}

/*
    Given a sorted array of n integers and a number k, Return true if k is present otherwise return false.

    Sample Input
    10
    4 7 10 13 15 20 21 24 26 28
    13

 */
