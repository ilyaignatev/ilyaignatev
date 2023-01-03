package ru.progwards.java1.lessons.classescompare;

public abstract class Animal {
    String name;
    double weight;
    enum FoodKind{
        HAY,
        CORN,
    } // Перечисление еды
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
    public void setWeight(double weight){
        this.weight = weight;
    }// Вес животного
    public double getWeight(){
        return weight;
    }//Возвращает вес животного
    int compareTo(Animal animal){

        return 0;
    }
    public boolean equals(Object o){

        return false;
    } // Сранвение животных по параметрам имя,тип,вес
    abstract public FoodKind getFoodKind(); //Возвращает вид еды
    abstract public double getFoodCoeff(); // Возвращает коэф веса еды к телу
    public double calculateFoodWeight(){
        return weight * getFoodCoeff();
    }
    public double calculateFoodPrice(){
        int HAY = 1;
        int CORN = 15;
        return calculateFoodWeight() * HAY;
    }
    public static void main(String[] args) {

    }
}
