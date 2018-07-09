package com.epam.lab.task1_2;

import com.epam.lab.SomeClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class SomeClassMathOperationsTest {
    private static int number1;
    private static int number2;
    private static int number3;
    private static int[] numbers;

    @BeforeClass
    public static void init() {
        number1 = 4;
        number2 = 9;
        number3 = 2;
        numbers = new int[]{3, 2, 25, 5};
    }

    @Test
    public void testSum() {
        Assert.assertEquals(number1 + number2, SomeClass.sum(number1, number2));
        assertNotEquals(3 + 2 + 25, SomeClass.sum(numbers));
    }

    @Test
    public void testMultiply() {
        assertTrue(number1 * number2 * number3 == SomeClass.multiply(number1, number2, number3));
    }
}