package com.codebrat.geeksforgeeks.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class KadanesAlgorithmTest {

    KadanesAlgorithm kadanesAlgorithm = new KadanesAlgorithm();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,-2,5}, 5, 9),
                Arguments.of(new int[]{-1,-2,-3,-4}, 4, -1),
                Arguments.of(new int[]{-1}, 1, -1),
                Arguments.of(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}, 9, 6),
                Arguments.of(new int[]{-47, 43, 94, -94, -93, -59, 31, -86}, 8, 137)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    public void testBruteForce(int[] arr, int n, long expected) {
        long actual = kadanesAlgorithm.maxSubarraySumWithNegatives(arr, n);
        Assertions.assertEquals(expected, actual);
    }

}