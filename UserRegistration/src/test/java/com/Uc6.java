/**********************************************************************************************************************************************************************
 *
 * As a User need to follow pre-defined Password rules.
 * Rule1 –> minimum 8 Characters
 * Rule2 –> Should have at least 1 Upper Case Letter
 * NOTE – All rules must be passed
 *
 * @author : Immanuvel Jeeva
 * @since  : 01-08-2021
 *
 *********************************************************************************************************************************************************************/
package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Uc6 {

    @Test
    void whenPasswordGiven_CheckUpperCase_whenProper_ShouldreturnTrue() {
        UserRegistration userRegistration= new UserRegistration();
        boolean output = userRegistration.UpperCaseValidator("Immanuvel");
        Assertions.assertTrue(output);      // true
    }

    @Test
    void whenPasswordGiven_CheckUpperCase_whenNotProper_ShouldreturnFalse() {
        UserRegistration userRegistration= new UserRegistration();
        boolean output = userRegistration.UpperCaseValidator("imman");
        Assertions.assertFalse(output);     // false
    }
}
