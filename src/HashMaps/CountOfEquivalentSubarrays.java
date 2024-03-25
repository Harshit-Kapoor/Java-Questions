package HashMaps;

import java.util.HashMap;
import java.util.HashSet;

public class CountOfEquivalentSubarrays {

    public static void main(String[] args) {

        int[] arr = {2, 5, 3, 5, 2, 4, 1, 3, 1, 4};

        HashSet<Integer> set = new HashSet<>();

        for (int e: arr) {
            set.add(e);
        }

        int k = set.size();

        int i = -1;
        int j = -1;
        int ans = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        while (true) {
            boolean f1 = false;
            boolean f2 = false;

            while (i < arr.length - 1) {
                i++;
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
                if (map.size() == k) {
                    ans += arr.length - i;
                    break;
                }
                f1 = true;
            }

            while (j < i) {
                j++;
                if (map.get(arr[j]) == 1) {
                    map.remove(arr[j]);
                } else {
                    map.put(arr[j], map.get(arr[j]) - 1);
                }

                if (map.size() == k) {
                    ans += arr.length - i;
                } else if (map.size() < k) {
                    break;
                }
                f2 = true;
            }
            if (f1 == false && f2 == false) {
                break;
            }
        }
        System.out.println(ans);
    }
}

/*
    Q - Count of sub arrays which  has same number of distinct element as whole array

    iterate array and count distinct element using set

    iterate array and put in freq hashmap till we get k distinct element

    at this point we will get the count of subarrays with same distinct element, count will be size of array - i;

    now release and check again if distinct element count is same then again add arr.len - i;

    will release till size is not equal to total dist elem of arr
*/
