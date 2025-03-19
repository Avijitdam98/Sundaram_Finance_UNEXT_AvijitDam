package com.test;

import com.pack.MainClass;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    private MainClass obj;

    @BeforeAll
    public static void init() {
        System.out.println("Running AppTest...");
    }

    @BeforeEach
    public void setup() {
        obj = new MainClass();
    }

    @Test
    @Tag("addition")
    @DisplayName("Adding two numbers")
    public void testAddition(TestInfo testInfo) {
        System.out.println("Running: " + testInfo.getDisplayName());
        int actual = obj.addMeth(5, 6);
        int expected = 11;
        assertEquals(expected, actual);
    }

    @Disabled
    @Test
    @DisplayName("This test is disabled and will not run")
    public void testDisabled() {
        System.out.println("This test is disabled.");
    }

    @ParameterizedTest
    @Tag("addition")
    @CsvSource({"1,2,3", "4,5,9", "7,8,15"})
    @DisplayName("Parameterized test for addition with multiple values")
    public void testAdditionParameterized(int x, int y, int expected) {
        int actual = obj.addMeth(x, y);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @Tag("addition")
    @ValueSource(ints = {3, 5, 8})
    @DisplayName("Testing addition method with the same number")
    public void testAdditionWithSameNumber(int num) {
        int actual = obj.addMeth(num, num);
        int expected = num + num;
        assertEquals(expected, actual);
    }

    @RepeatedTest(3)
    @Tag("addition")
    @DisplayName("Repeated test for addMeth method")
    public void testAdditionRepeated() {
        int actual = obj.addMeth(5, 6);
        int expected = 11;
        assertEquals(expected, actual);
    }
}
