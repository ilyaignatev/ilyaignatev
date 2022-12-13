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
        return new ComplexNum(this.a-num.b , this.b - num.a);
    }
    public ComplexNum mul(ComplexNum num){
        int a = num.a, b = this.a, c = num.b, d = this.b;
        return new ComplexNum(a*c-b*d,b*c + a*d);
    }
    public ComplexNum div(ComplexNum num){
        ComplexNum num4 = new ComplexNum(3,5);
        return num4;
    }

    public static void main(String[] args) {
        ComplexNum a = new ComplexNum(99,99);
        System.out.println(a.sub(a));

    }
}