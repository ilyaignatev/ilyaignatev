package ru.progwards.java1.lessons.inheritance;

public class TestAnimal {

    public static void printAnimal(Animal animal) {
        System.out.println(animal.toString() + " - " + animal.say() + "!");

    }
    public static void main(String[] args) {
        Cow cow1 = new Cow("Пеструшка");
        Cow cow2 = new Cow("Рыжая");
        Duck duck1 = new Duck("Даша");
        Duck duck2 = new Duck("Маша");
        Hamster hamster1 = new Hamster("Акакий");
        Hamster hamster2 = new Hamster("Поликарп");
        printAnimal(cow1);
        printAnimal(cow2);
        printAnimal(duck1);
        printAnimal(duck2);
        printAnimal(hamster1);
        printAnimal(hamster2);
    }
}

