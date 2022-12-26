package ru.progwards.java1.lessons.inheritance;
//Реализовать класс ZonedTime - время с учетом часового пояса, как потомка класса Time
//3.4 свойство
//TimeZone zone - часовой пояс
//
//3.5 конструктор
//public ZonedTime(int hours, int minutes, int seconds) - устанавливает значение времени из переданных параметров, и TimeZone как значение умолчанию, со сдвигом ноль от GMT
//
//3.6 конструктор
//public ZonedTime(int hours, int minutes, int seconds, TimeZone zone) - устанавливает значение времени из переданных параметров, и zone
//
//3.4 переопределить метод
//public TimeZone getTimeZone(), в данном классе должен возвращать zone
//
//3.5 переопределить метод public int secondsBetween(Time time), который возвращает количество секунд между 2-мя точками времени.(this и time) с учетом часового сдвига. Метод данного класса должен уметь принимать в качестве параметра экземпляры классов как Time, так и ZonedTime, для этого используйте метод getTimeZone() и учитывайте, что он может вернуть null.


public class ZonedTime extends Time{
    TimeZone zone;
    public ZonedTime(int hours, int minutes, int second){
        super(hours,minutes,second);
    }
    public ZonedTime(int hours, int minutes, int seconds, TimeZone zone){
        super(hours,minutes,seconds);
        this.zone =zone;
    }
    @Override
    public TimeZone getTimeZone(){
        return zone;
    }
    @Override
    public int secondsBetween(Time time){
        TimeZone zone1 = this.getTimeZone();
        TimeZone zone2 = time.getTimeZone();
        return super.secondsBetween(time) + Math.abs(zone1.hours * 60 * 60 + zone1.minutes * 60 - zone2.hours *60*60 + zone2.minutes * 60);
    }
}

