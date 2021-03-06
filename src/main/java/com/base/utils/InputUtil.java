package com.base.utils;

import java.util.Arrays;
import java.util.Scanner;

public class InputUtil {
    private static final Scanner scanner = new Scanner(System.in);

    public static void sysout(Object r) {
        System.out.println(r);
    }

    public static void sysexit() {
        System.exit(0);
    }

    public static int[] getIntArray() {

        int n = getRandomInt(10);
        if (n < 3) {
            n += n * 2 + n % 3;
        }
        return getIntArray(n);
    }

    public static int[] getIntArray(int n) {
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            int cItem = (int) (10 * Math.random() + n % 2);
            c[i] = cItem;
        }
        scanner.close();
        return c;
    }

    public static int getRandomInt(int n) {
        return (int) Math.ceil(Math.random() * n);
    }

    public static void swapInts(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(String message, int[] arr) {
        print(message + " - " + Arrays.toString(arr));
    }

    public static void print(int[] arr) {
        print(Arrays.toString(arr));
    }

    public static void print(String str) {
        System.out.println(str);
    }
}
