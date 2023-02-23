package ru.progwards.java1.lessons.interfaces2;

public class Cow extends Animal {
    public Cow(String name, double weight) {
        super(name, weight);
    }
    public Cow(String name){
        super(name);
    }
    @Override
    public String kind() {
        return "корова";
    }

    @Override
    public String say() {
        return "мууууууу";
    }

    @Override
    public FoodKind getFoodKind() {
        return FoodKind.HAY;
    }

    @Override
    public double getFoodCoeff() {
        return 0.05;
    }

    @Override
    public Color getColor() {
        return Color.RED;
    }
    @Override
    public double getWeight(){
        return weight;
    }
    @Override
    public String getHome(){ return "ферма"; }
    @Override
    public String getString(){
        return this.toString();
    }

}
