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
    public int secondsBetween(Time time){
        Time time1 = new Time(4,5,20);
        Time time2 = new Time(6,16,35);
        long seconds = (time2.getTime() - time1.getTime())/1000;
        System.out.println(seconds);
        return (int) seconds;
    }

    private long getTime() {
        return seconds;
    }

    public static void main(String[] args) {
    }
}

