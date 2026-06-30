package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {

        int result = 5 + 3;

        assertEquals(8, result);
    }
}