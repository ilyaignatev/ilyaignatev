package ru.progwards.java1.lessons.inheritance;

public abstract class Cow extends Animal{
public Cow(String name) {
        super(name);
    }
    @Override
    public String kind(){
        return "корова";
    }
    public String say(){
        return "мууууууу";
    }
}
