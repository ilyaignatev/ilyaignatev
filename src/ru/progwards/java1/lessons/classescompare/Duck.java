package ru.progwards.java1.lessons.classescompare;

public class Duck extends Animal {
    public Duck(String name) {
        super(name);
    }
    @Override
    public String kind(){
        return "утка";
    }
    @Override
    public String say(){
        return "кря-кря";
    }
    @Override
    public FoodKind getFoodKind(){
        return FoodKind.CORN;
    }
    @Override
    public double getFoodCoeff(){
        return 0.04;
    }
}
