package ru.progwards.java1.lessons.arrays1;

import java.util.Arrays;

public class ArraySort {
    public static void sort(int[] a) {
        int stepsCount = a.length - 1;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < stepsCount; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    swapped = true;
                }
            }
            stepsCount--;
        } while (swapped);
    }
}
