package Basics;

import java.util.Arrays;

public class SquareSortedArray {

    public static void main(String[] args) {

        int[] arr = {-6, -1, 2, 4, 5, 7};

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }

        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));

    }

}
