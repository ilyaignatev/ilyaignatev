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
        int[] numsNew;
        if(array == null){
            numsNew = new int[1];
            numsNew[0] = num;
        } else if (array.length -1 < pos) {
            numsNew = new int[array.length + 1];
            System.arraycopy(array,0,numsNew,0,array.length);
            numsNew[array.length] = num;
        } else{
            numsNew = new int[array.length + 1];
            System.arraycopy(array,0,numsNew,0,array.length);
            numsNew[array.length] = num;
            System.arraycopy(array,pos,numsNew,pos+1,array.length - pos);
        }
        array = numsNew;
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
