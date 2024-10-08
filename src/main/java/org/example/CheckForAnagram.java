package org.example;

import java.util.Arrays;

public class CheckForAnagram {
    public static void main(String[] args) {
        boolean out = areAnagrams("adda", "aadd");
        System.out.println(out);
    }

    public static boolean areAnagrams(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

}
