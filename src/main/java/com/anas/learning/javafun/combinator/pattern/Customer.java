package com.anas.learning.javafun.combinator.pattern;

import java.time.LocalDate;

/**
 * @author <a href="https://github.com/anas-elgarhy">Anas Elgarhy</a>
 * @version 1.0
 * @since 17/09/2022
 */
public record Customer(
        String name,
        String email,
        String phoneNumber,
        LocalDate dateOfBirth
) {
}
