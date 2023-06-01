package com.ohgiraffers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MultiCalculatorTests {

    private MultiCalculator multiCalc;

    @BeforeEach
    public void setUp() {
        System.out.println("setUp 동작 확인...");
        this.multiCalc = new MultiCalculator();
    }


    // 검증 내용
    @DisplayName("10과 20을 넣었을 때 200이라는 결과가 계산되는지 확인")
    @Test
    public void testMultiTwoNumbers() {

        // given
        int num1 = 10;
        int num2 = 20;

        // when
        int result = multiCalc.multiTwoNumbers(num1, num2);

        // then (verify)
        Assertions.assertEquals(200, result);
    }

    @DisplayName("두 숫자 중 하나가 0 혹은 음수, 100을 초과하는 숫자를 넣었을 때 익셉션이 터지는지 확인")
    @Test
    public void testSumTwoNumbers2() {

        // given
        int num1 = 150;
        int num2 = 0;

        // when & then
        Assertions.assertThrows(
                IllegalArgumentException.class,
                ()-> multiCalc.multiTwoNumbers(num1, num2)
        );
    }

}
