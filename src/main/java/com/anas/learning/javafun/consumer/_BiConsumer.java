package com.anas.learning.javafun.consumer;

import java.util.function.BiConsumer;

/**
 * @author <a href="https://github.com/anas-elgarhy">Anas Elgarhy</a>
 * @version 1.0
 * @since 16/09/2022
 */
public class _BiConsumer {
    public static void main(String[] args) {
        final var customer = new Customer("Anas", "123456789");
        greetCustomer(customer, false);
        greetCustomerBiConsumer.accept(customer, false);

        // we can use the andThen method to chain multiple bi consumers
        greetCustomerBiConsumer.andThen(greetCustomerBiConsumer).accept(customer, true);
    }

    // The BiConsumer interface has a single method called accept.
    // It takes two arguments and returns nothing.
    static BiConsumer<Customer, Boolean> greetCustomerBiConsumer =
            (customer, showPhoneNumber) ->
                    System.out.println("Hello " + customer.name() + ", thanks for registering phone number " +
                            (showPhoneNumber ? customer.phoneNumber() : "**********"));

    // same as

    static void greetCustomer(Customer customer, boolean showPhoneNumber) {
        System.out.println("Hello " + customer.name() + ", thanks for registering phone number " +
                (showPhoneNumber ? customer.phoneNumber() : "**********"));
    }
}
