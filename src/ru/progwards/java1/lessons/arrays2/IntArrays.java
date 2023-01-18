package ru.progwards.java1.lessons.arrays2;

import java.util.Arrays;

public class IntArrays {
    public static String toString(int []a){
        IntArrays ia = new IntArrays();
        return ia.toString(a);
    }

    public static boolean equals1(int[] a1, int[] a2){
        for (int i =0; i < a1.length; i++){
            if(a1[i] == a2[i]){
                return true;
            }
        }
        return false;
    }
    public static boolean equals2(int[] a1, int[] a2){
        return Arrays.equals(a1, a2);
    }
}

