package com.itszaif.hackerearth;

import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputLimit = scanner.nextInt();
        int reminder = 0;

        for (int i = 0; i < inputLimit; i++) {
            reminder = scanner.nextInt()%10;
        }

        if (reminder %10 == 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
