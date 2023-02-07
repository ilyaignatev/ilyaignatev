package ru.progwards.java1.lessons.interfaces1;

public class Flower implements IColor {
    @Override
    public Animal.Color getColor(){
        return Animal.Color.WHITE;
    }
}
