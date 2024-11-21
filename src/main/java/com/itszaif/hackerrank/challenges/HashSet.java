package com.itszaif.hackerrank.challenges;

import java.util.Scanner;

public class HashSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxsize = scanner.nextInt();
        scanner.nextLine();
        java.util.HashSet<String> stringSet = new java.util.HashSet<>();

        for (int i = 0; i < maxsize; i++) {
            String input = scanner.nextLine();
            stringSet.add(input);
            System.out.println(stringSet.size());
        }
    }
}
