package Basics;

import java.util.Arrays;

public class ReplaceStringChar {

    public static void main(String[] args) {

        String s1 = "i am happy";
        String s2 = "ipy";   // op = ha
        int[] arr1 = new int[126];
        String ans = "";

//        ans = s1.replace(s2, "");
//
//        System.out.println(ans);


        for (int i = 0; i < s1.length(); i++) {
            arr1[s1.charAt(i)] = arr1[s1.charAt(i)] + 1;
        }

        for (int i = 0; i < s2.length(); i++) {
            arr1[s2.charAt(i)] = 0;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > 0) {
                System.out.print((char) i);
            }
        }

    }
}
