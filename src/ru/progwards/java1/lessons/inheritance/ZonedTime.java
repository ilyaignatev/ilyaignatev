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
        int a;
        int b;
        if(getTimeZone() == null){
            a = toSeconds();
        }
        else{
            a = toSeconds() + zone.hours * 3600 + zone.minutes * 60;
        }
        b = time.toSeconds();
        return  a -b;
    }

    public static void main(String[] args) {
Time time = new Time(5,6,8);
Time time1 = new ZonedTime(7,5,8,new TimeZone(0));
        System.out.println(time.secondsBetween(time1));
    }
}

