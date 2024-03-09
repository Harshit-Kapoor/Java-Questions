package Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LongestRepeatingSequence {

    public static List<String> allSubstrings(String s) {

        List<String> lst = new ArrayList<String>();

        for (int i=0; i<s.length(); i++) {
            for (int j=i+1; j<=s.length(); j++) {
                lst.add(s.substring(i, j));
            }
        }

        System.out.println(lst);

        return lst;
    }

    public static List<String> repeatingSubstrings(List<String> l) {

        List<String> lst = new ArrayList<String>();

        HashMap<String, Integer> fm = new HashMap<String, Integer>();

        for (int i=0; i<l.size(); i++) {
            if (fm.containsKey(l.get(i))) {
                fm.put(l.get(i), fm.get(l.get(i)) + 1);
            } else {
                fm.put(l.get(i), 1);
            }
        }

        System.out.println(fm);

        for (String k: fm.keySet()) {
            if (fm.get(k) > 1) {
                lst.add(k);
            }
        }

        System.out.println(lst);

        return lst;
    }

    public static List<String> sortList(List<String> l) {

        String[] arr = new String[l.size()];

        for (int i = 0; i < l.size(); i++)
            arr[i] = l.get(i);

        for (int i=0; i<arr.length-1; i++) {
            for (int j=0; j<arr.length-1; j++) {
                if (arr[j].length() > arr[j+1].length()) {
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

        return List.of(arr);

    }

    public static void solution(String s) {

        List<String> lst = allSubstrings(s);
        List<String> lst1 = repeatingSubstrings(lst);
        List<String> lst2 = sortList(lst1);
        System.out.println(lst2.get(lst2.size()-1));

    }

    public static void main(String[] args) {
        String s = "abdfaabdfh";
        solution(s);
    }

}
