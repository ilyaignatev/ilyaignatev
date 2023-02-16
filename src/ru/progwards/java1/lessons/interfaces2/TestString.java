package ru.progwards.java1.lessons.interfaces2;

public class TestString {
    public static void print(ToString any){
        System.out.println(any.getString());
    }

    public static void main(String[] args) {
        print(new Cow("Пеструшка"));
        print(new Duck("Даша"));
        print(new Hamster("Поликарп"));
        print(new Time(1,12,55));
        print(new ComplexNum(22,5));
    }
}
