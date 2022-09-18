package com.anas.learning.javafun.function;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author <a href="https://github.com/anas-elgarhy">Anas Elgarhy</a>
 * @version 1.0
 * @since 16/09/2022
 */
public class _BiFunction {
    public static void main(String[] args) {
        System.out.println(incrementByOneAndMultiplyBy10(4, 100));
        System.out.println(incrementByOneAndMultiplyBy10BiFunction.apply(4, 100)); // 4 + 1 = 5 * 100 = 500

        final var multiplyBy10 = (Function<Integer, Integer>) number -> number * 10;

        // we can use andThen to chain multiple functions
        int result = incrementByOneAndMultiplyBy10BiFunction
                .andThen(multiplyBy10)
                .apply(4, 100); // 4 + 1 = 5 * 100 = 500 * 10 = 5000
        System.out.println(result);

        // the compose method are not available in BiFunction
    }

    // The BiFunction interface has a single method called apply.
    // It takes two arguments and returns a result.
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBy10BiFunction =
            (numberToIncrementByOne, numberToMultiplyBy10) -> (numberToIncrementByOne + 1) * numberToMultiplyBy10;

    // same as

    static int incrementByOneAndMultiplyBy10(int numberToIncrementByOne, int numberToMultiplyBy10) {
        return (numberToIncrementByOne + 1) * numberToMultiplyBy10;
    }
}
