class Solution {
    public int largestAltitude(int[] gain) {
 
        int max = 0;
        int currSum = 0;
        for(int i = 0; i < gain.length; i ++){
            currSum += gain[i];
            if(currSum > max){
                max = currSum;
            }
        }
        return max;
        
    }
}