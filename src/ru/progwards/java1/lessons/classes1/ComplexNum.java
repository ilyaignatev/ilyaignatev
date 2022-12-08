package ru.progwards.java1.lessons.classes1;

public class ComplexNum {
    int a;
    int b;
    public ComplexNum(int a, int b){
        this.a = a;
        this.b = b;
    }
    public ComplexNum newComplexNum(int a, int b){
        return new ComplexNum(a,b);
    }
    public String toString(){
        return a + "+" + b + "i";
    }
    public ComplexNum add(ComplexNum num1, ComplexNum num2){
        return new ComplexNum (num1.a + num2.a, num1.b+num2.b);
    }
    public ComplexNum sub(ComplexNum num){
        ComplexNum num2 = new ComplexNum(3,5);
        return num2;
    }
    public ComplexNum mul(ComplexNum num){
        ComplexNum num3 = new ComplexNum(3,5);
        return num3;
    }
    public ComplexNum div(ComplexNum num){
        ComplexNum num4 = new ComplexNum(3,5);
        return num4;
    }
}
