package ru.progwards.java1.lessons.arrays2;

public class DIntArray {
    private int[]DArray;
    public DIntArray(){
        this.DArray = DArray;
    }
    public void add(int num){
        for(int i = 0; i < DArray.length; i++){
            System.out.println(i + num);
        }
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
