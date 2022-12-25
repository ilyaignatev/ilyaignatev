package ru.progwards.java1.lessons.inheritance;

public class TestAnimal {

    public static void printAnimal(Animal animal) {
        TestAnimal test = new TestAnimal();
        test.toString();

    }
    public static void main(String[] args) {
        Cow cow1 = new Cow("Пеструшка");
        System.out.println(cow1.toString() + " - " + cow1.say() + "!");
        Cow cow2 = new Cow("Рыжая");
        System.out.println(cow2.toString() + " - " + cow1.say() + "!");
        Duck duck1 = new Duck("Даша");
        System.out.println(duck1.toString() + " - " + duck1.say() + "!");
        Duck duck2 = new Duck("Маша");
        System.out.println(duck2.toString() + " - " + duck1.say() + "!");
        Hamster hamster1 = new Hamster("Акакий");
        System.out.println(hamster1.toString() + " - " + hamster1.say() + "!");
        Hamster hamster2 = new Hamster("Поликарп");
        System.out.println(hamster2.toString() + " - " + hamster1.say() + "!");
    }
}

