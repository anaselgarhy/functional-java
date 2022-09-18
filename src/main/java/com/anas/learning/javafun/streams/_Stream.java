package com.anas.learning.javafun.streams;

import com.anas.learning.javafun.Person;

import java.util.List;
import java.util.stream.Collectors;

import static com.anas.learning.javafun.Gender.*;

/**
 * @author <a href="https://github.com/anas-elgarhy">Anas Elgarhy</a>
 * @version 1.0
 * @since 17/09/2022
 */
public class _Stream {
    public static void main(String[] args) {
        final var list = List.of(
                new Person("Anas", MALE),
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE)
        );

        list.stream()
                .map(person -> person.name())
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        list.stream()
                .map(Person::name) // method reference :: is the same as person -> person.name()
                .mapToInt(String::length) // method reference :: is the same as name -> name.length()
                .forEach(System.out::println); // iterate throw list and send an every element to that method

        boolean isAllFemale = list.stream()
                .allMatch(person -> person.gender().equals(FEMALE));
        System.out.println("isAllFemale = " + isAllFemale);

        final var containsFemale = list.stream()
                .anyMatch(person -> FEMALE.equals(person.gender()));
        System.out.println("containsFemale = " + containsFemale);

        final var isNotContainsZNName = list.stream()
                .noneMatch(person -> person.name().startsWith("Z"));
        System.out.println("isNotContainsZName = " + isNotContainsZNName);
    }
}
