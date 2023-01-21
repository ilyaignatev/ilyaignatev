package ru.progwards.java1.lessons.arrays2;

import java.util.Arrays;

public class IntArrays {
    public static String toString(int []a){
        System.out.print("[");;
        for (int i = 0; i < a.length; i++) {
            if(i > 0){
                System.out.print(", ");
            }
            System.out.print(a[i]);
        }
        System.out.print("]");
        return a.toString();
    }

    public static boolean equals1(int[] a1, int[] a2){
        if(a1 == a2 && a1.length == a2.length){
            return false;
        }
        else {
            return true;
        }
    }
    public static boolean equals2(int[] a1, int[] a2){
        return Arrays.equals(a1, a2);
    }

    public static void main(String[] args) {
        int[]ab = {34,124,5,7,2,5,7};
        System.out.println(toString(ab));
    }
}

