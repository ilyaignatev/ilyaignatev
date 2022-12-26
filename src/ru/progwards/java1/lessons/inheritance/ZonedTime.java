package ru.progwards.java1.lessons.inheritance;

public class ZonedTime extends Time{
    TimeZone zone;
    public ZonedTime(int hours, int minutes, int second){
        super(hours,minutes,second);
    }
    public ZonedTime(int hours, int minutes, int seconds, TimeZone zone){
        super(hours, minutes, seconds);
        this.zone = zone;
    }
    @Override
    public TimeZone getTimeZone(){
        return zone;
    }
    @Override
    public int secondsBetween(Time time){
        return Math.abs(toSeconds() - time.toSeconds());
    }

    public static void main(String[] args) {

    }
}

