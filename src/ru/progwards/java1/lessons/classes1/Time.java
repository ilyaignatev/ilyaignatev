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
        this.hours = 3;
        this.minutes = 15;
        this.seconds = 30;
        return "0" + hours + ":"  + minutes + ":" + seconds;
    }
    public int toSeconds(){

        return hours * 60 * 60 + minutes * 60 + seconds;
    }
    public long secondsBetween(Time time){
    return 0;
    }

    public static void main(String[] args) {
    }
}

