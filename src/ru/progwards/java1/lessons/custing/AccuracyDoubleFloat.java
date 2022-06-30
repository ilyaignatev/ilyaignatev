package ru.progwards.java1.lessons.custing;

public class AccuracyDoubleFloat {
    public static double calculateAccuracy(){
        double d = 1.0/3.0;
        float f = (float) d;
        return d - f;
    }

    public static void main(String[] args) {
        System.out.println(calculateAccuracy());
    }
}
