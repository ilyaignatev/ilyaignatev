package ru.progwards.java1.lessons.arrays2;

import java.util.Arrays;

public class DIntArray {
    private int[]array;
    public DIntArray(){

    }
    public void add(int num){
        int[]array1;
        if(array == null){
            array1 = new int[1];
            array1[0] = num;
        }
        else{
            array1 = new int[array.length + 1];
            System.arraycopy(array,0,array1,0,array.length);
            array1[array.length] = num;
        }
        array = array1;
    }
    public void atInsert(int pos, int num){
        int[]array1;
        if(array == null){
            array1 = new int[1];
            array1[0] = num;
        } else if (array.length -1 < pos) {
            array1 = new int[array.length + 1];
            System.arraycopy(array,0,array1,0,array.length);
            array1[array.length] = num;
        } else{
            array1 = new int[array.length + 1];
            System.arraycopy(array,0,array1,0,array.length);
            array1[array.length] = num;
            System.arraycopy(array,pos,array1,pos+1,array.length - pos);
        }
        array = array1;
    }
    public void atDelete(int pos){
        int[] numsNew = new int[array.length - 1];
        if (array.length - 1 < pos) {
            System.arraycopy(array, 0, numsNew, 0, array.length - 1);
        } else {
            System.arraycopy(array, 0, numsNew, 0, pos);
            System.arraycopy(array, pos + 1, numsNew, pos, array.length - pos - 1);
        }
        array = numsNew;
    }
    public int at(int pos){
        if (array.length - 1 < pos) {
            return Integer.MIN_VALUE;
        }
        return array[pos];
    }

    public static void main(String[] args) {

            }
}
