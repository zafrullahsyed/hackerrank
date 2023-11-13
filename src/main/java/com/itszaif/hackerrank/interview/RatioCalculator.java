package com.itszaif.hackerrank.interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.List;
import java.util.stream.Stream;
public class RatioCalculator {

        /*
         * Complete the 'plusMinus' function below.
         *
         * The function accepts INTEGER_ARRAY arr as parameter.
         */

        public static void main(String[] args) throws IOException {

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> integerList = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .toList();

            double listSize = integerList.size();
            double positiveSize = integerList.stream().filter(integer -> integer.compareTo(0) > 0).count();
            double negativeSize = integerList.stream().filter(integer -> integer.compareTo(0) < 0).count();
            double zeroSize = integerList.stream().filter(integer -> integer.compareTo(0) == 0).count();

            DecimalFormat df = new DecimalFormat("0.000000");
            System.out.println(df.format(positiveSize/listSize));
            System.out.println(df.format(negativeSize/listSize));
            System.out.println(df.format(zeroSize/listSize));

            bufferedReader.close();
        }
    }

