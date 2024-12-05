class Solution {
    
public static boolean isEnglishLetter(char c) {
    
    if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
        return true;
    }
    
    return false;
    
}    
    
public static String reverseOnlyLetters(String s) {
    
    char[] c = s.toCharArray();
    
    int start = 0;
    int end = c.length - 1;
    
    while (start < end) {
        
        if (isEnglishLetter(c[start]) == true && isEnglishLetter(c[end]) == true) {
            char temp = c[start];
            c[start] = c[end];
            c[end] = temp;
            start++;
            end--;
        } else if (isEnglishLetter(c[start]) == true && isEnglishLetter(c[end]) == false) {
            end--;
        } else if (isEnglishLetter(c[start]) == false && isEnglishLetter(c[end]) == true) {
            start++;
        } else {
            start++;
            end--;
        }
                    
    }
    
    return new String(c);
    
    }
}