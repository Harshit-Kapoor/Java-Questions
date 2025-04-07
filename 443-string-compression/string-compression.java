class Solution {

    public static int compress(char[] chars) {

        int currIndex = 0;
        int index = 0;

        while (currIndex < chars.length) {

            char currChar = chars[currIndex];
            int count = 0;

            while (currIndex < chars.length && currChar == chars[currIndex]) {
                currIndex++;
                count++;
            }

            chars[index++] = currChar;
            if (count > 1) {

                for (char c : String.valueOf(count).toCharArray()) {
                    chars[index++] = c;
                }

            }

        }

        return index;

    }
    
}