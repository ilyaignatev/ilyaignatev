package ru.progwards.java1.lessons.custing;

public class Figures {
    static final double PI = 3.14;
    public static double circle(double d){
        return 4 * PI * (d*2);
    }
    public static double square(double n){
        return n * n;
    }
    public static Double triangle(){
        double a = 10.0;
        double b = 10.0;
        double c = 5.0;
        double p = 0.5*(a + b + c);
        return Math.sqrt(p* (p - a) * (p - b) * (p - c));
    }
    public static double squareVsTraiange(double p){
        return  square()/triangle();
    }
    public static void main(String[] args) {
        System.out.println(circle(2.0));
        System.out.println(square(3.0));
        System.out.println(triangle());
        System.out.println(square());
    }
}
