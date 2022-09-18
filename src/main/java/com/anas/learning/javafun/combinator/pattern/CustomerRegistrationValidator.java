package com.anas.learning.javafun.combinator.pattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

/**
 * @author <a href="https://github.com/anas-elgarhy">Anas Elgarhy</a>
 * @version 1.0
 * @since 17/09/2022
 */
// combinator pattern
public interface CustomerRegistrationValidator extends Function<Customer, CustomerRegistrationValidator.ValidationResult> {
    enum ValidationResult {
        SUCCESS,
        PHONE_NUMBER_NOT_VALID,
        EMAIL_NOT_VALID,
        IS_NOT_AN_ADULT
    }

    static CustomerRegistrationValidator isEmailValid() {
        return customer -> customer.email().contains("@") ?
                ValidationResult.SUCCESS : ValidationResult.EMAIL_NOT_VALID;
    }

    static CustomerRegistrationValidator isPhoneNumberValid() {
        return customer -> customer.phoneNumber().startsWith("01") && customer.phoneNumber().length() == 11?
                ValidationResult.SUCCESS : ValidationResult.PHONE_NUMBER_NOT_VALID;
    }

    static CustomerRegistrationValidator isAdult() {
        return customer -> Period.between(customer.dateOfBirth(), LocalDate.now()).getYears() > 18 ?
                ValidationResult.SUCCESS : ValidationResult.IS_NOT_AN_ADULT;
    }

    default CustomerRegistrationValidator and(final CustomerRegistrationValidator other) {
        return customer -> {
            final var result = this.apply(customer);
            return result.equals(ValidationResult.SUCCESS) ? other.apply(customer) : result;
        };
    }
}
