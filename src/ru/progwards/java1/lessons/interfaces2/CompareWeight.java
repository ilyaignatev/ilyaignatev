package ru.progwards.java1.lessons.interfaces2;

public interface CompareWeight {
    public enum CompareResult{
        LESS,
        EQUAL,
        GREATER,
    }
    CompareResult compareWeight(CompareWeight smthHasWeight);

    public double getWeight();

}
