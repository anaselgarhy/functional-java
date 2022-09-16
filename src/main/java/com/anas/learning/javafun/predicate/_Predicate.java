package com.anas.learning.javafun.predicate;

import java.util.function.Predicate;

/**
 * @author <a href="https://github.com/anas-elgarhy">Anas Elgarhy</a>
 * @version 1.0
 * @since 16/09/2022
 */
public class _Predicate {
    public static void main(String[] args) {
        final var phoneNumber1 = "01121125645";
        System.out.println("Telephone number " + phoneNumber1 + " is valid: " + isPhoneNumberValid(phoneNumber1)); // true
        System.out.println("Telephone number " + phoneNumber1 + " is valid: " + isPhoneNumberValidPredicate.test(phoneNumber1)); // true

        final var phoneNumber2 = "1234567890";
        System.out.println("Telephone number " + phoneNumber2 + " is valid: " + isPhoneNumberValidPredicate.test(phoneNumber2)); // false

        // we can use the negate method to negate the result (!)
        System.out.println("Telephone number " + phoneNumber2 + " is valid: " + isPhoneNumberValidPredicate.negate().test(phoneNumber2)); // true

        // we can combine two predicates using the or & and methods
        System.out.println("Telephone number " + phoneNumber2 + " is valid: " + isPhoneNumberValidPredicate
                .and(isPhoneNumberValidPredicate).test(phoneNumber2)); // false
    }

    // The Predicate interface has a single method called test.
    // It takes one argument and returns a boolean.
    static Predicate<String> isPhoneNumberValidPredicate =
            phoneNumber -> phoneNumber.startsWith("01") && phoneNumber.length() == 11;

    // same as

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("01") && phoneNumber.length() == 11;
    }
}
