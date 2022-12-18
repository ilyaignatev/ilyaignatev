package ru.progwards.java1.lessons.useclasses;

public class CountTest{
    private int count;
    public static void testInc(int count){
        Count count1 = new Count();
        }
        public int getCount(){
        return incCount(0);
        }
        public int incCount(int howmuch){
        while(count >= 0){
            count--;
        }
        return (count + howmuch);
        }

    public static void testDec(int count){

    }
    public static void main(String[] args) {
        System.out.println();
    testInc(0);
    testDec(-1);
    }
}
