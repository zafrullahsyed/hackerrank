package com.itszaif.hackerrank.challenges;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String givenString = scanner.next();
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        System.out.println(givenString.substring(start, end));

    }
}
