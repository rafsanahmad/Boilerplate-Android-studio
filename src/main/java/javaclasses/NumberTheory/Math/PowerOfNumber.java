/*
 * * Power Of Number.java
 *  * Created by Rafsan Ahmad on 10/25/21, 9:50 PM
 *  * Copyright (c) 2021 . All rights reserved.
 *
 */

package javaclasses.NumberTheory.Math;


public class PowerOfNumber {
    static private final String LOG_TAG = PowerOfNumber.class.getSimpleName();
    static double x = 3;
    static double n = -1;

    public static void main(String arg[]) {
        System.out.println("power equals " + pow(x, n));
    }

    public static double pow(double x, double n) {
        double y;

        if (n == 0) {
            return 1;
        } else if (n > 0 && n % 2 == 0) {
            y = Math.pow(x, (n / 2));
            return y * y;
        } else if (n > 0 && n % 2 == 1) {
            y = Math.pow(x, (n - 1));
            return y * x;
        } else {
            return 1 / (Math.pow(x, -1 * n));
        }
    }
}

