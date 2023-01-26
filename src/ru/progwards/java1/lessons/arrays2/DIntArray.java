package ru.progwards.java1.lessons.arrays2;

import java.net.DatagramSocket;
import java.util.Arrays;

public class DIntArray {
    private int[]array;
    public DIntArray(){
        array = new int[]{};
    }
    public void add(int num){
        int[]arrayCo = Arrays.copyOf(array,array.length +1);
        arrayCo[arrayCo.length -1] = num;
        array = arrayCo;
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

            }
}
