package ru.progwards.java1.lessons.classescompare;

public class Cow extends Animal {
public Cow(String name) {
        super(name);
    }
    @Override
    public String kind() {
        return "корова";
    }
    @Override
    public String say(){
        return "мууууууу";
    }
    @Override
    public FoodKind getFoodKind(){
    return FoodKind.HAY;
    }
    @Override
    public double getFoodCoeff(){
    return 0.05;
    }
}
