package ru.progwards.java1.lessons.interfaces1;

public class Hamster extends Animal {
    public Hamster(String name, double weight) {
        super(name,weight);
    }
    @Override
    public String kind(){
        return "хомяк";
    }
    @Override
    public String say(){
        return "хрум-хрум-хрум";
    }
    @Override
    public FoodKind getFoodKind(){
        return FoodKind.CORN;
    }
    @Override
    public double getFoodCoeff(){
        return 0.06;
    }
    @Override
    public Color getColor(){
        return Color.BEIGE;
    }

    public static void main(String[] args) {
        Hamster h1 = new Hamster("Акакий", 0.25);
        Hamster h2 = new Hamster("Поликарп", 0.32);
        System.out.println(h1);
    }
}
