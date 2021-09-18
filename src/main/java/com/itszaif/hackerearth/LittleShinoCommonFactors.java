package com.itszaif.hackerearth;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LittleShinoCommonFactors {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();

        int numCounter = 0;

        Set<Integer> dividers = new HashSet<>();

        for (int i = 1; i <= num1 ; i++) {
            if (num1 % i == 0){
                dividers.add(i);
            }
        }

        for (int i = 1; i <= num2; i++) {
            if (num2 % i == 0){
                dividers.add(i);
            }
        }

        for (int i = 1; i <= dividers.size(); i++) {
            if (num1 % i == 0 && num2 % i == 0){
                numCounter++;
            }
        }
        System.out.println(numCounter);
    }
}
