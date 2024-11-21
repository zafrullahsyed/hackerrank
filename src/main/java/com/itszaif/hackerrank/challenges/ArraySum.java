package com.itszaif.hackerrank.challenges;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxSize = scanner.nextInt();
        scanner.nextLine();

        ArrayList<Integer> intList = new ArrayList<>();

        for (int i = 0; i < intList.size(); i++) {
            intList.add(scanner.nextInt());
        }
        Integer sum = intList.stream().reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
