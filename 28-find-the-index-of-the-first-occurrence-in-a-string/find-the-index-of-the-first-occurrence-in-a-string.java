class Solution {
    public int strStr(String haystack, String needle) {
        for(int i = 0, j = needle.length(); j<=haystack.length(); i++,j++){
            if(haystack.substring(i,j).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}

// class Solution {
//     public int strStr(String haystack, String needle) {

//         String s = "";

//         for (int i = 0; i < needle.length(); i++) {
//             s += haystack.charAt(i);
//         }
        
//         if (s.equals(needle)) {
//             return 0;
//         }

//         for (int start = 1, end = needle.length(); end < haystack.length(); start++, end++) {

//             s += haystack.charAt(end);  // leetc
//             s = s.substring(1);  // leetc

//             if (s.equals(needle)) {
//                 return start;
//             }

//         }

//         return -1;
        
//     }
// }