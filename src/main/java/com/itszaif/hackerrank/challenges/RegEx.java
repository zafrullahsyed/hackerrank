package com.itszaif.hackerrank.challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        Pattern pattern = Pattern.compile("^[a-zA-Z][a-zA-Z\\d_]{7,29}+");

        Scanner intInput = new Scanner(System.in);
        int inputSize = Integer.parseInt(intInput.nextLine());

        for (int i = 1; i <= inputSize; i++) {
            String s = intInput.nextLine();
            stringList.add(s);
        }

        for (String s : stringList) {
            Matcher matcher = pattern.matcher(s);
            if (matcher.matches()) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
