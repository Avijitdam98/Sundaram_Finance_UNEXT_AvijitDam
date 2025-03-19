package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void testMeth() {
        App obj = new App();
        int actual = obj.meth(10, 20);
        int expected = 30;
        assertEquals(expected, actual);
    }
}
