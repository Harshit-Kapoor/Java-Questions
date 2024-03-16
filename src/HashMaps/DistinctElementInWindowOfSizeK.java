package HashMaps;

import java.util.ArrayList;
import java.util.HashMap;

public class DistinctElementInWindowOfSizeK {

    public static void main(String[] args) {

        int[] arr = {2, 5, 5, 6, 3, 2, 3, 2, 4, 5, 2, 2, 2, 2, 5, 6};
        int k = 4;

        HashMap<Integer, Integer> fmap = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        int i = 0;
        while (i <= k - 2) {
            fmap.put(arr[i], fmap.getOrDefault(arr[i], 0) + 1);
            i++;
        }

        i--;
        int j = -1;                                      // this pointer is for release

        while(i < arr.length -1) {
            i++;
            fmap.put(arr[i], fmap.getOrDefault(arr[i], 0) + 1);    // acquire

            list.add(fmap.size());                      // work

            j++;
            int freq = fmap.get(arr[j]);                // release use j
            if (freq == 1) {
                fmap.remove(arr[j]);
            } else {
                fmap.put(arr[j], freq - 1);
            }

        }

        System.out.println(list);

    }
}

/*
    distinct elements in each window of size k
    create frq hashmap and store distinct elements of every window, using aquire, work, release

    first work for k-1 elements, then acquire, work, release
*/

