class Solution {
    public static String removeDuplicates(String s) {

        Stack<Character> st = new Stack<Character>();

        st.push(s.charAt(0));

        for (int i=1; i<s.length(); i++) {

            if (st.size() == 0) {
                st.push(s.charAt(i));
                continue;
            }

            if (st.peek() == s.charAt(i)) {
                st.pop();
            } else {
                st.push(s.charAt(i));
            }

        }

        String ans = "";
        String rev = "";

        while (st.size() > 0) {
            ans += st.pop();
        }

        for (int i=ans.length()-1; i>=0; i--) {
            rev += ans.charAt(i) + "";
        }

        return rev;

    }
}