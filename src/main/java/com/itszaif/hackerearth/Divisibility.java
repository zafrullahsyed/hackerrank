package com.itszaif.hackerearth;

import java.util.Arrays;
import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputLimit = scanner.nextInt();
        int inputLimitas = 0;

        for (int i = 0; i < inputLimit; i++) {
            inputLimitas = scanner.nextInt()%10;
        }

        if (inputLimitas %10 == 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
