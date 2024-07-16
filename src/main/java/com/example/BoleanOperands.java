package com.example;

import java.util.Arrays;

public class BoleanOperands {
    public static void main(String[] args) {
        int[] listOfNumbers = new int[] {-100, -50, -10, 0, 10, 22, 40, 100, 240, 333};
        System.out.println(Arrays.toString(listOfNumbers));

        // AND &&
        for (int i : listOfNumbers) {
            // AND &&
//            if (i >= -10 && i <= 100 ) {
//                System.out.println(i);
//            }

            // OR ||
//            if (i == 0 || i == 333) {
//                System.out.println(i);
//            }

            // !=
            if (i != 100) {
                System.out.println(i);
            }
        }
    }

}
