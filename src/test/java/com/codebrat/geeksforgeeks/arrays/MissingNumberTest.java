package com.codebrat.geeksforgeeks.arrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MissingNumberTest {

    private static MissingNumber missingNumber;

    @Before
    public void setUp() throws Exception {
        missingNumber = new MissingNumber();
    }

    @Test
    public void testPositiveScenario() {
        int[] input = {1,2,3,5};
        int expected = 4;
        int actual = missingNumber.solution(input);
        assertEquals(expected, actual);
    }

    @Test (expected = NullPointerException.class)
    public void testNullPointerException() {
        int actual = missingNumber.solution(null);
        assertEquals(4, actual);
    }


}