package ru.progwards.java1.lessons.interfaces1;

public class Duck extends Animal {
    public Duck(String name, double weight) {
        super(name,weight);
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
    @Override
    public Color getColor(){
        return Color.GRAY;
    }

    public static void main(String[] args) {
        Duck d1 = new Duck("Даша", 3.0);
        Duck d2 = new Duck("Маша", 3.5);
        System.out.println(d1);
    }
}
