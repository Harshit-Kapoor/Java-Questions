class Solution {
    
        public static boolean checkChars(String s1, String s2) {

        HashSet<Character> set1 = new HashSet<Character>();
        HashSet<Character> set2 = new HashSet<Character>();

        for(int i=0; i < s1.length(); i++) {
            set1.add(s1.charAt(i));
        }

        for(int i=0; i < s2.length(); i++) {
            set2.add(s2.charAt(i));
        }

        int[] arr = new int[126];

        for (char c: set1) {
            arr[c] = arr[c] + 1;
        }

        for (char c: set2) {
            arr[c] = arr[c] - 1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }

        return true;

    }

    public static int similarPairs(String[] words) {

        int count = 0;

        for (int i=0; i<words.length; i++) {

            for (int j=i+1; j<words.length; j++) {

                if (checkChars(words[i], words[j])) {
                    count++;
                }

            }

        }

        return count;

    }

}