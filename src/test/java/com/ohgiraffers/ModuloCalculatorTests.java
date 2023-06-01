package com.ohgiraffers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ModuloCalculatorTests {
    private ModuloCalculator moduloCalculator;

    // 검증 내용
    // 1. 10에서 0을 나누면 IllegalArgumentException 이 발생하는지 확인
    // 2. 36에서 5를 나누면 나머지가 1이 나오는지 확인
    // 3. 400에서 100을 나누면 IllegalArgumentException 이 발생하는지 확인
    // 4. 400에서 -2를 나누면 IllegalArgumentException 이 발생하는지 확인

    @BeforeEach
    public void setUp() {
        System.out.println("Test SetUp");
        this.moduloCalculator = new ModuloCalculator();
    }

    @DisplayName("나눌 수가 0이면 IllegalArgumentException 이 발생하는지 확인")
    @Test
    public void ZeroArgument() {
        // given
        int num1 = 10;
        int num2 = 0;

        Assertions.assertThrows(IllegalArgumentException.class, () -> moduloCalculator.ModuloTwoNumbers(num1, num2));
    }

    @DisplayName("36에서 5를 나누면 나머지가 1이 나오는지 확인")
    @Test
    public void NormalArgument() {
        // given
        int num1 = 36;
        int num2 = 5;

        // when
        int result = moduloCalculator.ModuloTwoNumbers(num1, num2);

        // then
        Assertions.assertEquals(1, result);

    }

    @DisplayName("하나의 수가 범위를 넘어가면 IllegalArgumentException 이 발생하는지 확인")
    @Test
    public void ExceedArgument() {
        int num1 = 400;
        int num2 = 100;

        Assertions.assertThrows(IllegalArgumentException.class, () -> moduloCalculator.ModuloTwoNumbers(num1, num2));
    }

    @DisplayName("두 개의 수가 범위를 넘어가면 IllegalArgumentException 이 발생하는지 확인")
    @Test
    public void ExceedTwoArgument() {
        int num1 = 400;
        int num2 = -2;

        Assertions.assertThrows(IllegalArgumentException.class, () -> moduloCalculator.ModuloTwoNumbers(num1, num2));
    }
}