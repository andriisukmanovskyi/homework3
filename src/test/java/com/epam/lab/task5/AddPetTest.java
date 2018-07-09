package com.epam.lab.task5;

import com.epam.lab.Person;
import com.epam.lab.Pet;
import com.epam.lab.WrongPetInfoException;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddPetTest {
    private static Person person;

    @BeforeClass
    public static void init() {
        person = new Person("", 65);
    }

    @After
    public void clear() {
        person.getPets().clear();
    }

    @Test(expected = WrongPetInfoException.class)
    public void testAddPetExpectedException() throws WrongPetInfoException {
        person.addPet(new Pet("asd", -5));
    }

    @Test
    public void testAddPet() throws WrongPetInfoException {
        person.addPet(new Pet("asd", 5));
        assertEquals(1, person.getPets().size());
    }
}