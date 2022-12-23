package ru.progwards.java1.lessons.inheritance;

public abstract class Duck extends Animal{
    public Duck(String name) {
        super(name);
    }
    @Override
    public String kind(){
        return "����";
    }
    public String say(){
        return "���-���";
    }
}
