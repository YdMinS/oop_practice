package com.ydmins;

import com.ydmins.calculate.*;

import java.util.List;

public class Calculator {
    private static final List<NewArithematicOperator> arithematicOperators = List.of(new AdditionOperator(),
            new SubtractionOperator(), new MultiplicationOperator(), new DivisionOperator());
    public static int calculate(int operand1, String operator, int operand2) {
        return arithematicOperators.stream()
                .filter(arithematicOperators -> arithematicOperators.supports(operator))
                .map(arithematicOperators -> arithematicOperators.calculate(operand1, operand2))
                .findFirst()
                .orElseThrow(()->new IllegalArgumentException("올바른 사칙연산이 아닙니다."));
    }
}
