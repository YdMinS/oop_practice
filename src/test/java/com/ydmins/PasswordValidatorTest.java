package com.ydmins;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

/**
 * 비밀번호는 8자 이상 12자 이하여야 한다.
 * 비밀번호가 8자 미만 또는 12자 초과인 경우 IllegalArgumentException 예외를 발생시킨다.
 * 경계조건에 대해 테스트 코드를 작성해야 한다.
 */
public class PasswordValidatorTest {

    @DisplayName("비밀번호가 8자 이상 12자 이하면 예외가 발생하지 않는다.")
    @Test
    void validatePasswordTest1(){
        assertThatCode(() -> PasswordValidator.validate("pass12345"))
                .doesNotThrowAnyException();
    }

    @DisplayName("비밀번호가 8자 미만 12자 초가면 IllegalArgumentException 예외가 발생한다.")
    @Test
    void validatePasswordTest2() {
        assertThatCode(()->PasswordValidator.validate("111")).isInstanceOf(IllegalArgumentException.class);
        assertThatCode(()->PasswordValidator.validate("1aw31241515151")).isInstanceOf(IllegalArgumentException.class);
    }
}
