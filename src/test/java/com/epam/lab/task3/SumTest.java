package com.epam.lab.task3;

import com.epam.lab.SomeClass;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public class SumTest {

    private static final Logger LOG =
            LogManager.getLogger("com.epam.lab");

    @Rule
    public TestRule watcher = new TestWatcher() {
        @Override
        protected void failed(Throwable e, Description description) {
            LOG.error("Test {} was failed {}", description.toString(), e);
        }
    };

    private static int number1;
    private static int number2;

    @BeforeClass
    public static void init() {
        number1 = 4;
        number2 = 9;
    }

    @Test
    public void testSum() {
        System.out.println("test");
        Assert.assertEquals(number1 + number2, SomeClass.sum(++number1, ++number2));
    }
}