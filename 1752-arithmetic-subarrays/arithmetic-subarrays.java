class Solution {
    public static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {

        ArrayList<Boolean> answer = new ArrayList<Boolean>();

        int m = l.length;

        for (int i = 0; i < m; i++) {

            boolean b = true;

            int[] calculationArray = Arrays.copyOfRange(nums, l[i], r[i] + 1);

            Arrays.sort(calculationArray);

            int diff = calculationArray[1] - calculationArray[0];

            for (int j = 0; j < calculationArray.length - 1; j++) {
                if (calculationArray[j + 1] - calculationArray[j] != diff) {
                    b = false;
                }

            }

            answer.add(b);

        }

        return answer;

    }
}