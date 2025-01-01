class Solution {
    public static int addDigits(int num) {

        while (num >= 10) {

            num = findSum(num);

        }

        return num;
    }

    private static int findSum(int num) {

        int sum = 0;

        while (num > 0) {
            sum = sum + (num % 10);
            num = num / 10;
        }

        return sum;
    }

}