package ru.progwards.java1.lessons.interfaces2;

public class TestString {
    public static void print(ToString any){
        System.out.println(any.getString());
    }

    public static void main(String[] args) {
        Cow cow1 = new Cow("Пеструшка");
        Duck duck1 = new Duck("Даша");
        Hamster hamster1 = new Hamster("Поликарп");
        Time time1 = new Time(1,12,55);
        ComplexNum complexNum = new ComplexNum(22,5);
        System.out.println(cow1);
        System.out.println(duck1);
        System.out.println(hamster1);
        System.out.println(time1);
        System.out.println(complexNum);
    }
}
