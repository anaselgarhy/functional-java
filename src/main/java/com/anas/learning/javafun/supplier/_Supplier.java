package com.anas.learning.javafun.supplier;

import java.util.function.Supplier;

/**
 * @author <a href="https://github.com/anas-elgarhy">Anas Elgarhy</a>
 * @version 1.0
 * @since 16/09/2022
 */
public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl()); // jdbc://localhost:5432/users
        System.out.println(getDBConnectionUrlSupplier.get()); // jdbc://localhost:5432/users
    }

    // The Supplier interface has a single method called get.
    // It takes no arguments and returns a value.
    static Supplier<String> getDBConnectionUrlSupplier =
            () -> "jdbc://localhost:5432/users";

    // same as

    static String getDBConnectionUrl() {
        return "jdbc://localhost:5432/users";
    }
}
