package com.ohgiraffers;

public class MinusCalculator {


    public int minusTwoNumbers(int num1, int num2) {

        if(num1 > 100 && num1 < 0) {
            throw new IllegalArgumentException();
        } else if(num2 > 100 && num2 < 0) {
            throw new IllegalArgumentException();
        }

        return num1 - num2;
    }
}
