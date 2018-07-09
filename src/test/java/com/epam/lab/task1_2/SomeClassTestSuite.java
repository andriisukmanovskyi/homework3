package com.epam.lab.task1_2;

import com.epam.lab.Person;
import org.junit.ClassRule;
import org.junit.rules.ExternalResource;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({SomeClassMathOperationsTest.class, SomeClassPersonInfoTest.class})
public class SomeClassTestSuite {
}