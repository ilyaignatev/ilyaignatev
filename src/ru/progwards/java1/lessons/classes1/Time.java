package ru.progwards.java1.lessons.classes1;


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
        return String.format("%02d:%02d:%02d", hours,minutes,seconds);
    }
    public int toSeconds(){
        return hours * 60 * 60 + minutes * 60 + seconds;
    }
    public int secondsBetween(Time time, Time time2) {
    Time time1 = new Time(4,30,50);
        time2 = new Time(7, 50, 30);
    return secondsBetween(time1,time2);
    }


    public static void main(String[] args) {
    }
}

