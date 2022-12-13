package ru.progwards.java1.lessons.classes1;

    public class ComplexNum {
        int a;
        int b;
        public ComplexNum(int a, int b){
            this.a = a;
            this.b = b;
        }
        public ru.progwards.java1.lessons.classes1.ComplexNum newComplexNum(int a, int b) {
            return new ru.progwards.java1.lessons.classes1.ComplexNum(a, b);
        }
        @Override
        public String toString(){
            return a + "+" + b + "i";
        }
        public ru.progwards.java1.lessons.classes1.ComplexNum add(ru.progwards.java1.lessons.classes1.ComplexNum num1, ru.progwards.java1.lessons.classes1.ComplexNum num2){
            return new ru.progwards.java1.lessons.classes1.ComplexNum(num1.a+num2.a,num1.b+num2.b);
        }

        public ru.progwards.java1.lessons.classes1.ComplexNum sub(ru.progwards.java1.lessons.classes1.ComplexNum num1, ru.progwards.java1.lessons.classes1.ComplexNum num2){
            return new ru.progwards.java1.lessons.classes1.ComplexNum(num1.a - num2.a, num1.b - num2.b);
        }
        public ru.progwards.java1.lessons.classes1.ComplexNum mul(ru.progwards.java1.lessons.classes1.ComplexNum num1, ru.progwards.java1.lessons.classes1.ComplexNum num2){
            int a = num1.a, b = num1.b, c = num2.a, d = num2.b;
            return new ru.progwards.java1.lessons.classes1.ComplexNum(a * c - b * d , b * c + a *d);
        }
        public ru.progwards.java1.lessons.classes1.ComplexNum div(ru.progwards.java1.lessons.classes1.ComplexNum num1, ru.progwards.java1.lessons.classes1.ComplexNum num2){
            int a = num1.a, b = num1.b, c = num2.a, d = num2.b;
            return newComplexNum((a*c + b * d)/(c*c + d * d) , (b*c - a * d)/(c*c+d*d));
        }

        public static void main(String[] args) {

        }
    }
