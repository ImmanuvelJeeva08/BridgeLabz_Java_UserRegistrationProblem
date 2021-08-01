/***********************************************************************************************************************************************************************
 *
 * As a User need to follow pre-defined Password rules.
 * Rule1 –> minimum 8 Characters
 * NOTE – All rules must be passed
 *
 * @author : Immanuvel Jeeva
 * @since  : 01-08-2021
 *
 *********************************************************************************************************************************************************************/
package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Uc5 {

    @Test
    void whenPasswordGiven_CheckMin8Char_whenProper_ShouldreturnTrue() {
        UserRegistration userRegistration= new UserRegistration();
        boolean output = userRegistration.CharacterValidator("immanuvel");
        Assertions.assertTrue(output);      // true
    }

    @Test
    void whenPasswordGiven_CheckMin8Char_whenNotProper_ShouldreturnFalse() {
        UserRegistration userRegistration= new UserRegistration();
        boolean output = userRegistration.CharacterValidator("imman");
        Assertions.assertFalse(output);     // false
    }
}
