package ru.progwards.java1.lessons.inheritance;

public abstract class Animal {
    String name;
    public Animal(String name){
        this.name = name;
    }

    public Animal() {
        say().toString();
    }

    public abstract String kind();
    public abstract String say();
    public String toString(){
        return "Это " + kind() + " " + name;
    }

    public static void main(String[] args) {

    }
}
