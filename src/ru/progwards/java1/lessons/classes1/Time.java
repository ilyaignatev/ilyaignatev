package ru.progwards.java1.lessons.classes1;

import java.time.LocalTime;

public class Time {
    int hours;
    int minutes;
    int seconds;
    public Time(){
        hours = 0;
        minutes = 0;
        seconds = 0;
    }
    public Time(int hours,int minutes,int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public String toString(){
        LocalTime time = LocalTime.of(1, 30, 5);
        System.out.println(time);
        return null;
    }
    public int toSeconds(){
        return hours * 60 * 60 + minutes * 60 + seconds;
    }
    public long secondsBetween(Time time){
        Time oldtime = new Time(4,5,20);
        Time newtime = new Time(6,16,35);
        long second = (newtime.secondsBetween(6,16,35)- oldtime.secondsBetween(4,5,20))/1000;
        return second;
    }

    private long secondsBetween(int i, int i1, int i2) {
        return 0;
    }

    public static void main(String[] args) {
    }
}

