package ru.progwards.java1.lessons.inheritance;

public class ZonedTime extends Time{
    TimeZone zone;
    public ZonedTime(int hours, int minutes, int second){
        super(hours,minutes,second);
        this.zone = getTimeZone();
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
    public int secondsBetween(Time time) {
        TimeZone k1 = this.getTimeZone();
        TimeZone k2 = time.getTimeZone();
        int sdvigk1, sdvigk2;
        if (k1 == null) {
            sdvigk1 = 0;
        } else {
            sdvigk1 = Math.abs(k1.hours * 3600 + k1.minutes * 60);
        }
        if (k2 == null) {
            sdvigk2 = 0;
        } else {
            sdvigk2 = Math.abs(k2.hours * 3600 + k2.minutes * 60);
        }
        return super.secondsBetween(time) + Math.abs(sdvigk1 - sdvigk2);
    }

    public static void main(String[] args) {
        ZonedTime zt1 = new ZonedTime(4, 12, 23, new TimeZone(2));
        ZonedTime zt2 = new ZonedTime(7, 2, 11, new TimeZone(3));
        System.out.println(zt1.secondsBetween(zt2));
    }
}

