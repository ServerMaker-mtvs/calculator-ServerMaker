package com.ohgiraffers;

public class DivideCalculator {
    public int divideTwoNumber(int num1, int num2){
       CheckZero(num2); //0 체크
       CheckPositiveMax(num1, num2); //100보다 큰지 체크
       CheckPositiveMin(num1, num2); //1보다 작은지 체크

        return num1/num2; //연산
    }

    private static void CheckZero(int num2){//0 체크
        if (num2 == 0) {
            throw new IllegalArgumentException("0으로 나눌수 없습니다.");
        }
    }
    private static void CheckPositiveMax(int num1, int num2){//100보다 큰지 체크
        if(num1 >101||num2 > 101){
            throw new IllegalArgumentException("입력된 수가 100보다 크면 계산하지 않습니다.");
        }
    }
    private static void CheckPositiveMin(int num1, int num2){//1보다 작은지 체크
        if(num1 < 1||num2 < 1){
            throw new IllegalArgumentException("입력된 수가 1보다 작으면 계산하지 않습니다.");
        }
    }




}
