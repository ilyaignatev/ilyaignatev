package ru.progwards.java1.lessons.classes1;


public class ComplexNum {
    int a;
    int b;
    public ComplexNum(int a, int b){
        this.a = a;
        this.b = b;
    }
    public ComplexNum newComplexNum(int a, int b) {
        return new ComplexNum(a, b);
    }

    public String toString(){
        return a + "+" + b + "i";
    }
    public ComplexNum add(ComplexNum num){
        return new ComplexNum(num.a+this.a,num.b+this.b);
    }

    public ComplexNum sub(ComplexNum num){
        return new ComplexNum(num.a - 0, num .b + this.b);
    }
    public ComplexNum mul(ComplexNum num){
        return new ComplexNum(num.a * 0, num .a * this.b);
    }
    public ComplexNum div(ComplexNum num){
        ComplexNum num4 = new ComplexNum(3,5);
        return num4;
    }

    public static void main(String[] args) {

    }
}
