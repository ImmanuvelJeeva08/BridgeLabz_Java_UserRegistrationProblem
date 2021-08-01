/***********************************************************************************************************************************************************************
 *
 * As a User need to follow pre-defined Password rules.
 * Rule1 –> minimum 8 Characters
 * Rule2 –> Should have at least 1 Upper Case Letter
 * Rule3 –> Should have at least 1 numeric number in the password
 * NOTE – All rules must be passed
 *
 * @author : Immanuvel Jeeva
 * @since  : 01-08-2021
 *
 **********************************************************************************************************************************************************************/
package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Uc7 {

    @Test
    void whenPasswordGiven_CheckNumericValue_whenProper_ShouldreturnTrue() {
        UserRegistration userRegistration= new UserRegistration();
        boolean output = userRegistration.NumberValidator("Immanuvel08");
        Assertions.assertTrue(output);      // true
    }

    @Test
    void whenPasswordrGiven_CheckNumericValue_whenNotProper_ShouldreturnFalse() {
        UserRegistration userRegistration= new UserRegistration();
        boolean output = userRegistration.NumberValidator("imman");
        Assertions.assertFalse(output);     // false
    }
}
