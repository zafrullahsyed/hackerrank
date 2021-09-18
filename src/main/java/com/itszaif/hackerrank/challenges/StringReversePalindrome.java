package com.itszaif.hackerrank.challenges;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class StringReversePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String input = sc.next();
        String input = "test";

        byte[] inputBytes = input.getBytes();

        byte[] reversedStringBytes = new byte[input.length()];

        for (int i = 0; i < inputBytes.length; i++) {

            reversedStringBytes[i] = inputBytes[inputBytes.length-i-1];
        }
        String reversedString = new String(reversedStringBytes);

        System.out.println(reversedString);
    }
}
