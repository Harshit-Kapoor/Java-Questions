package HashMaps;

import java.util.PriorityQueue;

public class PriorityQueueTopic {

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 1, 3, 8, 5, 9, 11, 65, 32, 55};

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int e : arr) {
            pq.add(e);
        }

        while(pq.size() > 0) {
            System.out.println("Peek " + pq.peek());
            System.out.println("Remove " + pq.remove());
        }

        int count = pq.size();
        int i = 0;
        while(i < count-2) {
            pq.remove();
            i++;
        }

        System.out.println(pq.peek());

    }

}
