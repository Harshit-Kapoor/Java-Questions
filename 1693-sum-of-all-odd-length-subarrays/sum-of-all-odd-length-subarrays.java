class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
             
        int[] prefixSum = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            prefixSum[i] = (i == 0) ? arr[i] : arr[i] + prefixSum[i - 1];
        }

        System.out.println(Arrays.toString(prefixSum));

        ArrayList<Integer> list = new ArrayList<>();

        for (int s = 0; s < arr.length; s++) {

            for (int e = s; e < arr.length; e += 2) {

                if (s != 0) {
                    list.add(prefixSum[e] - prefixSum[s - 1]);
                } else {
                    list.add(prefixSum[e]);
                }

            }

        }

        System.out.println(list);

        int sum = 0;

        for (int e: list) {
            sum+=e;
        }

        return sum;

    }
}
