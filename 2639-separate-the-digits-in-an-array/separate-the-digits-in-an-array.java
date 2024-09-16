class Solution {
    
    public static ArrayList<Integer> separation(int number) {
        
        int temp = number;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        while(temp > 0) {
            list.add(temp % 10);
            temp/=10;
        }
        
        Collections.reverse(list);
            
        return list;
    }
    
    public int[] separateDigits(int[] nums) {
        
        ArrayList<Integer> ansList = new ArrayList<>();
        
        for (int i=0; i<nums.length; i++) {
            
            ansList.addAll(separation(nums[i]));
            
        }
        
        int[] ansArray = new int[ansList.size()];
        
        int i = 0;
        for (int e : ansList) {
            ansArray[i] = e;
            i++;
        }
        
        return ansArray;
        
    }
}