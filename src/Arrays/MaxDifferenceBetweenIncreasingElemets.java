package Arrays;

public class MaxDifferenceBetweenIncreasingElemets {

    public static int maximumDifference(int[] nums) {

        int ans = -1, minTillNow = nums[0];

        for (int j = 1; j < nums.length; j++) {

            if (nums[j] > minTillNow) {
                ans = Math.max(ans, nums[j] - minTillNow);
            }

            minTillNow = Math.min(minTillNow, nums[j]);

        }

        return ans;

    }

    public static void main(String[] args) {

        int[] nuns = {7, 1, 5, 4};

        System.out.println(maximumDifference(nuns));

    }
}


