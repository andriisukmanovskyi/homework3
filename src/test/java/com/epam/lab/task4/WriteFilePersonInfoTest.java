package com.epam.lab.task4;

import com.epam.lab.Person;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

public class WriteFilePersonInfoTest {
    private static Person person;

    @BeforeClass
    public static void init() {
        person = new Person("aaa", 65);
    }

    @Test
    public void testWriteFilePersonInfo() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = person.getClass().getDeclaredMethod("writeFilePersonInfo");
        method.setAccessible(true);
        method.invoke(person);
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(Person.FILE_NAME)))) {
            String line = bufferedReader.readLine();
            assertEquals("Name: " + person.getName() + "; Age: " + person.getAge(), line);
        } catch (IOException e) {
        }
    }
}