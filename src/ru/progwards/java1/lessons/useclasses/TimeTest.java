package ru.progwards.java1.lessons.useclasses;

public class TimeTest {
    public static void main(String[] args) {
        Time time0 = new Time(0,0,0);
        System.out.println(time0.toString());
        Time time1 = new Time(1,2,3);
        System.out.println(time1.toString());
        Time time2 = new Time(11,12,13);
        System.out.println(time2.toString());
        System.out.println("в time0 " + time0.toSeconds() + " секунд");
        System.out.println("в time1 " + time1.toSeconds() + " секунд");
        System.out.println("в time2 " + time2.toSeconds() + " секунд");
    }
}
