class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
         
        Set<Integer> set=new HashSet<>();
            
         for(int i=0;i<nums.size();i++){
             
            for(int j=0;j<nums.get(i).size()-1;j++){
             
               int left=nums.get(i).get(j);
               int right=nums.get(i).get(j+1);
               
                while(left<=right){
                   set.add(left);
                   left++;
               }
                
            }
        }
        
       return set.size();
        
    }
}