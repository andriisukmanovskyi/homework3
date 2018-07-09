package com.epam.lab;

import com.epam.lab.Person;

import java.util.Arrays;

public class SomeClass {
    public static int sum(int... numbers) {
        return Arrays.stream(numbers).sum();
    }

    public static int multiply(int... numbers) {
        return Arrays.stream(numbers).reduce((left, right) -> left * right).getAsInt();
    }

    public static Person changePersonInfo(Person person, String name, int age) {
        person.setAge(age);
        person.setName(name);
        return person;
    }
}