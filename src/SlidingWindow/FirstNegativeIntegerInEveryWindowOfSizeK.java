package SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class FirstNegativeIntegerInEveryWindowOfSizeK {

    public static void main(String[] args) {

        int[] arr = {2, -1, -7, 8, -15, 30, 16, 28};

        int i = 0;
        int j = 0;
        int k = 3;

        List<Integer> list = new ArrayList<>();

        while (j < arr.length) {

            if (arr[j] < 0) {
                list.add(arr[j]);
            }

            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                if (list.size() == 0) {
                    System.out.print(0 + " ");
                } else {
                    System.out.print(list.get(0) + " ");
                    if (arr[i] == list.get(0)) {
                        list.remove(0);
                    }
                }
                i++;
                j++;
            }

        }


    }

}
