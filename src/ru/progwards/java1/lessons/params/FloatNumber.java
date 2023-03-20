package ru.progwards.java1.lessons.params;

public class FloatNumber {
    boolean sign;
    long mantissa;
    int exp;
    FloatNumber(boolean sing, long mantissa, int exp){
        this.sign=sing;
        this.mantissa=mantissa;
        this.exp=exp;
    }
    FloatNumber(String num){
        char[] result = num.toCharArray();
        String tempStr1 = "",tempStr2 = "";
        if (result[0]== '-'){
            this.sign=false;
        }
        else this.sign=true;

        int j=0,point=0,tail=0;
        if ((result[0]== '-')||(result[0]== '+')) {
            for (int i = 1; i < result.length; i++) {
                if ((result[i] != 'E') & (result[i] != 'Å') & (result[i] != 'e')) {
                    if (result[i] == '.') {
                        point = i;
                        continue;
                    } else {
                        tempStr1 += result[i];
                        tail = i - point;
                    }
                } else {
                    j = i + 2;
                    break;
                }
            }
            this.mantissa = Long.parseLong(tempStr1);
            if ((j !=0) && (j < result.length)) {
                for (; j < result.length; j++) {
                    tempStr2 += result[j];
                }
            }
            else tempStr2 = "0";
            this.exp = Integer.parseInt(tempStr2);

            if (point != 0) {
                exp = exp - tail;
            }
        }
        else {
            for (int i = 0; i < result.length; i++) {
                if ((result[i] != 'E') & (result[i] != 'Å')& (result[i] != 'e')) {
                    if (result[i] == '.') {
                        point = i;
                        continue;
                    } else {
                        tempStr1 += result[i];
                        j = i + 2;
                        tail = i - point;
                    }
                }
                else break;
            }
            this.mantissa = Long.parseLong(tempStr1);

            if ((j !=0) && (j < result.length)) {
                for (; j < result.length; j++) {
                    tempStr2 += result[j];
                }
            }
            else tempStr2 = "0";
            this.exp = Integer.parseInt(tempStr2);
            if (point != 0) {
                exp = exp - tail;
            }
        }
    }
    @Override
    public String toString(){
        String first="",fin;
        int exp2=0;
        String q=String.valueOf(mantissa), rest=q.substring(1);
        char second = q.charAt(0);
        if (!sign) first="-";
        exp2=exp+rest.length();
        if (exp2!=0){
            fin= first+second+"."+rest+"E"+exp2;
        }
        else fin= first+second+"."+rest;
        return fin;
    }
    double toDouble(){
        double d;
        return d = Double.parseDouble(toString());
    }
    void fromDouble(double num){

        String vr = String.valueOf(num);
        new FloatNumber(vr);
    }
    void negative(){
        if (!sign){
            sign=true;
        }
        else sign=false;
    }
    FloatNumber add(FloatNumber num){
        double a =toDouble()+num.toDouble();
        String str= String.valueOf(a);
        return new FloatNumber(str);
    }
    FloatNumber sub(FloatNumber num){
        num.negative();
        return add(num);
    }
    public static void main(String[] args) {

    }
}
