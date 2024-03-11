package HashMaps;

import java.util.HashMap;

public class ArrayPairDivisibleByK {

    public static void main(String[] args) {

        int[] arr = {77, 22, 56, 11, 45, 34, 78, 29, 23, 55};
        int k = 10;
        boolean ans = true;

        HashMap<Integer, Integer> remFreqMap = new HashMap<>();

        for (int num : arr) {
            int rem = num % k;
            remFreqMap.put(rem, remFreqMap.getOrDefault(rem, 0) + 1);
        }

        for (int num : arr) {
            int rem = num % k;

            if (rem == 0) {
                if (remFreqMap.get(rem) % 2 != 0) {
                    ans = false;
                    break;
                }
            } else if (2 * rem == k) {           // if rem - k / 2  and check its freq is even
                if (remFreqMap.get(rem) % 2 != 0) {
                    ans = false;
                    break;
                }
            } else {                             // if rem = x and k - x,  and check its freq (freq of x and k-x) ka sum is even
                int otherRemFreq = remFreqMap.get(k - rem);
                int frqRem = remFreqMap.get(rem);
                if ((frqRem + otherRemFreq) % 2 != 0) {
                    ans = false;
                    break;
                }
            }
        }

        System.out.println(ans);

    }

}


/*

    Q - Check all pairs can be made which can be divisible by k

    iteate array and create a frequency map of all the remainders, then again iterate array and check those rem's freq which are in map are even or not

    there will be 3 case, check for each case

    1) if rem - 0 and check its freq is even
    2) if rem - k / 2  and check its freq is even
    3) if rem = x and k - x,  and check its freq (freq of x and k-x) ka sum is even

*/
