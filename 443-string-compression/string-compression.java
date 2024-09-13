class Solution {

    public static int compress(char[] chars) {
            
        char prevChar = chars[0];

        StringBuilder sb = new StringBuilder();
        sb.append(prevChar);

        int count = 1;

        for (int i = 1; i < chars.length; i++) {

            if (prevChar == chars[i]) {

                count++;

            } else {

                if (count > 1) {
                    sb.append(count);
                }
                prevChar = chars[i];
                count = 1;
                sb.append(prevChar);
            }

        }

        if (count > 1) {
            sb.append(count);
        }

        String ans = sb.toString();

        char[] c = ans.toCharArray();

        for (int i=0; i<c.length; i++) {
            chars[i] = c[i];
        }

        return sb.length();

    }
    
}