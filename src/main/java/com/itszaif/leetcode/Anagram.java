package com.itszaif.leetcode;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        String firstString = "a";
        String secondString = "ab";
        isAnagram(firstString, secondString);
    }

    private static boolean isAnagram(String firstString, String secondString) {
        char[] firstCharArray = firstString.toCharArray();
        char[] secondCharArray = secondString.toCharArray();

        if (firstCharArray.length != secondCharArray.length) {
            return false;
        }

        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char c : firstCharArray) {
            int intial = 1;
            if (!hashMap.containsKey(c)) {
                hashMap.put(c, intial);
            } else {
                Integer existingValue = hashMap.get(c);
                hashMap.put(c, existingValue + 1);
            }
        }

        for (char c : secondCharArray) {
            if (hashMap.containsKey(c)) {
                Integer i = hashMap.get(c);
                hashMap.put(c, i - 1);
                Integer currentValue = hashMap.get(c);
                if (currentValue == 0) {
                    hashMap.remove(c);
                }
            }
        }
        return hashMap.isEmpty();
    }
}
