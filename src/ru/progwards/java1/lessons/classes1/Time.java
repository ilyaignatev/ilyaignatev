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
    public int secondsBetween(Time time){
    return (hours *60 * 60 + minutes * 60 + seconds) + ((this.hours+this.minutes+this.seconds)*3600);
    }

    public static void main(String[] args) {
    }
}

