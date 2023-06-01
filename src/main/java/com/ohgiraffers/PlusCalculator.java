package com.ohgiraffers;

public class PlusCalculator {

    public int plusTwoNumbers(int num1, int num2) {
        checkHundred(num1, num2);

        return num1+num2;
    }

    private void checkHundred(int num1, int num2) {
        if( !(1<= num1 && num1 <=100) ){
            throw new IllegalArgumentException("첫번쨰 수가 정해진 범위를 초과합니다");
        } else if (!(1<= num2 && num2 <=100)) {
            throw new IllegalArgumentException("두번쨰 수가 정해진 범위를 초과합니다");
        }
    }
}
