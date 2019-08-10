package passwordvalidator;

import org.junit.Assert;
import org.junit.Test;

public class PasswordValidatorTest {
    PasswordValidator validator = new PasswordValidator();

    @Test
    public void passwordLengthTestPositive () {
        Assert.assertEquals(true,validator.passwordLength(new User("bob","qazxswedc")));
    }

    @Test
    public void passwordLgthNegative () {

    }
}
