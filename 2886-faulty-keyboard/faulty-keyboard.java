class Solution {
    
        public static String reverse(String str) {

        char[] ch = str.toCharArray();
        int start = 0;
        int end = ch.length - 1;
        String ans = "";

        while(start < end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }

        for (char c : ch) {
            ans += c + "";
        }

        return ans;

    }

    public static String finalString(String s) {

        String result = "";

        for (int i=0; i<s.length(); i++) {

            if (s.charAt(i) == 'i') {
                result = reverse(result);
            } else {
                result += s.charAt(i) + "";
            }

        }

        return result;

    }

}