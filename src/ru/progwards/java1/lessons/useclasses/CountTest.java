package ru.progwards.java1.lessons.useclasses;

public class CountTest{
    public static void testInc(int count) {
        for(int i = 0; i < count; i++){
            Count count1 = new Count();
            count1.inc();
            System.out.print(" " + i + " ");
        }
        }

    public static void testDec(int count){
        Count count1 = new Count();
    }
    public static void main(String[] args) {
        testInc(7);
    }
}
