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
        int a = num.a, b = num.b, c = this.a, d = this.b;
        return new ComplexNum(a-c,b-d);
    }
    public ComplexNum mul(ComplexNum num){
        int a = this.a, b = this.b, c = num.a, d = num.b;
        return new ComplexNum(a*c-b*d,b*c + a*d);
    }
    public ComplexNum div(ComplexNum num){
        int a = this.a, b = num.b, c = this.b, d = num.a;

        return new ComplexNum((a*c+b*d)/(c*c+d*d), (b*c-a*d)/(c*c+d*d));
    }

    public static void main(String[] args) {
        ComplexNum a = new ComplexNum(99,1);
        System.out.println(a.sub(a));
        System.out.println(a.div(a));

    }
}