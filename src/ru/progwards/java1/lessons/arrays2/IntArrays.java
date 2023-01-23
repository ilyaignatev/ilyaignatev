package ru.progwards.java1.lessons.arrays2;

import java.util.Arrays;

public class IntArrays {
    public static String toString(int []a){
        String b = "[";
        for (int i = 0; i < a.length; i++) {
            if(i < a.length -1){
                b = b + a[i] + "," + " ";
            }
            if(i == a.length -1){
                b += a[i] + "]";
            }
        }
        return b;
    }

    public static boolean equals1(int[] a1, int[] a2){
        Arrays.sort(a1);
        Arrays.sort(a2);
        for(int i = 0; i < a1.length; i++){
            for (int j = 0; j < a2.length; j++){
                if(a1[i] == a2[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean equals2(int[] a1, int[] a2){
        return Arrays.equals(a1, a2);
    }

    public static void main(String[] args) {
        int[]ab = {34,124,5,7,2,5,7};
        System.out.println(toString(ab));
        int[]b1 = {1,2,3};
        int[]b2 = {1,2,5};
        System.out.println(equals1(b1,b2));
    }
}

