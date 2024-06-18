class Solution {
//     public void reverseString(char[] s) {
        
//         int start = 0;
//         int end = s.length-1;
        
//         while(start < end) {
            
//             char temp = s[start];
//             s[start] = s[end];
//             s[end] = temp;
            
//             start++;
//             end--;
            
//         }
        
//         System.out.print(Arrays.toString(s));
        
//     }
    
    public void reverseString(char[] s) {
        solve(s, 0, s.length-1);  
    }
    
    public void solve(char[] s, int start, int end){
        if(start>=end)return; //base case
        swap(s, start, end);
        solve(s, ++start, --end);
    }
    
    public void swap(char[] s, int i, int j){
        char tmp = s[i];
        s[i] = s[j];
        s[j] = tmp;
    }
}