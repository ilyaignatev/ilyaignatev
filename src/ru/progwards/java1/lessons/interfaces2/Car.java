package ru.progwards.java1.lessons.interfaces2;

public class Car implements CompareWeight{
    private double weight;
    public Car(double weight){
        this.weight = weight;
    }
    public double getWeight(){
        return weight;
    }
    @Override
    public CompareResult compareWeight(CompareWeight smthHasWeight){
        if(weight < smthHasWeight.getWeight()){
            return CompareResult.LESS;
        }
        else if(weight == smthHasWeight.getWeight()){
            return CompareResult.EQUAL;
        }
        else {
            return CompareResult.GREATER;
        }
    }
    public String toString(){
        return "Это автомобиль грузоподъемностью" + weight;
    }

    public static void main(String[] args) {
    }
}
