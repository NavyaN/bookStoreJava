package com.weCode.bookStore.Service;

public class Calculator {
    public int add(int firstNumber, int secondNumber) {
        return firstNumber+ secondNumber;
    }

    public int div(int firstNumber, int secondNumber) {
        if(secondNumber == 0){
            throw new ArithmeticException("Failed to divide with zero");
        }
        return firstNumber/secondNumber;
    }
}
