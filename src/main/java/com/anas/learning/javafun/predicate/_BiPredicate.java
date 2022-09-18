package com.anas.learning.javafun.predicate;

import java.util.function.BiPredicate;

/**
 * @author <a href="https://github.com/anas-elgarhy">Anas Elgarhy</a>
 * @version 1.0
 * @since 16/09/2022
 */
public class _BiPredicate {
    public static void main(String[] args) {
        System.out.println(areEqual(4, 4)); // true
        System.out.println(areEqualBiPredicate.test(4, 4)); // true

        // we can use the negate method to negate the result (!)
        System.out.println(areEqualBiPredicate.negate().test(4, 4)); // false

        // we can combine two predicates using the or & and methods
        System.out.println(areEqualBiPredicate.and(areEqualBiPredicate.negate()).test(4, 4)); // false
        System.out.println(areEqualBiPredicate.or(areEqualBiPredicate.negate()).test(4, 4)); // true
    }

    // The BiPredicate interface has a single method called test.
    // It takes two arguments and returns a boolean.
    static BiPredicate<Integer, Integer> areEqualBiPredicate = (number1, number2) -> number1.equals(number2);

    // same as

    static boolean areEqual(int number1, int number2) {
        return number1 == number2;
    }
}
