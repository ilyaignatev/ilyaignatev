package ru.progwards.java1.lessons.params;

public class ArrayInteger {
    private byte[] digits;

    public ArrayInteger(int n) {
        digits = new byte[n];
    }

    public void fromString(String value) {
        int len = value.length();
        digits = new byte[len];
        for (int i = 0; i < len; i++) {
            digits[len - i - 1] = (byte) (value.charAt(i) - '0');
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(digits.length);
        for (int i = digits.length - 1; i >= 0; i--) {
            sb.append(digits[i]);
        }
        return sb.toString();
    }

    public boolean add(ArrayInteger num) {
        if (num.digits.length > digits.length) {
            return false;
        }
        byte carry = 0;
        for (int i = 0; i < digits.length; i++) {
            byte sum = carry;
            if (i < num.digits.length) {
                sum += num.digits[i];
            }
            if (i < digits.length) {
                sum += digits[i];
            }
            digits[i] = (byte) (sum % 10);
            carry = (byte) (sum / 10);
        }
        if (carry != 0) {
            digits = new byte[digits.length];
            return false;
        }
        return true;
    }
}