class Solution {
    public boolean hasAllCodes(String s, int k) {
        
        int n = s.length();
        
        HashSet<String> set = new HashSet<>();
        
        for(int i=0;i<=n-k;i++){
        
           String str = s.substring(i,i+k);
           set.add(str);
        
        }
        
        return set.size()==(int)Math.pow(2,k);
    }
}