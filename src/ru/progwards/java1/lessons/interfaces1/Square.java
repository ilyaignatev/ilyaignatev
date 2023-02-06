package ru.progwards.java1.lessons.interfaces1;



public class Square implements Area {
double segment;
public Square(double segment){
    this.segment = segment;
}

    @Override
    public double getArea() {
        return segment * segment;
    }

    public static void main(String[] args) {
        Square sq1 = new Square(2.2);
        System.out.println(sq1.getArea());
    }
}
