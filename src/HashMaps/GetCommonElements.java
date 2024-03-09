package HashMaps;

import java.util.HashMap;

public class GetCommonElements {

    public static void main(String[] args) {

        int[] arr1 = {1,1,2,2,2,3,5};

        int[] arr2 = {1,1,1,2,2,4,5};          // op = 1, 2, 5

        HashMap<Integer, Integer> hm1 = new HashMap<Integer,Integer>();
        HashMap<Integer, Integer> hm2 = new HashMap<Integer,Integer>();

        for (int i=0; i<arr1.length; i++){
            hm1.put(arr1[i], hm1.getOrDefault(arr1[i], 0) + 1);
        }

        for (int i=0; i<arr2.length; i++){
            hm2.put(arr2[i], hm2.getOrDefault(arr2[i], 0) + 1);
        }

        System.out.println(hm1);
        System.out.println(hm2);

        for (int k: hm1.keySet()){
            if (hm2.containsKey(k)) {
                System.out.println(k);
                hm2.remove(k);
            }
        }

    }

}
