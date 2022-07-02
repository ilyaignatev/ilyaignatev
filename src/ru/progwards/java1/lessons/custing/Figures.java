package ru.progwards.java1.lessons.custing;

public class Figures {
    static final double PI = 3.14;
    public static double circle(double d){
        return 4 * PI * Math.pow((d/2),2);
    }
    public static double square(double n){
        return n * n;
    }
    public static Double triangle(double k){
        Double p = (k + k + k) / 2;
        return Math.sqrt(p * (p - k) * (p - k) * (p - k));
    }
    public static double squareVsTraiange(double p){
        return square(p)/triangle(p);
    }
    public static double squareVsCircle(double p){
        return square(p)/circle(p);
    }
    public static double triangleVsCircle(double p){
        return triangle(p)/circle(p);
    }
    public static void main(String[] args) {
        circle(2);
        square(2);
        triangle(2);
        squareVsTraiange(2);
        squareVsCircle(2);
        triangleVsCircle(2);
    }
}
