package ru.progwards.java1.lessons.inheritance;

public class ZonedTime extends Time{
    TimeZone zone;
    public ZonedTime(int hours, int minutes, int seconds){
        ZonedTime zone1 = new ZonedTime(7,13,7);
    }
    public ZonedTime(int hours, int minutes, int seconds, TimeZone zone){
        ZonedTime zone2 = new ZonedTime(12,49,57);
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
