package ru.progwards.java1.lessons.useclasses;

public class ComplexNumTest {
    public static void main(String[] args) {
        ComplexNum num0 = new ComplexNum(0,0);
        ComplexNum num1 = new ComplexNum(1,1);
        ComplexNum num2 = new ComplexNum(-2,-2);
        ComplexNum num3 = new ComplexNum(3,-5);
        System.out.println("сумма num0 и num1 равна " + num0.add(num0));
        System.out.println("сумма num1 и num2 равна " + num1.add(num1));
    }
}
