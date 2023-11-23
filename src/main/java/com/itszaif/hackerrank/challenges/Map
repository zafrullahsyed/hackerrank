package com.itszaif.hackerrank.challenges;

import java.util.HashMap;
import java.util.Scanner;

public class JavaMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxNum = sc.nextInt();
        sc.skip("[\r\n]+");

        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < maxNum; i++) {
            map.put(sc.nextLine(), sc.nextLine());
        }

        while (sc.hasNext()) {
            String s = sc.nextLine();

            if (map.containsKey(s)) {
                System.out.println(s + "=" + map.get(s));
            }
            else {
                System.out.println("Not found");
            }
        }
        sc.close();
    }
}
