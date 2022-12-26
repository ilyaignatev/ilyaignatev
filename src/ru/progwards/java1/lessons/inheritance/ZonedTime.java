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
        return Math.abs(getTimeZone().hours*3600 + getTimeZone().minutes * 60 + seconds - time.toSeconds());
    }

    public static void main(String[] args) {
        ZonedTime zt1 = new ZonedTime(6, 33, 8, new TimeZone(-1));
        ZonedTime zt2 = new ZonedTime(6, 33, 8, new TimeZone(2));
        System.out.println(zt1.secondsBetween(zt2));
        ZonedTime zt3 = new ZonedTime(18, 10, 43, new TimeZone(-2, 5));
        Time t4 = new Time(18, 40, 44);
        System.out.println(zt3.secondsBetween(t4));
    }
}

