package ru.progwards.java1.lessons.classes1;

import java.time.LocalTime;

public class Time {
    int hours;
    int minutes;
    int seconds;
    public Time(){
        int hours = 0;
        int minutes = 0;
        int seconds = 0;
    }
    public Time(int hours,int minutes,int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public String toString(){
        LocalTime time = LocalTime.of(1, 30, 5);
        return String.valueOf(time);
    }

    public static void main(String[] args) {

    }
}

