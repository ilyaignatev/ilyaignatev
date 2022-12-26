package ru.progwards.java1.lessons.inheritance;

public class ZonedTime extends Time{
TimeZone zone;
public ZonedTime(int hours, int minutes, int second){
    super(hours,minutes,second);
    TimeZone zone;
}
    public ZonedTime(int hours, int minutes, int seconds, TimeZone zone){
    this(hours,minutes,seconds);
    this.zone =zone;
    }
    public TimeZone getTimeZone(){
    return zone;
    }
    @Override
    public int secondsBetween(Time time){
    return Math.abs(hours * 60 * 60 + minutes * 60 + seconds);
    }
}
