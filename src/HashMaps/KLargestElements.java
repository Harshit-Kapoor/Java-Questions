package HashMaps;

import java.util.PriorityQueue;

public class KLargestElements {

    public static void main(String[] args) {

        int[] arr = {2, 10, 5, 17, 7, 18, 6, 4};

        int k = 3;                // op = 10 17 18

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            if (i < k) {
                pq.add(arr[i]);
            } else {
                if (arr[i] > pq.peek()) {
                    pq.remove();
                    pq.add(arr[i]);
                }
            }

        }

        while(pq.size() > 0) {
            System.out.println(pq.peek());
            pq.remove();
        }
    }

}
