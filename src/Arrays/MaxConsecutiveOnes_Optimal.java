package Arrays;

public class MaxConsecutiveOnes_Optimal {

    public static void main(String[] args) {

        int[] arr = {1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0};

        int curr_one = 0, finalAns = 0;

        for (int n : arr) {
            if (n == 0) {
                curr_one = 0;
            } else {
                curr_one++;
            }

            finalAns = Math.max(curr_one, finalAns);
        }

        System.out.println(finalAns);

    }
}
