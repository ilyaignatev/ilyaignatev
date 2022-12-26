package ru.progwards.java1.lessons.inheritance;

public class ZonedTime extends Time{
    TimeZone zone;
    public ZonedTime(int hours, int minutes, int seconds){
        ZonedTime zone1 = new ZonedTime(7,13,7);
        this.zone = zone;
    }
    public ZonedTime(int hours, int minutes, int seconds, TimeZone zone){
        ZonedTime zone2 = new ZonedTime(12,49,57);
    }
    @Override
    public TimeZone getTimeZone(){
        return zone;
    }
    @Override
    public int secondsBetween(Time time){
        return 1;
    }

}
