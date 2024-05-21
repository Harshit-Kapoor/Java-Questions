class Solution {
	boolean isPalindrome(String s, int i, int j) {
		while(i<j) {
			if(s.charAt(i) == s.charAt(j)) {
				i++;
				j--;
			} else return false;
		}
		return true;
	}
    
    
    public boolean validPalindrome(String s) {
        int n = s.length();
		int i=0;
		int j=n-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				//either delete s[i] or s[j]
				if(isPalindrome(s, i, j-1) || isPalindrome(s, i+1, j)) {
					return true;
				} else return false;
			} else {
				i++;
				j--;
			}
		}
		return true;
    }
}