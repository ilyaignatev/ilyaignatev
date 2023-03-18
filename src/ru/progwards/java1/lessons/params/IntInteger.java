package ru.progwards.java1.lessons.params;

public class IntInteger extends AbsInteger{
    int num;
    public IntInteger(int num){
        this.num = num;
    }
    @Override
    public String toString(){
        String str = String.valueOf(num);
        return str;
    }
    public int get(){
        return num;
    }
}
