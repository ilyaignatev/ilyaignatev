package ru.progwards.java1.lessons.params;

public class ByteInteger extends AbsInteger {
    byte num;
    public ByteInteger(byte num){
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
