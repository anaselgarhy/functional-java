package com.anas.learning.javafun.optionals;

import java.util.Optional;

/**
 * @author <a href="https://github.com/anas-elgarhy">Anas Elgarhy</a>
 * @version 1.0
 * @since 17/09/2022
 */
public class _Optional {
    public static void main(String[] args) {
        final var op = Optional.ofNullable(null)
                .orElseGet(() -> "default value");
        System.out.println(op);

        Optional.ofNullable("hi")
                .ifPresent(System.out::println);

        Optional.ofNullable(null)
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("No value present")
                );
    }
}
