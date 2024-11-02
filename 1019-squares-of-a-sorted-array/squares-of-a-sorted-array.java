class Solution {
    public int[] sortedSquares(int[] nums) {

        int result[] = new int[nums.length];
        int i = 0;
        int j = nums.length - 1;
        int idx = nums.length - 1;
        
        while (i <= j) {
            
            int val1 = (int) Math.pow(nums[i], 2);
            int val2 = (int) Math.pow(nums[j], 2);
            
            if (val1 > val2) {
                result[idx] = val1;
                i++;
            } else {
                result[idx] = val2;
                j--;
            }
            
            idx--;
            
        }
        
        return result;
        
    }
}