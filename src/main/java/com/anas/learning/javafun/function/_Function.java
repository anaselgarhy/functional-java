package com.anas.learning.javafun.function;

import java.util.function.Function;

/**
 * @author <a href="https://github.com/anas-elgarhy">Anas Elgarhy</a>
 * @version 1.0
 * @since 16/09/2022
 */
public class _Function {
    public static void main(String[] args) {
        // The Function interface has a single method called apply.
        // It takes one argument and returns a result.

        System.out.println(incrementByOne(1));
        System.out.println(incrementByOneFunction.apply(1));
        System.out.println();

        final Function<Integer, Integer> multiplyBy10 = number -> number * 10;
        int result = incrementByOneFunction.andThen(multiplyBy10).apply(1); // 1 + 1 = 2 * 10 = 20
        System.out.println(result);
        // we can use compose instead of andThen
        // the difference between andThen and compose is the order of execution
        // andThen will execute the function that passed to it first then the function that called it
        // compose will execute the function that called it first then the function that passed to it
        result = incrementByOneFunction.compose(multiplyBy10).apply(1); // 1 * 10 = 10 + 1 = 11
        System.out.println(result);

        result = incrementByOneFunction
                .andThen(multiplyBy10)
                .andThen(multiplyBy10)
                .andThen(multiplyBy10)
                .apply(1); // 1 + 1 = 2 * 10 = 20 * 10 = 200 * 10 = 2000
        System.out.println(result);

        result = incrementByOneFunction
                .compose(multiplyBy10)
                .compose(multiplyBy10)
                .compose(multiplyBy10)
                .apply(1); // 1 * 10 = 10 * 10 = 100 * 10 = 1000 + 1 = 1001
        System.out.println(result);
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
    // same as
    static int incrementByOne(int number) {
        return number + 1;
    }
}
