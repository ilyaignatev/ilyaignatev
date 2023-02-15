package ru.progwards.java1.lessons.interfaces2;

public abstract class Car implements CompareWeight{
    private double weight;
    public Car(double weight){
        this.weight = weight;
    }

    @Override
    public CompareResult compareWeight(CompareWeight smthHasWeight) {
        if(this.weight < smthHasWeight.getWeight()){
            return CompareResult.LESS;
        }
        if(this.weight == smthHasWeight.getWeight()){
            return CompareResult.EQUAL;
        }
        else{
            return CompareResult.GREATER;
        }
    }


    public double getWeight(){
        return this.weight;
    }
    public String toString(){
        return "Это автомобиль грузоподъемностью " + this.weight;
    }
}
