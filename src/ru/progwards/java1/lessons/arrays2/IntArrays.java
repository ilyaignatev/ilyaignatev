package ru.progwards.java1.lessons.arrays2;

public class IntArrays {
    public static String toString(int []a){
        IntArrays ia = new IntArrays();
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
        return ia.toString(a);
    }
}
