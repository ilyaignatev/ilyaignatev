package ru.progwards.java1.lessons.arrays2;

import java.util.Arrays;

public class DIntArray {
    private int[]array;
    public DIntArray(){
        this.array = array;
    }
    public void add(int num){
        int[]a2 = Arrays.copyOf(array,array.length + 1);
        a2[array.length -1] = num;
        array = Arrays.copyOf(a2,a2.length);

    }
    public void atInsert(int pos, int num){
        System.out.println(pos + num);
    }
    public void atDelete(int pos){
        System.out.println(pos);
    }
    public int at(int pos){
        return pos;
    }

    public static void main(String[] args) {
        DIntArray d1 = new DIntArray();

    }
}
