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
        public ComplexNum add(ComplexNum num1,ComplexNum b){
            return new ComplexNum(num1.a+this.a,num1.b+this.b);
        }

        public ComplexNum sub(ComplexNum num1,ComplexNum b){
            return new ComplexNum(num1.a+this.a,num1.b+this.b);
        }
        public ComplexNum mul(ComplexNum num1,ComplexNum b){
            return new ComplexNum(num1.a+this.a,num1.b+this.b);
        }
        public ComplexNum div(ComplexNum num1, ComplexNum numb){
            return newComplexNum(num1.a+this.a,num1.b+this.b);
        }

        public static void main(String[] args) {

        }
    }
