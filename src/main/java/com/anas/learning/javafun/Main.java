package com.anas.learning.javafun;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static com.anas.learning.javafun.Gender.*;

/**
 * @author <a href="https://github.com/anas-elgarhy">Anas Elgarhy</a>
 * @version 1.0
 * @since 16/09/2022
 */
public class Main {
    // psvm + tab to generate main method in intellij :D
    public static void main(final String[] args) {
        final var list = List.of(
                new Person("Anas", MALE),
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE)
        );

        list.stream()
                .filter(person -> person.getGender().equals(FEMALE)) // filer
                // .collect(Collectors.toList()) // collect the results of the stream to the list
                .forEach(System.out::println); // iterate throw list and send an every element to that method


        // or
        Predicate<Person> personPredicate = person -> person.getGender().equals(FEMALE);
        final List<?> females = list.stream() // ? = Person
                .filter(personPredicate) // filer the female
                .collect(Collectors.toList());

        females.forEach(System.out::println);

    }
}
