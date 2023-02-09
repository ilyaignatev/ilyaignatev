package ru.progwards.java1.lessons.interfaces1;

public class Duck extends Animal {
    public Duck(String name, double weight) {
        super(name, weight);
    }

    public Duck(String name) {
        super(name);
    }

    @Override
    public String kind() {
        return "утка";
    }

    @Override
    public String say() {
        return "кря-кря";
    }

    @Override
    public FoodKind getFoodKind() {
        return FoodKind.CORN;
    }

    @Override
    public double getFoodCoeff() {
        return 0.04;
    }

    @Override
    public Color getColor() {
        return Color.GRAY;
    }
    @Override
    public double getWeight(){
        return weight;
    }
}
