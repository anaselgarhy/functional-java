package com.anas.learning.javafun.combinator.pattern;

import java.time.LocalDate;

/**
 * @author <a href="https://github.com/anas-elgarhy">Anas Elgarhy</a>
 * @version 1.0
 * @since 17/09/2022
 */
public class Main {
    public static void main(String[] args) {
        final var customer1 = new Customer(
                "Anas",
                "anas.elgarhy.dev@gmail.com",
                "01121125645",
                LocalDate.of(2003, 3, 26)
        );
        System.out.println(customer1);
        final var validator = CustomerRegistrationValidator.isEmailValid()
                .and(CustomerRegistrationValidator.isPhoneNumberValid())
                .and(CustomerRegistrationValidator.isAdult());
        System.out.println(validator.apply(customer1));

        final var customer2 = new Customer(
                "Hany",
                "hytR.com",
                "01096725645",
                LocalDate.of(2001, 3, 26)
        );
        System.out.println(customer2);
        System.out.println(validator.apply(customer2));
    }
}
