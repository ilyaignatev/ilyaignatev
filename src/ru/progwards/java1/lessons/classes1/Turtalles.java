package ru.progwards.java1.lessons.classes1;
import java.util.Arrays;

public class Turtalles {
    public int maxPlusMin(int[] a){
        if(a.length == 0){
            return 0;
        }
        if(a[0] == a.length){
            return a[0];
        }
        else
        Arrays.sort(a);
        return a[0] + a[a.length - 1];
    }

    public static void main(String[] args) {
Turtalles t1 = new Turtalles();
int[]a = {1,2,5};
        System.out.println(t1.maxPlusMin(a));
    }
}
