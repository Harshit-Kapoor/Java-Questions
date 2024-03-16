package HashMaps;

import java.util.HashMap;

public class CountSubArrayWithZeroSum {

    public static void main(String[] args) {

        int[] arr = {2, 8, -3, -5, 2, -4, 6, 1, 2, 1, -3, 4};

        HashMap<Integer, Integer> fhm = new HashMap<>();
        int i = -1;
        int sum = 0;
        int count = 0;

        fhm.put(sum, 1);

        while(i < arr.length - 1) {
            i++;
            sum += arr[i];

            if (fhm.containsKey(sum) == false) {
                fhm.put(sum, 1);
            } else {
                count += fhm.get(sum);
                fhm.put(sum, fhm.get(sum) + 1);
            }

        }

        System.out.println(count);

    }
}

/*

    Q - Count number of sub array with zero sum

    create frequency hashmap of sum and value (unlike in longestSubarrayWithZeroSum where we were taking map of sum and index)

    keep on iterating array and putting prefix sum, if sum if already present in map then increase the value

*/
