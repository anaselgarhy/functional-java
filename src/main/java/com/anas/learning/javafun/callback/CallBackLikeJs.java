package com.anas.learning.javafun.callback;

import java.util.function.Consumer;

/**
 * @author <a href="https://github.com/anas-elgarhy">Anas Elgarhy</a>
 * @version 1.0
 * @since 17/09/2022
 */
public class CallBackLikeJs {
    public static void main(String[] args) {
        doSomething("Anas", null, value -> System.out.println("No name provided for " + value));
        doSomething("Anas", "Elgarhy", value -> System.out.println("Hello " + value));
    }

    // Callbacks are functions that are to be executed after another function has finished executing hence the name ‘call back’.
    static void doSomething(final String fistName, final String lastName, final Consumer<String> callback) {
        System.out.println("Hello " + fistName);
        if (lastName != null) {
            System.out.println("Your last name is " + lastName);
        } else {
            callback.accept(fistName);
        }
    }
}
