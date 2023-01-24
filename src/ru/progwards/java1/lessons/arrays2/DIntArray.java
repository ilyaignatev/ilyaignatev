package ru.progwards.java1.lessons.arrays2;

import java.util.Arrays;

public class DIntArray {
    private int[]DArray;
    public DIntArray(){
        this.DArray = DArray;
    }
    public void add(int num){
        int[]result = Arrays.copyOf(DArray,DArray.length +1);
        result[result.length - 1] = num;
        System.out.println(result);
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
}
