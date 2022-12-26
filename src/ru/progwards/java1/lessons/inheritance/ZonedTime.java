package ru.progwards.java1.lessons.inheritance;

public class ZonedTime extends Time{
    TimeZone zone;
    public ZonedTime(int hours, int minutes, int second){
        super(hours,minutes,second);
        this.zone = new TimeZone(0);
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
        return Math.abs(getTimeZone().hours*3600 + getTimeZone().minutes * 60 + seconds - time.toSeconds());
    }

    public static void main(String[] args) {
        ZonedTime zt1 = new ZonedTime(4, 12, 23, new TimeZone(2));
        ZonedTime zt2 = new ZonedTime(7, 2, 11, new TimeZone(3));
        System.out.println(zt1.secondsBetween(zt2));
    }
}

