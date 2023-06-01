package com.ohgiraffers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DivideCalculatorTest {
    private DivideCalculator divideCal;

    @BeforeEach
    public void setUp(){
        this.divideCal=new DivideCalculator();
    }
    // 검증내용
    //    1. 두 수 1~100까지 사이의 수만 계산함 (50 , 5) == 10 확인
    //    2. 두 수가 범위를 초과할 경우 IllegalArgumentException을 발생함 (110,10) 에러 확인
    //    3. 나눌 수 가 0이 되면 IllegalArgumentException을 발생함 (0으로 나눌수 없습니다)

    @DisplayName("두 수 1~100까지 사이의 수만 계산함 (50 , 5) == 10 확인")
    @Test
    public void testBigArgument(){

        //given
        int num1=50;
        int num2=5;

        //when
        int result= divideCal.divideTwoNumber(num1,num2);

        //then
        Assertions.assertEquals(10,result);
    }
    @DisplayName("두 수가 범위를 초과할 경우  IllegalArgumentException 발생 ")
    @Test
    public void testRangeArgument(){

        //given
        int num1=102;
        int num2=5;
        int num3=103;
        int num4=5;

        //when
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () ->divideCal.divideTwoNumber(num1,num2)
        );
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () ->divideCal.divideTwoNumber(num3,num4)
        );
        //then

    }
    @DisplayName("나눌 수 가 0이 되면 IllegalArgumentException을 발생함 (0으로 나눌수 없습니다)")
    @Test
    public void testZeroArgument(){

        //given
        int num1=10;
        int num2=0;

        //when
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () ->divideCal.divideTwoNumber(num1,num2)
        );

        //then

    }
}
