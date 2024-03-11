package HashMaps;

import java.util.PriorityQueue;

public class SortKSortedArray {

    public static void main(String[] args) {

        int[] arr = {2, 3, 1, 4, 6, 7, 5, 8, 9};

        int k = 2;

        // elements are shuffled by k -> either 2 left or right

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // create  a funnel using priority queue of length k, and then iterate from k+1 to n

        for (int i=0; i<=k; i++) {
            pq.add(arr[i]);
        }

        for (int i=k+1; i<arr.length; i++) {
            System.out.println(pq.remove());
            pq.add(arr[i]);
        }

        while(pq.size() > 0) {
            System.out.println(pq.remove());
        }

    }

}
