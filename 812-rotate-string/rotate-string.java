class Solution {
    public static boolean rotateString(String s, String goal) {

        for (int i=0; i<s.length(); i++) {
            if (rotate(s, i).equals(goal)) {
                return true;
            }

        }

        return false;

    }

    public static String rotate(String s, int k) {

        s = reverse(s, 0, s.length() - 1);
        s = reverse(s, 0, k);
        s = reverse(s, k+1, s.length() - 1);
        return s;

    }

    public static String reverse(String s, int start, int end) {

        char[] c = s.toCharArray();

        while(start < end) {
            char temp = c[end];
            c[end] = c[start];
            c[start] = temp;
            start++;
            end--;
        }

        String revString = "";

        for (char ch : c) {
            revString += ch;
        }

        return revString;

    }
}