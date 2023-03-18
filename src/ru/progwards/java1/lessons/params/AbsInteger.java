package ru.progwards.java1.lessons.params;

public class AbsInteger{
 private int num;
 public AbsInteger(){

 }
 public AbsInteger(int num){
     this.num = num;
 }
 public int get(){
     return num;
 }
 public String toString(){
     String str = String.valueOf(num);
     return str;
 }

    public static void main(String[] args) {

    }
}
