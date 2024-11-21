package com.itszaif.hackerrank.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class BigDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxNumber = scanner.nextInt();
        scanner.nextLine();

        ArrayList<java.math.BigDecimal> numberlist = new ArrayList<>();

        for (int i = 0; i < maxNumber; i++) {
            java.math.BigDecimal bigDecimal = scanner.nextBigDecimal();
            numberlist.add(bigDecimal);
        }

        List<java.math.BigDecimal> list = numberlist.stream().sorted().toList();
        System.out.println(list);
    }
}
