package com.itszaif.hackerrank.challenges;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder output = new StringBuilder();

        byte[] bytes = input.getBytes(StandardCharsets.UTF_8);
        for (int i = bytes.length - 1; i >= 0; i--) {
            char c = input.charAt(i);
            output.append(c);
        }
        if (output.toString().compareTo(input) == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
