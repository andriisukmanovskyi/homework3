package com.epam.lab.task1_2;

import com.epam.lab.Person;
import com.epam.lab.SomeClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;

public class SomeClassPersonInfoTest {
    private static Person person;

    @BeforeClass
    public static void init() {
        person = new Person("jerry", 6);
    }

    @Test
    public void testChangePersonInfo() {
        assertSame(person, SomeClass.changePersonInfo(person, "tom", 564));
        assertEquals("tom", person.getName());
        assertEquals(564, person.getAge());
    }

    @Test
    public void testMatch() {
        assertThat(person.getName(), startsWith("j"));
    }
}