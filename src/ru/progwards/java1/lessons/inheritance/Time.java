package ru.progwards.java1.lessons.inheritance;

public abstract class Time {
    int hours;
    int minutes;
    int seconds;
    public Time(){
        hours = 0;
        minutes = 0;
        seconds = 0;
    }
    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public String toString(){
        return String.format("%02d:%02d:%02d", hours,minutes,seconds);
    }
    public int toSeconds(){

        return hours * 60 * 60 + minutes * 60 + seconds;
    }

    public abstract TimeZone getTimeZone();

    public int secondsBetween(Time time) {
        return Math.abs(this.hours * 60 * 60 + this.minutes * 60 + seconds - time.toSeconds());
    }
    public static void main(String[] args) {
    }
}
