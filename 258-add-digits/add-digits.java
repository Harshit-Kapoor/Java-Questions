class Solution {
    public static int addDigits(int num) {
        while(num>=10) {
			/*
			Find current digit sum at each step until
			digit sum reaches a value <= 9.
			*/
            int currSum = 0;
            while(num>0) {
                currSum += num%10;
                num /= 10;
            }
            num = currSum;
        }
        return num;
    }
}