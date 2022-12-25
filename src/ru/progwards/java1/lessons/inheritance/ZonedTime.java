package ru.progwards.java1.lessons.inheritance;

public class ZonedTime extends Time{
    TimeZone zone;
    public ZonedTime(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public ZonedTime(int hours, int minutes, int seconds, TimeZone zone){
        super(hours, minutes, seconds);
        this.zone = zone;
    }
    public TimeZone getTimeZone(){
        return zone;
    }
    @Override
    public int secondsBetween(Time time){
        return getTimeZone().hours;
    }

}
