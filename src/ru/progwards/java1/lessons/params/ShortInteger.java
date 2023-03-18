package ru.progwards.java1.lessons.params;

public class ShortInteger extends AbsInteger{
    short num;
    public ShortInteger(short num){
        this.num = num;
    }
    @Override
    public String toString(){
        String str = String.valueOf(num);
        return str;
    }
    @Override
    public int get(){
        return num;
    }
}
