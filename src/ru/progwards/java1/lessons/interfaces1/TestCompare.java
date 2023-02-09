package ru.progwards.java1.lessons.interfaces1;
import java.util.Arrays;
public class TestCompare {
    public static void main(String[] args) {
        Cow cow1 = new Cow("Пеструшка"); cow1.setWeight(350.0);
        Cow cow2 = new Cow("Рыжая"); cow2.setWeight(250.0);
        Duck duck1 = new Duck("Даша"); duck1.setWeight(3.0);
        Duck duck2 = new Duck("Маша"); duck2.setWeight(3.5);
        Hamster ham1 = new Hamster("Акакий"); ham1.setWeight(0.25);
        Hamster ham2 = new Hamster("Поликарп"); ham2.setWeight(0.32);
        Animal[]animals = new Animal[]{ham1,ham2,duck1,duck2,cow2,cow1};
        //Arrays.sort(animals);
        System.out.println(Arrays.toString(animals));
    }
}
