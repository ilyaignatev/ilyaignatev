package ru.progwards.java1.lessons.interfaces2;

public abstract class Hamster extends Animal {
    public Hamster(String name, double weight) {
        super(name, weight);
    }

    public Hamster(String name) {
        super(name);
    }

    @Override
    public String kind() {
        return "хомяк";
    }

    @Override
    public String say() {
        return "хрум-хрум-хрум";
    }

    @Override
    public FoodKind getFoodKind() {
        return FoodKind.CORN;
    }

    @Override
    public double getFoodCoeff() {
        return 0.06;
    }

    @Override
    public Color getColor() {
        return Color.BEIGE;
    }
    @Override
    public double getWeight(){
        return weight;
    }
    @Override
    public String getHome(){ return "поле";}

    @Override
    public String getString() {
        return this.name;
    }
}
