package com.ohgiraffers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PlusCalculatorTests {
    private PlusCalculator pluscalc;
    @BeforeEach
    public void setUp() {
        this.pluscalc = new PlusCalculator();
    }
    @DisplayName("두수의 합이 30이 되는지")
    @Test
    public void testSumTwoNumbers(){
        //given
        int num1=10;
        int num2=20;
        //when
        int result=pluscalc.plusTwoNumbers(num1,num2);
        //then
        Assertions.assertEquals(30,result);
    }
    @DisplayName("두 수가 1에서 100사이의 수인지")
    @Test
    public void testTwoNumbersInHundred(){
        //given
        int num1=20;
        int num2=0;
        //when&then

        Exception e=new Exception(Assertions.assertThrows(
                IllegalArgumentException.class,
                () ->pluscalc.plusTwoNumbers(num1,num2)
        ));
        e.printStackTrace();
    }
}
