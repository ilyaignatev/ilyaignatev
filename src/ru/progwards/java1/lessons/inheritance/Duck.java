package ru.progwards.java1.lessons.inheritance;

public abstract class Duck extends Animal{
    public Duck(String name) {
        super(name);
    }
    @Override
    public String kind(){
        return "утка";
    }
    public String say(){
        return "кря-кря";
    }
}
