package ru.progwards.java1.lessons.params;


public class FloatNumber {
    private boolean sign;
    private long mantissa;
    private int exp;
    private char[] a;

    public FloatNumber(boolean sign, long mantissa, int exp) {
        this.sign = sign;
        this.mantissa = mantissa;
        this.exp = exp;
    }

    private FloatNumber(String num) {
        a = num.toCharArray();
        sign = a[0] != '-';
        for (int i = 0; i < num.length() - 1; i++) {
            if (a[i] == '.') {
                exp = num.length() - i;
            }
            if (i >= exp) {
                a[i] = a[i + 1];
            }
            mantissa = Long.parseLong("" + a[i] + a[i + 1]);
        }
        System.out.println(mantissa);
    }

    public static void main(String[] args) {
        FloatNumber a = new FloatNumber("123");

    }
}
