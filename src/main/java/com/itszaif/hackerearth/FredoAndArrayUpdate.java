package com.itszaif.hackerearth;

import java.util.Arrays;
import java.util.Scanner;

public class FredoAndArrayUpdate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();

        int[] arraySize = new int[inputNum];

        for (int i = 0; i < inputNum; i++) {
            arraySize[i] = sc.nextInt();
        }
        int initialSum = Arrays.stream(arraySize).parallel().reduce(0, Integer::sum);

        int a = 1;
        int reduce = 0;
        while (reduce < initialSum){

            int tempVar = a;
            reduce = Arrays.stream(Arrays.stream(arraySize).map(i -> tempVar).toArray()).parallel().reduce(0, Integer::sum);
            if (reduce > initialSum){
                break;
            }
            a++;
        }
        System.out.println(a);
    }
}
