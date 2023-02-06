package ru.progwards.java1.lessons.interfaces1;

public class Rectangle implements Area{
    double width;
    double length;
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    @Override
    public double getArea(){
        return width * length;
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(3.2,4.5);
        System.out.println(rect.getArea());
    }
}
