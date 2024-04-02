package com.itszaif.leetcode;

import java.util.Arrays;

public class AnagramBetterWay {
    public static void main(String[] args) {
        String firstString = "anagram";
        String secondString = "nagaram";
        boolean anagram = isAnagram(firstString, secondString);
        System.out.println(anagram);
    }

    private static boolean isAnagram(String firstString, String secondString) {
        char[] charArray = firstString.toCharArray();
        char[] charArray1 = secondString.toCharArray();

        Arrays.sort(charArray);
        Arrays.sort(charArray1);

        return new String(charArray).equals(new String(charArray1));
    }
}
