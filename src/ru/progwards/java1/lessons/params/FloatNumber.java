package ru.progwards.java1.lessons.params;
import java.util.Arrays;

public class FloatNumber {
    boolean sign;
    long mantissa;
    int exp;

    FloatNumber(boolean sign, long mantissa, int exp){
        this.sign = sign;
        this.mantissa = mantissa;
        this.exp = exp;
    }

    public FloatNumber(String num) {
        char[] chars = num.toCharArray();
        if (chars[0] != '-') { // положительное число
            this.sign = true;
            int dot = num.indexOf(".");
            int ex = num.indexOf("E");

            if (ex != -1) {  //есть степень e
                char[] expArray = new char[chars.length - ex];
                System.arraycopy(chars, ex, expArray, 0, chars.length - exp - 1);
                char[] mantissaArray = new char[dot - ex];
                System.arraycopy(chars, dot, mantissaArray, 0, ex - dot);
                String expString = Arrays.toString(expArray);
                String mantissaString = Arrays.toString(mantissaArray);
                mantissa = Long.parseLong(mantissaString);
                exp = Integer.parseInt(expString);
            } else { // нет степени Е
                char[] mantissaArray = new char[chars.length - dot];
                System.arraycopy(chars, dot, mantissaArray, 0, chars.length - dot);
                String mantissaString = Arrays.toString(mantissaArray);
                mantissa = Long.parseLong(mantissaString);
            }
        } else { // отрицательное число
            this.sign = false;
            int dot = num.indexOf(".");
            int ex = num.indexOf("E");

            if (ex != -1) {  //есть степень e
                char[] expArray = new char[chars.length - ex];
                System.arraycopy(chars, ex, expArray, 0, chars.length - ex);
                char[] mantissaArray = new char[ex - dot];
                System.arraycopy(chars, dot, mantissaArray, 0, ex - dot);
                String expString = Arrays.toString(expArray);
                String mantissaString = Arrays.toString(mantissaArray);
                mantissa = Long.parseLong(mantissaString);
                exp = Integer.parseInt(expString);
            } else { // Нет степени Е
                char[] mantissaArray = new char[chars.length - dot];
                System.arraycopy(chars, dot, mantissaArray, 0, chars.length - dot);
                String mantissaString = Arrays.toString(mantissaArray);
                mantissa = Long.parseLong(mantissaString);
            }
        }
    }

    public String toString(){
        if(!sign)
            return "-" + mantissa + exp;
        return null;
    }

    public static void main(String[] args) {
        String str = "-123.456";
        FloatNumber fn3 = new FloatNumber("123.3Е3");
        System.out.println(fn3.toString());

    }
}