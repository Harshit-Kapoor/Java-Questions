class Solution {
    
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    
    
/**    public static int removeDuplicates(int[] nums) {


         HashMap<Integer, Integer> map = new HashMap<>();
         int index = 0;
         for(int num:nums){
            if(!map.containsKey(num)){
                nums[index++] = num;
                map.put(num,num);
            }
         }

         return index;
    }
    
     */
    }
}
