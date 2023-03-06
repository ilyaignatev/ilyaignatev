package ru.progwards.java1.lessons.interfaces2;

public class ArraySort {
    public static void sort(CompareWeight[] a) {
        CompareWeight temp;
        for(int i = 0; i < a.length; i++){
            for(int j = i ; j < a.length; j++){
                if(a[i].getWeight() > a[j].getWeight()){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
