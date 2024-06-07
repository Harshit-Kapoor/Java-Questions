class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        ArrayList<Integer> lst = new ArrayList<Integer>();
        
        int[] res = new int[nums.length];
        
        for(int i=0; i<nums.length; i++) {
            
            res[nums[i]-1] = nums[i];
            
        }
        
        for(int i=0; i<res.length; i++) {
            if (res[i] != i+1) {
                lst.add(i+1);
            }
        }
        
        return lst;


/* 
        FIRST APPROACH APPROACH - USE ANOTHER ARRAY TO STORE ELEMENTS IN THEIR RESP INDEXES
        
        SECOND APPROACH - MARK RESP INDEXES NEGATIVE
        
        for(int i : nums) {
            
            int index = Math.abs(i);
            
            if (nums[index - 1] > 0) {
                nums[index - 1] *= -1;
            }            
        }    
        
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                res.add(i + 1);
            }
        }
        
        return res;
        
        

*/
        
/*      TL EXCEEDED      
    
        List<Integer> lst = new ArrayList<Integer>();
        
        int count = 0;
        
        for(int i=0; i<nums.length; i++) {
            count++;
        }
        
        for(int i=1; i<=count; i++) {
            
            int numToCheck = i;
            
            boolean b = false;
            
            for(int j=0; j<nums.length; j++) {
                
                if (nums[j] == numToCheck) {
                    b = true;
                }
                                
            }
            
            if (b == false) {
                lst.add(numToCheck);
            }
            
        }
        
        return lst;
*/        
    }
}