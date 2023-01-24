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
        int b = 0;
        if(a1.length != a2.length){
            return false;
        }
        for(int i = 0; i < a1.length; i++){
            for (int j = 0; j < a1.length; j++){
                if(a1[i] == a2[j]){
                    b++;
                }
            }
        }if(b != a1.length){
            return false;
        }
        return true;
    }
    public static boolean equals2(int[] a1, int[] a2){
        return Arrays.equals(a1, a2);
    }

    public static void main(String[] args) {
        int[]ab = {34,124,5,7,2,5,7};
        System.out.println(toString(ab));
        int[]b1 = {1,2,3};
        int[]b2 = {1,3,5};
        int[]b3 = {1,2,3};
        int[]b4 = {1,3,2};
        System.out.println(equals2(b3,b4));
        System.out.println(equals1(b1,b2));
    }
}

