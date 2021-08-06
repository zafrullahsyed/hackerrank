package com.itszaif.hackerrank.challenges;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-strings-introduction/problem
 */
public class StringsIntroduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        String second = sc.next();
        boolean isBigger = first.compareTo(second) > 0;

        String firstUpper = first.substring(0, 1).toUpperCase().concat(first.substring(1));
        String secondUpper = second.substring(0, 1).toUpperCase().concat(second.substring(1));

        System.out.println(first.concat(second).length());
        System.out.println(isBigger ? "Yes" : "No");
        System.out.println(firstUpper + " " + secondUpper);
    }
}
