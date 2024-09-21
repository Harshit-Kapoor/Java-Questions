class Solution {
    public int singleNumber(int[] nums) {
        
        if (nums.length == 1) {
            return nums[0];
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i=0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                return key;
            }
        }
        
        return -1;
        
    }
}