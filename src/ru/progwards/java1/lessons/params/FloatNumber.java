package ru.progwards.java1.lessons.params;

public class FloatNumber {
    boolean sign;
    long mantissa;
    int exp;

    public FloatNumber(boolean sign, long mantissa, int exp) {
        this.sign = sign;
        this.mantissa = mantissa;
        this.exp = exp;
    }

    FloatNumber(String num){
        num = num.trim().replace(",", "").replace(".", "");
        char[] cl = num.toCharArray();
        if(cl[0] == '-')
            sign = false;
        else
            sign = true;
        String r = "";
        String r0 = "";
        for (int i = sign ? 0 : 1; i < cl.length; i++){
            if(Character.isDigit(cl[i]))
                r += cl[i];
            else {
                for (int j = i+1; j < cl.length; j++){
                    r0 += cl[j];
                }
                break;
            }
        }
        mantissa = Long.parseLong(r);
        exp = Integer.parseInt(r0);
    }

    @Override
    public String toString() {
        String res = "";
        if(!sign)
            res += "-";
        char[] cl = Long.toString(mantissa).toCharArray();
        res += cl[0] + ".";
        for (int i = 1; i < cl.length; i++){
            res += cl[i];
        }
        if(exp != 0) {
            res += "E" + exp;
        }
        return res;
    }

    double toDouble(){
        return Double.parseDouble(this.toString());
    }

    void fromDouble(double num){
        FloatNumber res = new FloatNumber(Double.toString(num));
        this.sign = res.sign;
        this.mantissa = res.mantissa;
        this.exp = res.exp;
    }

    void negative(){
        sign = !sign;
    }

    FloatNumber add(FloatNumber num){
        System.out.println(this.toDouble());
        System.out.println(num.toString());
        System.out.println((this.toDouble() - num.toDouble()) + "");
        return new FloatNumber((this.toDouble() + num.toDouble()) + "");
    }

    FloatNumber sub(FloatNumber num){
        return new FloatNumber(String.format("%.3E", this.toDouble() - num.toDouble()));
    }

}