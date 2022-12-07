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
        return String.valueOf(hours + ":" + minutes + ":" + seconds);
    }
    public int toSeconds(){
        return hours * 60 * 60 + minutes * 60 + seconds;
    }
    public int secondsBetween(Time time) {
        Time t1 = new Time(4,40,50);
        Time t2 = new Time(6,40,35);
        return Math.abs(t2.toSeconds() - t1.toSeconds())/1000;
    }
    public static void main(String[] args) {
    }
}

