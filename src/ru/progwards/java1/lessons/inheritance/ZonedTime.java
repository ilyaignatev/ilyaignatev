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
    public TimeZone getTimeZone(){
        return zone;
    }
    @Override
    public int secondsBetween(Time time){
        return Math.abs(this.hours * 60 * 60 + this.minutes * 60 + seconds - time.toSeconds());
    }

}
