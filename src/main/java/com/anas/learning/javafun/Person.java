package com.anas.learning.javafun;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * @author <a href="https://github.com/anas-elgarhy">Anas Elgarhy</a>
 * @version 1.0
 * @since 16/09/2022
 */
@AllArgsConstructor
@Getter
@ToString
public class Person {
    private final String name;
    private final Gender gender;
}
