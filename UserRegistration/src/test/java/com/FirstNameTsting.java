package com;

import UserRegistrationService.UserRegistrationImpl;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class FirstNameTesting {
    public String firstName;
    public Boolean expectedResult;

    public FirstNameTesting(String firstName, boolean expectedResult) {
        this.firstName = firstName;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(new Object[][]{
                {"Imman", true},
                {"jeeva", false},
                {"hi", false},
                {"immAn", false},
                {null, false},
                {" ", false}
        });
    }

    @Test
    public void givenfirstName_IsValidOrInvalid() throws UserRegistrationException {
        try {
            UserRegistrationImpl userImpl = new UserRegistrationImpl();
            userImpl.validateFirstName(this.firstName);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_FIRST_NAME, e.type);
        }
    }
}
