package passwordvalidator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordValidatorTest {
    PasswordValidator validator = new PasswordValidator();

    User validUser = new User("Jayson", "QAZxsw123!");
    User invUserPassLength = new User("bob", "qazxse1");
    User invLowerCasePass = new User("Bobby","QAZXSW4321$$");


    @Test
    public void passwordLengthTestPositive() {
        assertEquals(true, validator.passwordLength(validUser));
    }

    @Test
    public void passwordLgthNegative() {
        assertEquals(false, validator.passwordLength(invUserPassLength));
    }

    @Test
    public void isNameSameTestNegative() {
        assertEquals(false, validator.isSameUsername(validUser, validUser));
    }

    @Test
    public void isNameSameTestPositive() {
        assertEquals(true, validator.isSameUsername(invUserPassLength, validUser));
    }

    @Test
    public void isPasswordNotSamePositive() {
        assertEquals(true, validator.checkPassword(validUser, invUserPassLength));
    }

    @Test
    public void isUpperCasePositive () {
        assertEquals(true, validator.isUpperCase(validUser.getPassword()));
    }

    @Test
    public void isUpperCaseNegative () {
        assertEquals(false, validator.isUpperCase(invUserPassLength.getPassword()));
    }

    @Test
    public void isLowerCasePostive () {
        assertEquals(true, validator.isLowerCase(validUser.getPassword()));
    }

    @Test
    public void isLowerCaseNegative () {
        assertEquals(false, validator.isLowerCase(invLowerCasePass.getPassword()));
    }

    @Test
    public void isSpecialCharacterPositive () {
        assertEquals(true, validator.isSpecialCharacter(validUser.getPassword()));
    }

    @Test
    public void isSpecialCharacterNegative () {
        assertEquals(false, validator.isSpecialCharacter(invUserPassLength.getPassword()));
    }
}
