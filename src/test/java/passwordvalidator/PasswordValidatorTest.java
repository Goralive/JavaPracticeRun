package passwordvalidator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PasswordValidatorTest {
    PasswordValidator validator = new PasswordValidator();

    User validUser = new User("Jayson", "QAZxsw123!");
    User invUserPassLength = new User("bob", "qazxswe");


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
}
