/**********************************************************************************************************************************************************************
 *
 * As a User need to follow pre-defined Mobile Format
 * - E.g. 91 9919819801 - Country code follow by space and 10 digit number
 *
 * @author : Immanuvel Jeeva
 * @since  : 01-08-2021
 *
 *********************************************************************************************************************************************************************/
package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Uc4 {

    @Test
    void whenMobileNumberGiven_whenProper_ShouldreturnTrue() {
        UserRegistration userRegistration= new UserRegistration();
        boolean output = userRegistration.PhoneNumberValidator("91 9791782633");
        Assertions.assertTrue(output);      // true
    }

    @Test
    void whenMobileNumberGiven_whenNotProper_ShouldreturnFalse() {
        UserRegistration userRegistration= new UserRegistration();
        boolean output = userRegistration.PhoneNumberValidator("91 28827");
        Assertions.assertFalse(output);     // false
    }
}
