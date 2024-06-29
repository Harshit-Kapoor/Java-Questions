class Solution {
    public static boolean isValid(String str) {

        int pair = 0;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                pair++;
            }
        }

        return pair <= 1;
    }

    public static int longestSemiRepetitiveSubstring(String s) {

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