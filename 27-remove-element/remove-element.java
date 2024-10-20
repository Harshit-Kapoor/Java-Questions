class Solution {
    public int removeElement(int[] nums, int val) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i=0; i<nums.length; i++) {
            
            if (nums[i] != val) {
                list.add(nums[i]);
            }
            
        }
        
        int[] arr = new int[list.size()];
        
        for (int i=0; i<arr.length; i++) {
            nums[i] = list.get(i);
        }
        
        return list.size();
        
    }
}