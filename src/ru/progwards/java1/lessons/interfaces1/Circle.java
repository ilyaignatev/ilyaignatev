package ru.progwards.java1.lessons.interfaces1;

public class Circle implements Area{
    double diameter;
    public Circle(double diameter){
        this.diameter = diameter;
    }
    @Override
    public double getArea(){
        return Math.PI * diameter * diameter;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(3.5);
        System.out.println(c1.getArea());
    }
}
