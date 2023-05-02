package com.ydmins.calculate;

public interface NewArithematicOperator {
    boolean supports(String operator);
    int calculate(int operand1, int perand2);
}
