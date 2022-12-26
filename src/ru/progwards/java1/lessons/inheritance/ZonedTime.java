package ru.progwards.java1.lessons.inheritance;
//����������� ����� ZonedTime - ����� � ������ �������� �����, ��� ������� ������ Time
//3.4 ��������
//TimeZone zone - ������� ����
//
//3.5 �����������
//public ZonedTime(int hours, int minutes, int seconds) - ������������� �������� ������� �� ���������� ����������, � TimeZone ��� �������� ���������, �� ������� ���� �� GMT
//
//3.6 �����������
//public ZonedTime(int hours, int minutes, int seconds, TimeZone zone) - ������������� �������� ������� �� ���������� ����������, � zone
//
//3.4 �������������� �����
//public TimeZone getTimeZone(), � ������ ������ ������ ���������� zone
//
//3.5 �������������� ����� public int secondsBetween(Time time), ������� ���������� ���������� ������ ����� 2-�� ������� �������.(this � time) � ������ �������� ������. ����� ������� ������ ������ ����� ��������� � �������� ��������� ���������� ������� ��� Time, ��� � ZonedTime, ��� ����� ����������� ����� getTimeZone() � ����������, ��� �� ����� ������� null.


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
    @Override
    public TimeZone getTimeZone(){
    return zone;
    }
    @Override
    public int secondsBetween(Time time){
    return Math.abs(getTimeZone().hours * 60 * 60 + getTimeZone().minutes * 60 + seconds - time.toSeconds());
    }
}
