package ru.progwards.java1.lessons.interfaces2;

public abstract class Animal implements IColor, Comparable<Animal>, Home, ToString, CompareWeight {
    String name;
    double weight;

    enum FoodKind {
        HAY,
        CORN,
    }

    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
        say().toString();
    }

    public abstract String kind();

    public abstract String say();
@Override
    public String toString() {
        return "Это " + kind() + " " + this.name + " " + this.weight + " " + getColor();
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
    @Override
    public int compareTo(Animal animal) {
        return Double.compare(weight,animal.getWeight());
    }

    public boolean equals(Animal o) {

        return (this.name.equals(o.name))
                && (this.kind().equals(o.kind()))
                && (this.weight == o.weight);
    }

    abstract public FoodKind getFoodKind();

    abstract public double getFoodCoeff();

    public double calculateFoodWeight() {
        return weight * getFoodCoeff();
    }

    public double calculateFoodPrice() {
        int price;
        if (getFoodKind() == FoodKind.HAY) {
            price = 2;
        } else {
            price = 15;
        }
        return calculateFoodWeight() * price;
    }

    abstract public Color getColor();
    abstract public String getHome();
    @Override
    public String getString(){
        return this.toString();
    }

    public static void main(String[] args) {

    }
}
