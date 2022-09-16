package com.anas.learning.javafun.consumer;

import java.util.function.Consumer;

/**
 * @author <a href="https://github.com/anas-elgarhy">Anas Elgarhy</a>
 * @version 1.0
 * @since 16/09/2022
 */
public class _Consumer {
    public static void main(String[] args) {
        final var customer = new Customer("Anas", "123456789");
        greetCustomer(customer);
        greetCustomerConsumer.accept(customer);

        // we can use the andThen method to chain multiple consumers
        greetCustomerConsumer
                .andThen(greetCustomerConsumer)
                .andThen(greetCustomerConsumer)
                .accept(customer);
    }

    // The Consumer interface has a single method called accept.
    // It takes one argument and returns nothing.
    static Consumer<Customer> greetCustomerConsumer =
            customer ->
                    System.out.println("Hello " + customer.name() + ", thanks for registering phone number " + customer.phoneNumber());

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.name() + ", thanks for registering phone number " + customer.phoneNumber());
    }

}
