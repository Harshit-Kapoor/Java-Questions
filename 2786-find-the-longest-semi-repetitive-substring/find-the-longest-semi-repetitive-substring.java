class Solution {
    
    public int longestSemiRepetitiveSubstring(String s) {
        int l=0,r=0;
        int count=0;
        int ans=1;
        while(r<s.length()-1 && l<=r){
            r++;
            if(s.charAt(r)==s.charAt(r-1)) count++;
            while(count>=2){
                l++;
                if(s.charAt(l)==s.charAt(l-1)) count--;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
    
    public static boolean isValid(String str) {

        int pair = 0;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                pair++;
            }
        }

        return pair <= 1;
    }

    public static int longestSemiRepetitiveSubstring1(String s) {

        int max = 0;

        for (int i = 0; i < s.length(); i++) {

            StringBuffer str = new StringBuffer();

            for (int j = i; j < s.length(); j++) {

                str.append(s.charAt(j));

                if (isValid(str.toString())) {
                    max = Math.max(max, j - i + 1);
                }

            }
        }
        return max;
    }
}