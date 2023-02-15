package ru.progwards.java1.lessons.interfaces2;

import java.util.Arrays;
public class TestCompare {
    public static void main(String[] args) {
        Cow cow1 = new Cow("Пеструшка") {
            @Override
            public CompareResult compareWeight(CompareWeight smthHasWeight) {
                return null;
            }
        }; cow1.setWeight(350.0);
        Cow cow2 = new Cow("Рыжая") {
            @Override
            public CompareResult compareWeight(CompareWeight smthHasWeight) {
                return null;
            }
        }; cow2.setWeight(250.0);
        Duck duck1 = new Duck("Даша") {
            @Override
            public CompareResult compareWeight(CompareWeight smthHasWeight) {
                return null;
            }
        }; duck1.setWeight(3.0);
        Duck duck2 = new Duck("Маша") {
            @Override
            public CompareResult compareWeight(CompareWeight smthHasWeight) {
                return null;
            }
        }; duck2.setWeight(3.5);
        Hamster ham1 = new Hamster("Акакий") {
            @Override
            public CompareResult compareWeight(CompareWeight smthHasWeight) {
                return null;
            }
        }; ham1.setWeight(0.25);
        Hamster ham2 = new Hamster("Поликарп") {
            @Override
            public CompareResult compareWeight(CompareWeight smthHasWeight) {
                return null;
            }
        }; ham2.setWeight(0.32);
        Animal[]animals = new Animal[]{cow1, cow2, duck1, duck2, ham1, ham2};
        Arrays.sort(animals);
        System.out.println(Arrays.toString(animals));
    }
}
