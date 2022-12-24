package ru.progwards.java1.lessons.inheritance;

public class TestAnimal {

    public static void printAnimal(Animal animal) {


    }
    public static void main(String[] args) {
        Cow cow1 = new Cow("Пеструшка");
        System.out.println(cow1.toString());
        Cow cow2 = new Cow("Рыжая");
        System.out.println(cow2.toString());
        Duck duck1 = new Duck("Даша");
        System.out.println(duck1.toString());
        Duck duck2 = new Duck("Маша");
        System.out.println(duck2.toString());
        Hamster hamster1 = new Hamster("Акакий");
        System.out.println(hamster1.toString());
        Hamster hamster2 = new Hamster("Поликарп");
        System.out.println(hamster2.toString());
    }
}

