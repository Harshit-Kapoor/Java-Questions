class Solution {
    public int nextGreaterElement(int n) {
        char[] digits = String.valueOf(n).toCharArray();
        int i = digits.length - 2;
        
        // Find the first digit that is smaller than the digit next to it
        while (i >= 0 && digits[i] >= digits[i + 1]) i--;
        if (i < 0) return -1;  // If no such digit is found, return -1
        
        int j = digits.length - 1;
        
        // Find the first digit larger than digits[i] from the right
        while (j > i && digits[j] <= digits[i]) j--;
        
        // Swap the found digits
        char t = digits[i];
        digits[i] = digits[j];
        digits[j] = t;
        
        // Reverse the sequence after the position i
        reverse(i + 1, digits.length - 1, digits);
        
        try {
            long result = Long.parseLong(new String(digits));
            return (result <= Integer.MAX_VALUE) ? (int) result : -1;
        } catch (NumberFormatException e) {
            return -1;  // In case of overflow
        }
    }

    private void reverse(int start, int end, char[] digits) {
        while (start < end) {
            char t = digits[start];
            digits[start] = digits[end];
            digits[end] = t;
            start++;
            end--;
        }
    }
}