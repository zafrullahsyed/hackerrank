package com.itszaif.hackerrank.challenges;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stringA = sc.nextLine().toLowerCase();
        String stringB = sc.nextLine().toLowerCase();

        char[] stringACharArray = stringA.toCharArray();
        char[] stringBCharArray = stringB.toCharArray();

        Arrays.sort(stringACharArray);
        Arrays.sort(stringBCharArray);

        String a = String.valueOf(stringACharArray);
        String b = String.valueOf(stringBCharArray);

        if (a.equalsIgnoreCase(b)){
            System.out.println("Anagrams");
        }else {
            System.out.println("Not Anagrams");
        }
    }
}
