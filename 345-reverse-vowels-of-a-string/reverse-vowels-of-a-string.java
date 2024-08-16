class Solution {
    
     public static boolean isVowel(char c) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                return true;
            }
            return false;
        }

        public static String reverseVowels(String s) {

            int start = 0;
            int end = s.length() - 1;

            StringBuilder sb = new StringBuilder(s);

            while (start < end) {

                if (isVowel(s.charAt(start)) == true && isVowel(s.charAt(end)) == true) {
                    char temp = sb.charAt(start);
                    sb.setCharAt(start, sb.charAt(end));
                    sb.setCharAt(end, temp);
                    start++;
                    end--;
                }

                else if (isVowel(s.charAt(start)) == true && isVowel(s.charAt(end)) == false) {
                    end--;
                }

                else if (isVowel(s.charAt(start)) == false && isVowel(s.charAt(end)) == true) {
                    start++;
                }

                else if (isVowel(s.charAt(start)) == false && isVowel(s.charAt(end)) == false) {
                    start++;
                    end--;
                }

            }

            return sb.toString();

        }
}