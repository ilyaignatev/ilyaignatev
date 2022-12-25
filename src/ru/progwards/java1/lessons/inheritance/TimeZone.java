package ru.progwards.java1.lessons.inheritance;

public class TimeZone {
    int hours;
    int minutes;
    public TimeZone(int hours){
        this.hours = hours;
        this.minutes = 0;
    }
    public TimeZone(int hours, int minutes){
        this.hours = hours;
        this.minutes = minutes;
    }
    public TimeZone getTimeZone(){
        return null;
    }

    public static void main(String[] args) {
        TimeZone zone1 = new TimeZone(-3,15);
        System.out.println(zone1.getTimeZone());
    }
}
