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
 static AbsInteger add(AbsInteger num1, AbsInteger num2){
     AbsInteger result = new AbsInteger(num1.get() + num2.get());
     if ((result.get()<=127)&&(result.get()>=-128)){
         ByteInteger res1 = new ByteInteger((byte) result.get());
         result=res1;
     }
     if (((result.get()>127)&&(result.get()<=32767))||((result.get()>=-32768)&&(result.get()<-128))){
         ShortInteger res2 = new ShortInteger((short) result.get());
         result=res2;
     }
     if (((result.get()>32767)&&(result.get()<=2147483647))||((result.get()>=-2147483648)&&(result.get()<-32768))){
         IntInteger res3 = new IntInteger(result.get());
         result=res3;
     }
     return result;
 }

    public static void main(String[] args) {

    }
}
