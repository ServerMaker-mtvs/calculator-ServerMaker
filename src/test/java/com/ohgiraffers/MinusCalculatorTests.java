package com.ohgiraffers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MinusCalculatorTests {


    private MinusCalculator minusCalculator;

    @BeforeEach
    public void setUp() {
        this.minusCalculator = new MinusCalculator();
    }


    @DisplayName("30과 20을 넣었을 떄 10이라는 결과가 계산 되는 지 확인")
    @Test
    public void testMinusTwoNumbers() {

        // given
        int num1 = 30;
        int num2 = 20;

        // when
//        MinusCalculator minusCalculator = new MinusCalculator();
        int result = minusCalculator.minusTwoNumbers(num1, num2);

        // then
        Assertions.assertEquals(10, result);

    }

    @DisplayName("50과 30을 넣었을 때 20이라는 결과가 계산 되는 지 확인")
    @Test
    public void testMinusTwoNumbers2() {

        //given
        int num1 = 50;
        int num2 = 30;

        //when
//        MinusCalculator minusCalculator = new MinusCalculator();
        int result2 = minusCalculator.minusTwoNumbers(num1, num2);

        //then
        Assertions.assertEquals(20, result2);

    }
}
