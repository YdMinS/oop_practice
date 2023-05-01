package com.ydmins;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 요구사항
 * 간단한 사칙연산을 할 수 있다.
 * 양수로만 계산할 수 있다.
 * 나눗셈에서 0을 나누면 IllegalArgument 예외를 발생시킨다.
 * MVC 패턴 (Model-View-Controller) 기반으로 구현한다.
 */
public class CalculatorTest {

    // 1 + 2 ---> Calculator
    // Calculator ---> 3
    @DisplayName("덧셈 연산을 정상적으로 수행한다.")
    @Test
    void additionTest() {
        int result = Calculator.calculate(1, "+", 2);

        Assertions.assertThat(result).isEqualTo(3);
    }
}
