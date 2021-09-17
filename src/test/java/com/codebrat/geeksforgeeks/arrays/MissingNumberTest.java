package com.codebrat.geeksforgeeks.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class MissingNumberTest {

    private static MissingNumber missingNumber = new MissingNumber();

    @Test
    public void testPositiveScenario() {
        int[] input = {1,2,3,5};
        int expected = 4;
        int actual = missingNumber.solution(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testNullPointerException() {
        assertThrows(NullPointerException.class, () -> {
            missingNumber.solution(null);
        });
    }

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,5}, 5, 4),
                Arguments.of(new int[]{6,1,2,8,3,4,7,10,5}, 10, 9)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    public void testMissingNumber(int[] arr, int n, int expected) {
        int actual = missingNumber.missingNumber(arr, n);
        Assertions.assertEquals(expected, actual);
    }


}