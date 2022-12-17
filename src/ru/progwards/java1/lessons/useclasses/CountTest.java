package ru.progwards.java1.lessons.useclasses;

public class CountTest{
    Count count1 = new Count(0);
    public static boolean testInc(int count){
        Count count1 = new Count(0);
        System.out.println(count1);
        return count1.dec();
    }
    public static void main(String[] args) {
        System.out.println(testInc(7));
    }
}
