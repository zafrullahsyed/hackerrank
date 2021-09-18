package com.itszaif.hackerearth;

import java.util.Scanner;

public class Zoos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String givenString = sc.next();

        char[] chars = givenString.toCharArray();

        int zCount = 0;
        String substring = null;
        if (givenString.length() <= 20 ){

            for (int i = 0; i < givenString.length(); i++) {
                if (String.valueOf(givenString.charAt(i)).equalsIgnoreCase("z")){
                    zCount++;
                    substring = givenString.substring(zCount);
                }
            }
            if ((substring != null ? substring.length() : 0) == 2 * zCount){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
