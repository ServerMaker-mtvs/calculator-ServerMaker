package com.ohgiraffers;

public class MultiCalculator {
    public int multiTwoNumbers(int num1, int num2) {

        if (num1 > 100 || num2 > 100) {
            throw new IllegalArgumentException("숫자는 100을 초과할 수 없습니다.");
        } else if (num1 <= 0 || num2 <= 0) {
            throw new IllegalArgumentException("숫자는 0이거나 음수일 수 없습니다.");
        }

        return num1 * num2;
    }
}
