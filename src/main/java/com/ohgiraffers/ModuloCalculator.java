package com.ohgiraffers;

public class ModuloCalculator {
    public int ModuloTwoNumbers(int num1, int num2) {
        checkZero(num2);
        checkRange(num1, num2);

        return num1 % num2;
    }
    private void checkZero(int num) {
        if (num == 0)
            throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
    }

    private void checkRange(int num1, int num2) {
        if ((1 > num1 || 100 < num1) || (1 > num2 || 100 < num2))
            throw new IllegalArgumentException("범위를 넘어간 숫자를 입력하셨습니다.");
    }
}