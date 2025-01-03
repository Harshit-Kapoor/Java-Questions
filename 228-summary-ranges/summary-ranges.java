class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();

        if (nums == null || nums.length == 0) {
            return result; // Handle empty input
        }

        int start = nums[0]; // Start of the current range

        for (int i = 1; i < nums.length; i++) {
            // Check if the current number is not consecutive
            if (nums[i] != nums[i - 1] + 1) {
                if (start == nums[i - 1]) {
                    result.add(String.valueOf(start)); // Single number range
                } else {
                    result.add(start + "->" + nums[i - 1]); // Range format
                }
                start = nums[i]; // Update start for the new range
            }
        }

        // Add the last range
        if (start == nums[nums.length - 1]) {
            result.add(String.valueOf(start));
        } else {
            result.add(start + "->" + nums[nums.length - 1]);
        }

        return result;
    }
}


/* class Solution {
    public List<int[]> summaryRanges(int[] nums) {

        List<int[]> l = new ArrayList<>();

        int n = nums[0];

        for (int i = 1; i < nums.length; i++) {

            System.out.println("current element - " + nums[i]);
            System.out.println("previous element - " + nums[i-1]);

            if (nums[i] - nums[i - 1] != 1) {
                if (nums[i - 1] == n) {
                    l.add(new int[]{nums[i - 1]});
                } else {
                    l.add(new int[]{n, nums[i - 1]});
                }
                n = nums[i];
            }

        }

        if (nums[nums.length - 1] - nums[nums.length - 2] != 1) {
            l.add(new int[]{nums[nums.length - 1]});
        }

        if (nums[nums.length - 1] - nums[nums.length - 2] == 1) {
            l.add(new int[]{n, nums[nums.length - 1]});
        }

        return l;

    }
} */